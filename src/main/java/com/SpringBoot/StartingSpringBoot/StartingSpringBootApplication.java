package com.SpringBoot.StartingSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StartingSpringBootApplication.class, args);
		Car car = context.getBean(Car.class);
		car.carStart();
	}

}
