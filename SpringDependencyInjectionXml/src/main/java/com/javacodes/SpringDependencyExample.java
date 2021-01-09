package com.javacodes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

	public static void main(String[] args) {
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Client client = (Client) appContext.getBean("client1");
		client.doSomething();
		Client client2 = (Client) appContext.getBean("client2");
		client2.doSomething();
	}

}
