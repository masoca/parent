package com.msc.test.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	public void sayHello() {
		System.out.println("Hello world!");

	}

}
