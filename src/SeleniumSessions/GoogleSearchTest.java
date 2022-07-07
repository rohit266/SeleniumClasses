package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/"); //enter URL 
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
//		How to perform Dynamic Search by using Dynamic Xpath.
//
//		Steps
//		1.	Google Search – pick a value from suggestion
//		2.	Search using Xpath.
//		3.	Get the total count of suggestions.
//		4.	Use if condition to match the value
//		5.	Click on matched value.

		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='wM6W7d']"));
		
		System.out.println("Total number of suggestions in search box:::====>"+list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("testing javatpoint")) {
				list.get(i).click();
				break;
			}
		}

	}

}
