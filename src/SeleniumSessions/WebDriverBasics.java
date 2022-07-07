package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		// 1. FF browser
		//geckodriver.
		
		//Download geckoderiver and set path with System.setProperty(Key, Value)
		/*
		System.setProperty("webdriver.gecko.driver","E:\\Rohit\\EclipseWorkstation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); //launch Fire Fox
		driver.get("https://www.google.com/"); //Enter URL
		*/
		
		//2.Chrome Driver
		//chromedriver
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver(); //launch Chrome
		driver1.get("https://www.google.com/"); //Enter URL
		
		String title = driver1.getTitle(); //get title
		
		System.out.println(title);
		
		//validation point	
		if(title.equals("Google")) {		
			System.out.println("Correct title");		
		}
		else {
			System.out.println("In-correct title");
		}
		
		System.out.println(driver1.getCurrentUrl());
		
		//System.out.println(driver1.getPageSource());
		
		driver1.quit(); //quit the browser.

	}

}
