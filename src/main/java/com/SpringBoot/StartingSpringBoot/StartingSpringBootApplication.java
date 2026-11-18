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

		// singleton bean scope
		Car c1 = context.getBean(Car.class);
		Car c2 = context.getBean(Car.class);
		if (c1 == c2) {
			System.out.println("They both are same because there is only one Car object Created by IOC");
		}
		else {
			System.out.println("They are different objects");
		}

		//prototype bean scope
		SmartPhone s1 = context.getBean(SmartPhone.class);
		SmartPhone s2 = context.getBean(SmartPhone.class);
		if (s1 == s2) {
			System.out.println("They both are same because there is only one Smartphone object Created by IOC");
		}
		else {
			System.out.println("They are different objects");
		}


	}

}
