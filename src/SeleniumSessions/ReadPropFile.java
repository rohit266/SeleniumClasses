package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("E:\\Rohit\\EclipseWorkstation\\JavaTraining\\SeleniumTopic\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("Name"));
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if (browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		}/* else if(browsername.equals("FireFox")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\geckodriver");
			driver = new FirefoxDriver();
			
		} else if(browsername.equals("InternetExplorer")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\internetexplorerdriver");
			driver = new InternetExplorerDriver();
		} */
		
		driver.get(url);
		
		//driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Atul");
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
			

	}

}
