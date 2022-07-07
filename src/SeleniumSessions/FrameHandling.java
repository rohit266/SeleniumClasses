package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//Dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.get("https://ui.cogmento.com/"); //Enter URL
		
		driver.findElement(By.name("email")).sendKeys("rohit.milm@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bharat@123");
		//driver.findElement(By.className("ui fluid large blue submit button")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click(); */
		
		driver.get("https://demo.guru99.com/test/guru99home/"); //Enter URL
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // For scrolling page
		js.executeScript("window.scrollBy(0,2000)", ""); // For scrolling page
		
		driver.switchTo().frame("a077aa5e");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		Thread.sleep(3000);
		//driver.switchTo().frame("Test");
		
		//Thread.sleep(3000);
	
		//driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button")).click();
		
		
		//*[@id="main-nav"]/div[3]/a

	}

}
