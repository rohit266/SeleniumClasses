package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); //Launch Chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	
	@Test(priority=1, groups="title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority=3, groups="Logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println("Image displayed:"+' '+ b);
	}
	
	
	@Test(priority=2, groups="Link Test")
	public void mailLinkTest() {
		//boolean b = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']")).isDisplayed();
		//System.out.println("Link displayed:"+' '+ b);
		
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("test2");
	}
	
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("test3");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
