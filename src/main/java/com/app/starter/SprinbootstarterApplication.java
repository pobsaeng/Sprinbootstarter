package com.app.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app")
public class SprinbootstarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootstarterApplication.class, args);
	}
}
