package com.rjhy.cloud.hystrix_feign;

import org.springframework.stereotype.Component;

@Component
public class HFClientFallback implements HFClient {
	public String hello() {
		return "fallback hello";
	}

	public String toHello() {
		return "fallback timeout hello";
	}
}
