package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FillForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"); //Enter URL
		
		//driver.findElement(By.id("personalaccount-radio")).click();
		driver.findElement(By.id("firstname")).sendKeys("Atul");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("Atul234@yomail.com");
		driver.findElement(By.id("password")).sendKeys("Sam&&1234"); 
		driver.findElement(By.id("showpassword")).click(); 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(40);
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		Thread.sleep(40);
		System.out.println("End Test");
		//driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
	}

}
