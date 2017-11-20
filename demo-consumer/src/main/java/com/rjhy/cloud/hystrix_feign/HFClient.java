package com.rjhy.cloud.hystrix_feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-config-provider", fallback = HFClientFallback.class)
public interface HFClient {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String hello();
	
	@RequestMapping(method = RequestMethod.GET, value = "/toHello")
	public String toHello();
	
}
