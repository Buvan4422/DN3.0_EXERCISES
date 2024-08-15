package com.ems.exercise10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Exercise10Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise10Application.class, args);
	}

}
