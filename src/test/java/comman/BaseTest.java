package comman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	 public static WebDriver driver = null;   // global up_casting driver
	@BeforeSuite
	public void launchBrowser() {
	WebDriverManager.firefoxdriver().setup();
	driver= new  FirefoxDriver();
	
	}
	@AfterSuite
	public void closeBrowser() {
	driver.close();
		
		}
}

