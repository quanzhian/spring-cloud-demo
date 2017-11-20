package com.rjhy.cloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rjhy.cloud.Member;

@RestController
public class HystrixController {

	@Autowired
	private HystrixService hystrixService;

	@RequestMapping(value = "/hystrix", method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Member router() {
		return hystrixService.getMember(1);
	}
}
