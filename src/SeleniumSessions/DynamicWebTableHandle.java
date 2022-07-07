package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//Action class is used for mouse event.
		Actions action=new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		
		
		WebElement element02= driver.findElement(By.xpath("//button[@class='ui linkedin button']"));
		action.moveToElement(element02).build().perform();
		
		//driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		
		Thread.sleep(3000);
		
		
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]/a

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]/a

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]/td[2]/a

		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[4]/td[2]/a
		
		
		/*Method 1:
			•	Iterate row and column and get the call value.
			•	Using for loop
			•	Get total rows and iterate table
			•	Put if(string method) then select the value
			•	Lengthy method
		*/
		
		//Method:01
//		String before_xpath = "//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr[";
//		
//		String after_xpath = "]/td[2]/a";
//		
//		for(int i=1; i<=4; i++) {
//			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//			System.out.println(name);
//			if(name.contains("Atul Kumar")) { //i=3
//				//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[3]
//				driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr["+i+"]")).click();
//			}
//			
//			
//		}
		
		/*	
		Method 2 (Best Method)
		•	Using custom xpath
		•	Using parent and preceding sibling tags
		•	No need to write for loop
		•	No full iteration of table
		•	Single line statement
		•	More dynamic
		•	Efficient and fast
		*/
		
		//Method:02
		//a[contains(text(),'Atul Kumar')]/parent::td//preceding-sibling::td//input[@name = 'id']
		//a[contains(text(),'Atul Kumar')]/parent::td//preceding-sibling::td//div[@class = 'ui fitted read-only checkbox']
		//driver.findElement(By.xpath("//a[contains(text(),'Atul Kumar')]/parent::td//preceding-sibling::td//input[@name = 'id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Atul Kumar')]/parent::td//preceding-sibling::td//div[@class = 'ui fitted read-only checkbox']")).click();

	}

}