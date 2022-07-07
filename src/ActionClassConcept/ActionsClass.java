package ActionClassConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//build():- method in Actions class is use to create chain of action or operation you want to perform.

		//perform():- this method in Actions Class is use to execute chain of action which are build using Action build method.
		
		/*
		 *driver.get("https://www.browserstack.com/");
		
		Thread .sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.id("signupModalButton"));
		
		//action.moveToElement(element).build().perform();
		
		//action.moveToElement(element).click().perform();
		
		//action.doubleClick(element).perform();
		
		action.contextClick(element).perform(); 
		 */
		
		
		
		
		/*
		 * 	driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		//action.dragAndDrop(source, destination).build().perform();
		
		action.clickAndHold(source).moveToElement(destination).release().build().perform();
		 */


		/*
		 * driver.get("https://www.google.com/");
		
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		
		//pass the name of the product
		action.sendKeys(element, "iphone").build().perform();
		
		//pass the Enter value through sendKeys or press Enter key
		action.sendKeys(Keys.ENTER).build().perform();
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
