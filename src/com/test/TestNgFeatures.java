package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i=9/0;
	}
	
	//"dependsOnMethods" is used when one or more then one method is dependent on any method,
	//It mean if the first method is passed then dependent method will run else if first method is fail then 
	//depend method will not run.
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("Reg Page Test");
	}
	
	
	
}
