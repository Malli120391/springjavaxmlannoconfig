package com.javacodes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDependencyInjectionExample {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class); 
		
		Client client1 = (Client) appContext.getBean("client1");
		client1.doSomething();
		
		Client client2 = (Client) appContext.getBean("client2");
		client2.doSomething();
		
		Service service = (Service) appContext.getBean("srv");
		System.out.println(service.getInfo());
	}

}
