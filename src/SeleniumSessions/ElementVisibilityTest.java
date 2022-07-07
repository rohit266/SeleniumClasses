package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://api.freecrm.com/register/"); //enter URL
		
		//1. isDisplayed() method: applicable to all the elements and it check that particular element is displayed or not.
		//or we can say that if particular element is available on page or not
		
		boolean b1 = driver.findElement(By.xpath("//button[@class='ui fluid large blue submit button']")).isDisplayed(); //for login button
		
		System.out.println(b1); //true
		
		//2. isEnabled() method: is primarily used with buttons.
		
		boolean b2 = driver.findElement(By.xpath("//button[@class='ui fluid large blue submit button']")).isEnabled();
		
		System.out.println(b2); //true
		
		
		
		//3. isSelected() method: only applicable for checkbox, dropdown and radio button.
		
		boolean b3 = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
		
		System.out.println(b3); //flase
		
		
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		
		boolean b4 = driver.findElement(By.xpath("//input[@name='terms']")).isSelected();
		
		System.out.println(b4); //true
	}

}
