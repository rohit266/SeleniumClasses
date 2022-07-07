package ActionClassConcept;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUPAndKeyDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		/*
		 * 	//KeyDown() command will simulate the pressing and holding the key
		//KeyUp() command will simulating the releasing of the key
		
		//driver.get("https://www.google.com/");
		
		driver.get("https://www.browserstack.com/");
		
		Thread.sleep(2000);
		
		//WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		WebElement element01 = driver.findElement(By.xpath("//a[@class='btn col-center btn-primary btn-lg btn-xl custom-btn-amp-events']"));
		
		Actions action = new Actions(driver);
		
		//action.keyDown(element, Keys.SHIFT).sendKeys("lambdatest").build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		 * 
		 */
		

		//KeyDown() command will simulate the pressing and holding the key	
		//KeyUp() command will simulating the releasing of the key
		
		driver.get("http://omayo.blogspot.com/");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'compendiumdev')]"));
		
		action.moveToElement(element).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		

	}

}
