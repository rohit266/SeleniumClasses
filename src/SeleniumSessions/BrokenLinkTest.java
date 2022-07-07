package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/"); //enter URL
			
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.milm@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Chetu@123");
		
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(2000);
		
		//links are associated with  -- <a> tag <href=""ww.google.com>
		//images are associated with -- <img> tag <href=""ww.google.com>
		
		
		//Steps to manage broken links
		//1. get the list of all the links and images:
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img"))); //adding the link in <image> is also added in the list.
		
		
		
		System.out.println("size of all the links and images--->"+ linksList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. iterate linkList : exclude all the links/images does not have an <href> attribute
		for(int i=0; i<linksList.size();i++) {
			try {
				System.out.println(linksList.get(i).getAttribute("href"));
				if(linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
					activeLinks.add(linksList.get(i));
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		
		//get the size of active links list:
		System.out.println("size of active links and images--->"+ activeLinks.size());
		
		//3. Check the href url with httpconnection api:
		//200 -- ok
		//404 -- not found
		//500 -- internal error
		//400 -- Bad Request
		for(int j=0; j<activeLinks.size(); j++) {
			
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection(); //open connection
			connection.connect(); //make connection
			String resposnse = connection.getResponseMessage(); //Check response for 'Ok'
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"----->"+resposnse);
		}

	}

}
