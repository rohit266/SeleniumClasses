package AlertClassConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//Void dismiss(): This method is used when the ‘Cancel’ button is clicked in the alert box.
		//driver.switchTo().alert().dismiss();
		
		//Void accept(): This method is used to click on the ‘OK’ button of the alert.
		//driver.switchTo().alert().accept();
		
		//String getText(): This method is used to capture the alert message.
		//driver.switchTo().alert().getText();
		
		//sendKeys(String stringToSend): This method is used to send data to the alert box.
		//driver.switchTo().alert().sendKeys("Text");
		
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("user_full_name")).sendKeys("username");
		//driver.findElement(By.id("input-lg text user_email_ajax")).sendKeys("username.xyz.net");
		driver.findElement(By.id("user_password")).sendKeys("Your_Password");
		
		WebElement element = driver.findElement(By.id("user_submit"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert(); // switch to alert
		
		String alertMessage = alert.getText();
		
		System.out.println(alert.getText());
		
		Thread.sleep(2000);
		
		alert.accept();		
		

	}

}
