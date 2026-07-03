package com.example.firstLesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstLessonApplication {

	public static void main(String[] args) {

		// We are assuming there is the obj exist in the container
		// Spring by default doesnot create the object of all the classes
		// We cant let the jvm take all the burden of 1000 of classes

		// So spring says am not gonna create the object of all the classes you tell me which classes obj needed


		//Dependency Injection (DI) in Spring Boot is a design pattern where objects don't create their own dependencies;
		// instead, the Spring container creates and "injects" them.

	ApplicationContext context = SpringApplication.run(FirstLessonApplication.class, args);

	dev d1 = context.getBean(dev.class);
	d1.build();

		/*
		SpringApplication.run(FirstLessonApplication.class, args);

		dev d1 = new dev(); // Creating a object of the non-static class to access them here
		d1.build(); // Calling the method using the object here	*/

	}

}
