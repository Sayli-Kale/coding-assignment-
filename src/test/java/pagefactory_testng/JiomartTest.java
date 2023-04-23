package pagefactory_testng;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory_pages.JiomartPage;



public class JiomartTest {
	
	double    mobileNO;
	WebDriver driver;
	JiomartPage p;
	org.apache.poi.ss.usermodel.Sheet sh;
   
	
	@BeforeClass
    public  void  excleInput() throws Throwable, Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\win\\eclipse-workspace\\Maven\\Data_source\\Actitimecredentials.xlsx");
		   sh =WorkbookFactory.create(fis).getSheet("ActitimeCredention");
			
		    WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();   // chromeoptions class is 
		    chromeOptions.addArguments("--start-maximized");
		    chromeOptions.addArguments("--remote-allow-origins=*");
			 driver  = new ChromeDriver(chromeOptions);  //parameret is options 
			 driver.get("https://www.jiomart.com/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			 
			 p = new JiomartPage(driver);
			 
			  double    mobileno = sh.getRow(4).getCell(1).getNumericCellValue();
			 
			 p.click_Btn_main();
			 p.sign_in_click();
			p.Enter_no( String.valueOf(mobileno));//   string.valueof(double) is convert the double into string 
			 p.clikoptbtn();
    }
 @Test
public void verifySignin() {
Reporter.log("Testcase is pass ", true);
			
		}
		
		
	}


