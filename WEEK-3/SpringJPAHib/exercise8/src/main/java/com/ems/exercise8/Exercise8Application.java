package com.ems.exercise8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Exercise8Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise8Application.class, args);
	}

}
