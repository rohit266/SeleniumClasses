package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");//Enter URL
		
		Actions action = new Actions(driver);
		
		
		
		Thread.sleep(3000);
		
		
		//action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1rngwi6 r-o9xkwf']"))).build().perform();
		//div[contains(text(),'Add-ons')]
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'MyFlexiPlan')]")).click();
		
		//div[contains(text(),'MyFlexiPlan')]
	}


}
