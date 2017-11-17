package com.rjhy.cloud;

import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderAPP {

	public static void main(String[] args) {
		// 按照输入端口启动
		Scanner scan = new Scanner(System.in);
		// 读取控制台的端口输入
		String port = scan.nextLine();
		new SpringApplicationBuilder(ProviderAPP.class).properties("server.port=" + port).run(args);
	
		// 按照配置端口启动
		//new SpringApplicationBuilder(ProviderAPP.class).web(true).run(args);
	}

}
