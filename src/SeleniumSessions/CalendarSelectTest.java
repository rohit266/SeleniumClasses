package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//One Type of Calendar
		/*
		driver.get("https://demo.guru99.com/test/"); //enter URL
		Thread.sleep(2000);
			
		
		String date = "18-April 2022";	
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String montyear = dateArr[1];
		
		System.out.println(day);
		System.out.println(montyear);
		
		WebElement dateBox = driver.findElement(By.xpath("//input[@name='bdaytime']"));
		
		dateBox.sendKeys("09252013");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0245PM");
		*/
		
		
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index"); //enter URL
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//div[@class='qual_x_close']")).click();
		//driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		/*Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; // For scrolling page
		js.executeScript("window.scrollBy(0,800)", ""); // For scrolling page
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar k-button-icon']")).click();*/
		

	}

}
