package com.rjhy.cloud.hystrix_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.HystrixCircuitBreaker;
import com.netflix.hystrix.HystrixCommandKey;

@RestController
public class HFClientController {

	@Autowired
	private HFClient consumerClient;
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String hello() {
		return consumerClient.hello();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/toHello")
	public String toHello() {
		String result = consumerClient.toHello();		
		HystrixCircuitBreaker breaker = HystrixCircuitBreaker.Factory
				.getInstance(HystrixCommandKey.Factory
						.asKey("HelloClient#toHello()"));	
		System.out.println("断路器状态:" + breaker.isOpen());
		return result;
	}
	
}
