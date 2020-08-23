package com.flight.china;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class application {

	public static void main(String[] args) {
		SpringApplication.run(application.class, args);
	}
	
}
