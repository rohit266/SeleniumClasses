package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2"); //enter URL
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//label"));
		
		System.out.println(list.size());
		
		//Want to select all the checkboxes inside the dropdown
//		for(int i=0; i<list.size(); i++) {
//				list.get(i).click();
//		}
		
		
		//Want to exclude some checkcbox to checked or unchecked
//		for(int i=0; i<list.size(); i++) {
//		System.out.println(list.get(i).getText());
//		if(!list.get(i).getText().contains("HTML") && !list.get(i).getText().contains("CSS"))
//		list.get(i).click();
//		}
		
		
		//Want to slect particular value inside the dropdown
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) {
				list.get(i).click();
				break;
			}
		}

	}

}
