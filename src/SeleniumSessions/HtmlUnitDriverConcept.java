package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept { 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//htmlunitdriver is not available in Selenium 3.x version.
		//htmlunitdriver -- to use this concept, we have to download htmlunitdriver JAR file.
		
		
		//Advantages:
		//1. testing is happening behind the scene -- no browser is launched
		//2. very fast -- execution of test cases -- very fast -- performance of the script
		//3. not suitable for Actions class -- user actions -- mousemovement, doubleClick, drag and drop
		//4. Ghost Driver -- Healdless Browser
		    //--htmlUnit Driver -- java
		    //--PhantamJS -- JavaScript
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(15, TimeUnit.SECONDS);
		
		
		driver.get("https://ui.freecrm.com/");
		
		System.out.println("Before login title id:==="+driver.getTitle());
			
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.milm@gmail.com");
		
		System.out.println("First ======");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bharat@123");
		
		
		System.out.println("Second ======");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("After login title id:==="+driver.getTitle());
		
		

	}

}
