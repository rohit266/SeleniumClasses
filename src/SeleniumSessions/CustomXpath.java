package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");//Enter URL
		
		//absolute xpath: not recommended
		///html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]
		//Disadvantages of absolute xpath:
		//1.performance issue
		//2. not reliable
		//3. it can be changed at any time in future.
		
		
		//Customized Xpath
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java 01");
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java 02");
		
		Thread.sleep(3000);
		
		
		//How we will handle dynamic id or id has been changed after refreshing the page
		
		//dynamic id: input
		
		//--starts-with or contains
		//id = test_123
		//By.id("test_123")
		//id = test_456
		//id = test_789
		
		//--ends-with or contains
		//id = 1234_test_t
		//id = 2345_test_t
		//id = 6789_test_t
		
		//To handle dynamic id or any other element, we will use 'contains' and 'starts-with' in xpath
		//Below are the examples
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]")).sendKeys("Test");
		
		//for links: custom xpath
		//all the links are represented by <a> tag;
		driver.findElement(By.xpath("//a[contains(text(),'Sell')]")).click();

	}

}
