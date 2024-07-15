package com.neoteric.dynamicproxyaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DynamicproxyaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicproxyaopApplication.class, args);
	}

}
