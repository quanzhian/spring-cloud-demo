package com.rjhy.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@EnableRedisHttpSession  
public class HttpSessionConfig {  	
	
	@Value("${redis.hostname:localhost}")
	String HostName;
	@Value("${redis.port:6379}")
	int Port;
	
    @Bean  
    public JedisConnectionFactory connectionFactory() {  
    	JedisConnectionFactory connection = new JedisConnectionFactory();
		connection.setPort(Port);
		connection.setHostName(HostName);
		return connection;
    }
}