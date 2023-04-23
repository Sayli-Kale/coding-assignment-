package pagefactory_testng;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory_pages.HomePage;
import pagefactory_pages.Login1Page;

public class ActitimeTest {
WebDriver driver;	
Login1Page l;
HomePage h;
org.apache.poi.ss.usermodel.Sheet sh;
   
@BeforeClass
public void openBrowser() throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\win\\eclipse-workspace\\Maven\\Data_source\\Actitimecredentials.xlsx");
	 sh=WorkbookFactory.create(fis).getSheet("ActitimeCredention");
	
	 WebDriverManager.chromedriver().setup();
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--start-maximized");
	 options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);
	driver.get("https://demo.actitime.com/login.do");
	l = new Login1Page(driver);
    h= new HomePage(driver);
}


@BeforeMethod
public void openApp() {
  String username=sh.getRow(1).getCell(1).getStringCellValue();
  String password = sh.getRow(2).getCell(1).getStringCellValue();
  l.enterUn(username);
  l.enterPwd(password);
  l.login();
  h.verifyText();
} 

@Test
public void verifyHome() {
	 String actText=h.verifyText();
	 String expText=sh.getRow(3).getCell(1).getStringCellValue();
	 Assert.assertEquals(actText, expText);
}

}
