package com.rjhy.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(ConsumerAPP.class).web(true).run(args);
	}

}
