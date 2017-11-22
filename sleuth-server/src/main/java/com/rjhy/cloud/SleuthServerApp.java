package com.rjhy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class SleuthServerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(SleuthServerApp.class, args);
	}

}
