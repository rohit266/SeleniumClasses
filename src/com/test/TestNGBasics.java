package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	//Pre-conditions annotations -- starting with @Before
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- launch chrome Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass -- login to app");
	}
	
	
//	@BeforeSuite -- setup system property for chrome
//	@BeforeTest -- launch chrome Browser
//	@BeforeClass -- login to app 
	
//	@BeforeMethod Enter URL
//	@Test -- google Logo test
//	@AfterMethod -- logout from app
	
//	@BeforeMethod Enter URL
//	@Test -- Google Title Test
//	@AfterMethod -- logout from app
	
//	@BeforeMethod Enter URL
//	@Test -- search test
//	@AfterMethod -- logout from app
	
//	@AfterClass -- Close Browser
//	@AfterTest -- deleteAllCookies
//	PASSED: searchTest
//	PASSED: googleLogotest
//	PASSED: googleTitleTest
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod Enter URL");
	}
	
	
	//Test Cases--Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test -- Google Title Test");
	}
	
	
	@Test 
	public void searchTest() {
		System.out.println("@Test -- search test");
	}
	
	@Test 
	public void googleLogotest() {
		System.out.println("@Test -- google Logo test");
	}
	
	//Post conditions -- starting with @After
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod -- logout from app");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	
	@AfterTest //8
	public void deletAllCookies() {
		System.out.println("@AfterTest -- deleteAllCookies");
	}
	

	/*
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	*/
	

}
