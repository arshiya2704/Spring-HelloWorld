package com.example.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloworldApplication {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Greeting greeting = (Greeting) context.getBean("greeter");
		System.out.println();greeting.getGreeting();
	}
}
