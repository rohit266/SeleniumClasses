package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	//invocationCount:- When we want to run any method more then one time the we use "invocationCount" method.
	@Test(invocationCount=10)
	public void Sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is====="+c);
	}
	
	
	
}
