package com.scp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootConfigPropertiesApplication {

	public static void main(String[] args) {

		//-Dspring.profiles.active=e1
		//System.setProperty("spring.profiles.active", "e1");
		SpringApplication.run(SpringbootConfigPropertiesApplication.class, args);
	}

}
