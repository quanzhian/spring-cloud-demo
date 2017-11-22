package com.rjhy.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulServerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new SpringApplicationBuilder(ConsulServerApp.class).web(true).run(args);
	}
	@RequestMapping("/hi")
    public String home() {
        return "hi ,i'm miya";
    }
}
