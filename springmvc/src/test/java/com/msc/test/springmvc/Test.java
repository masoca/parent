package com.msc.test.springmvc;

import javax.annotation.Resource;

import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.msc.test.springmvc.service.TestService;

public class Test extends AbstractJUnit4SpringContextTests{
	
	@Resource
	private TestService testService;
	
	@org.junit.Test
	public void testName() throws Exception {
		testService.sayHello();
	}
	
	public static void main(String[] args) {
		System.out.println(105l*(9000l/10000));
	}

}
