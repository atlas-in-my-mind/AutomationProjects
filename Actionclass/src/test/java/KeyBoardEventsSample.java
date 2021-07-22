import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventsSample {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/atlas_in_my_mind/Documents/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.SPACE);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.LEFT_SHIFT);
		action.sendKeys("j").keyUp(Keys.LEFT_SHIFT).build().perform();
		
}
}
