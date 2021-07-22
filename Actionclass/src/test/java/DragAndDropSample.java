import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropSample {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "/home/atlas_in_my_mind/Documents/chromedriver_linux64/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	
	WebElement pickuppoint = driver.findElement(By.xpath("//p[text()='Drag the W3Schools image into the rectangle.']//preceding-sibling::div[@id='div2']//preceding-sibling::div[@id='div1']//img"));
	WebElement DropPoint = driver.findElement(By.xpath("//p[text()='Drag the W3Schools image into the rectangle.']//preceding-sibling::div[@id='div2']"));
	

	Actions action = new Actions(driver);
	Action MouseDragAndDrop = action.clickAndHold(pickuppoint).moveToElement(DropPoint).release(DropPoint).build();
	MouseDragAndDrop.perform();
	
	Thread.sleep(3000);

	driver.quit();
	
	}
}
