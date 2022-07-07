package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/"); //Enter URL
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//type='file' should be present for Browse/AttachFile/UploadFile button then it will work.
		//driver.findElement(By.xpath("//*[@id=\"post-206\"]/div/div[3]/form/label")).click();
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\rohitk4\\Downloads\\sample1.html");

	}

}
