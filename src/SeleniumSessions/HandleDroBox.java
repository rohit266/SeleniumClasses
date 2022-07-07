package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDroBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //launch Chrome
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2F"); //Enter URL
		
		driver.findElement(By.id("businessaccount-radio")).click();
		
		//handle drop box:
		Select select = new Select(driver.findElement(By.id("businessCountry")));
		//Select select = new Select(driver.findElement(By.xpath("//*[@id=\"lps_ID0E1CSelectBoxItArrowContainer\"]")));
		select.selectByVisibleText("Egypt");
		
		

	}

}
