package com.rjhy.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    new SpringApplicationBuilder(TurbineApp.class).web(true).run(args);
	}

}
