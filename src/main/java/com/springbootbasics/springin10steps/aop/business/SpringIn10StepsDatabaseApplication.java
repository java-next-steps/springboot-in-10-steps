package com.springbootbasics.springin10steps.aop.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsDatabaseApplication implements CommandLineRunner {

	Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsDatabaseApplication.class);
	@Autowired
	BusinessService1 businessService1;

	@Autowired
	BusinessService2 businessService2;

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsDatabaseApplication.class, args);
	}

	//Invoked as soon as the application is launched.
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.businessService1.calculateSomething());
		System.out.println(this.businessService2.calculateSomething());
	}
}
