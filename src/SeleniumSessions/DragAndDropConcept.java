package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Rohit\\EclipseWorkstation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");//Enter URL
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
//		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		
		action.dragAndDrop(source, destination).build().perform();
		
		//*[@id="draggable"] //*[@id="droppable"]

	}

}
