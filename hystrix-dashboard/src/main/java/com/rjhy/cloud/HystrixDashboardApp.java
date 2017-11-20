package com.rjhy.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SpringApplicationBuilder(HystrixDashboardApp.class).properties("server.port=10001").run(args);
	}

}