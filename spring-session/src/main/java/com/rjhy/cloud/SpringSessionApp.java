package com.rjhy.cloud;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringSessionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String port = scan.nextLine();
		new SpringApplicationBuilder(SpringSessionApp.class).properties("server.port=" + port).run(args);
	
	}

}
