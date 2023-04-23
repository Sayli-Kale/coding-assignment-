package pagefactory_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory_pages.GetSuggetionjioPage;

public class PrintSuggetions {
	
	
	WebDriver driver;
	GetSuggetionjioPage g;
	@Test
public void printSugetions() {
	WebDriverManager.chromiumdriver().setup();
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--start-maximized");
	ops.addArguments("--remote-allow-origins=*");
	driver =  new ChromeDriver(ops);
	driver.get("https://www.jiomart.com/?gclid=Cj0KCQjwlumhBhClARIsABO6p-xZglmxvFuMvVZrpDUSv6PKtgnPJe4QMBZgwPnDAI4dDA-lB32SkxwaAhZ3EALw_wcB");
		
	g= new GetSuggetionjioPage(driver);	
	g.clickserchFiled();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	g.getallSugetions();
	
	}
	}
	
	
	

