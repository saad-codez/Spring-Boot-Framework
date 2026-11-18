package com.SpringBoot.StartingSpringBoot;

import com.SpringBoot.StartingSpringBoot.DI.Car;
import com.SpringBoot.StartingSpringBoot.DI.SmartPhone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartingSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StartingSpringBootApplication.class, args);
		Car car = context.getBean(Car.class);
		System.out.println("Project Starting...");
		car.carStart();
		System.out.println();

		SmartPhone phone = context.getBean(SmartPhone.class);
		phone.switchOn();
	}

}
