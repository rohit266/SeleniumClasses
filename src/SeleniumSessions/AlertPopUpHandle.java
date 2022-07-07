package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //Enter URL
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		// switchTo() method is used to move to alert or switch to popup.
		//Alert is an inbuild class, used to handle alert or popup.
		
		Alert alert = driver.switchTo().alert(); 
		
		System.out.println(alert.getText());
		
		String text = alert.getText(); // used to get the text on alert or popup
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("Incorrect alert message");
		}
		
		alert.accept(); // Click on Ok button.
		
		//alert.dismiss(); // Click on cancel button.

	}

}
