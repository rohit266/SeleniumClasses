package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.guru99.com/");
		
		//Take screenshot and store as file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screeshot to desired location using copyFile //method
		//FileUtils.copyFile(src, new File("E://Test_Screenshot/screenshot01.png"));
		FileUtils.copyFile(src, new File("E:\\Rohit\\EclipseWorkstation\\JavaTraining\\SeleniumTopic\\src\\SeleniumSessions\\guru99.png"));
		System.out.println("hello");
		
		
	}

}
