package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBootstrapDropBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/"); //enter URL
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Another action")) {
				list.get(i).click();
				break;
			}
		}

	}

}
