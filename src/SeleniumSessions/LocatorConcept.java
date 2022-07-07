package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch Chrome
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"); //Enter URL
		
		//Types of Locators
		
		//1. xpath: (Priority - 02)
		//adsolute xpath should not be used or we can tell that For hierarchy, not recommended 
		//Only relative xpath should be used.
		
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		
		//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Peter");
		
		//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Peter123@yopmail.com");
		
		
		//2. id: (Priority - 01)
		
		//driver.findElement(By.id("firstname")).sendKeys("Tom");
		//driver.findElement(By.id("lastname")).sendKeys("Peter");
		//driver.findElement(By.id("Email")).sendKeys("peter123@yopmail.com");
		
		
		//3. name: (Priority - 03)
		
		//driver.findElement(By.name("firstname")).sendKeys("Tom");
		//driver.findElement(By.name("lastname")).sendKeys("Peter");
		
		
		//4. LinkText:This is used only for links
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		
		//5. partiallinkText: Not Useful
		
		//driver.findElement(By.partialLinkText("User Privacy")).click();
		
		
		//6.CSSSelector
		// if id is there --- #{id}
		// if class is there --- .{class}
		
		driver.findElement(By.cssSelector("#password")).sendKeys("Bharat@123");
		
		
		//7.className: Not useful (Class name can be duplicate for different elements on page, So that we should not use that)
		
		driver.findElement(By.className("action-link")).click();
		
		
		
		

	}

}
