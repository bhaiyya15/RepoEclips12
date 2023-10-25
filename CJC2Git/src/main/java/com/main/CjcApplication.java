package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CjcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjcApplication.class, args);
	}
	
	
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate r=new RestTemplate();
		return r;
	}

}
