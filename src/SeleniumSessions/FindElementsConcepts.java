package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");//Enter URL
		
		
		//1.get the total count of links on the page
		//2.get the text of each link on the page
		
		//all the links are represented b <a> html tag:
		//Every time when we will usr findElements() then it will return list of elements on page and for this we have to create List <WebElement> object. 
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of linkList:
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}

	}

}
