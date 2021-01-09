package com.javacodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client2")
public class MyClientImpl2 implements MyClient {
	
	
	  @Autowired
	  private MyService service;
	 

	@Override
	public void doSomething() {
		String info = service.getInfo();
		System.out.println(info);

	}

}
