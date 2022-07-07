package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		//We use this when we want to run our script without using chrome
		//Because of this we can do our task on system and in backend my scripts are running.
		//It is very fast because every thing is processing in backend or we can called behind the seen
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400, 800"); //Every time we will use same size
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/"); //enter URL
		
		System.out.println("Login page title="+driver.getTitle());	
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.milm@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Chetu@123");
		
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Home page title="+driver.getTitle());	

	}

}
