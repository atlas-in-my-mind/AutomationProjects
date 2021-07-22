import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsSample {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/atlas_in_my_mind/Documents/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.testyou.in/Login.aspx");
		login("shaik25081997@gmail.com", "babajan123");
		
		//Mouse Hover Actions Class
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@class='menudip float_left']//preceding-sibling::div[@id='ctl00_CPHHeader_dvTest']//div//a//span[contains(text(),'Test')]"))).build().perform();
		driver.findElement(By.xpath("//li//div//a[text()= 'Test List']")).click();
	}
	
	public static void login(String Emailaddress, String Password) throws Exception {
		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys(Emailaddress);
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys(Password);
		driver.findElement(By.id("ctl00_CPHContainer_btnLoginn")).click();
	}
}
