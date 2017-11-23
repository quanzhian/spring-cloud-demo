package com.rjhy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SecurityOauthAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SecurityOauthAPP.class, args);
	}

}
