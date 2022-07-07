package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/"); //enter URL
			
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.milm@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Chetu@123");
		
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		//Action class is used for mouse event.
		Actions action=new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		
		
		WebElement element02= driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
		action.moveToElement(element02).build().perform();
		
		//driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Atul Kumar')]/parent::td//preceding-sibling::td//div[@class = 'ui fitted read-only checkbox']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();	

	}

}
