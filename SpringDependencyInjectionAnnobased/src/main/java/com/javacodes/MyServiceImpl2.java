package com.javacodes;

import org.springframework.stereotype.Component;

@Component("service")
public class MyServiceImpl2 implements MyService {

	@Override
	public String getInfo() {
		return "Service2s Information";
	}

}
