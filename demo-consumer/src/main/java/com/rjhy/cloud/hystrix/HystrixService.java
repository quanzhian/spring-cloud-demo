package com.rjhy.cloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.rjhy.cloud.Member;

@Service
//@DefaultProperties(defaultFallback = "getMemberFallback")
public class HystrixService {
	@Autowired
	private RestTemplate restTpl;

	@HystrixCommand(fallbackMethod = "getMemberFallback", groupKey = "MemberGroup", commandKey = "MemberCommandKey", 
			commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	}, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "2")
	})
	public Member getMember(Integer id) {
		/*try {  				//测试熔断，如果实验超过1秒则走getMemberFallback 回滚流程
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}*/
		
		Member member = restTpl.getForObject(
				"http://eureka-config-provider/call/{id}", Member.class, id);
		return member;
	}

	public Member getMemberFallback(Integer id) {
		Member m = new Member();
		m.setId(1);
		m.setName("error member");
		return m;
	}
}
