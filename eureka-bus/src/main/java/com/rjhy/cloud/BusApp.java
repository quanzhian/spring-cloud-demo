package com.rjhy.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(BusApp.class).run(args);
	}

}
