package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/"); //enter URL
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.milm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bharat@1234");
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		WebElement loginbtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")); //login button
		
		flash(loginbtn, driver); // highlight the element
		
		drawBorder(loginbtn, driver); //draw a border
		
		//Take screentshot
		//Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screeshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("E:\\Rohit\\EclipseWorkstation\\JavaTraining\\SeleniumTopic\\src\\SeleniumSessions\\element.png"));
		
		
		//generate alert
		//generateAlert(driver, "There is an issue with login button on Login Page");
		
		//Click on any element by using of javascript executor
		clickElementByJS(loginbtn, driver);
		
		//refresh the page:
		//1.By using selenium.
		driver.navigate().refresh();
		
		//2.By using javascript.
		refreshBrowserByJS(driver);
		
		//get the title of the page by JS
		String pagetitle = getTitleByJS(driver);
		System.out.println(pagetitle);
		
		//get the page text by JS
		String pagetext = getPageInnerText(driver);
		System.out.println(pagetext);
		
		//scroll page down
		//scrollPageDown(driver);
		
		
		WebElement forgotpwdLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]"));
		scrollIntoView(forgotpwdLink, driver);

	}
	
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver); //Casting the driver into JavascriptExecutor or Converting driver into JavascriptExecutor
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver); //Casting the driver into JavascriptExecutor or Converting driver into JavascriptExecutor
		
		//executeScript -- to execute JavaScript code
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
