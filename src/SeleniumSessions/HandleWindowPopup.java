package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import jdk.internal.misc.FileSystemOption;
//import sun.awt.dnd.SunDragSourceContextPeer;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//Types of Pop Up.
		//1. Alerts --JavaScript Pop Up -- We will use Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button -- we will use (type = file, sendkeys(path))
		//3. Browser Window pop up -- Advertisement pop up --  we will use (windowHandler API - getWindowHandles())
		
		//IN this code we are covering "Browser Window pop up"
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
		
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		
		System.out.println("parent window popup title"+ driver.getTitle());
		
		System.out.println("parent windowid;"+ parentWindowId);
		
		String childWindowId = it.next();
		
		System.out.println("Child window id:"+ childWindowId);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("child window popup title"+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parent window popup title"+ driver.getTitle());

	}

}
