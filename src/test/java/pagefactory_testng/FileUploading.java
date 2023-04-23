package pagefactory_testng;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading { // using the robot class 
	 WebDriver driver ;
	@Test
	public void uploadFile() throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--start-maximized");
		ops.addArguments("--remote-allow-origins=*");
		driver =  new ChromeDriver(ops);
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//span[text()='Select JPG images']"));
		button.click();
		
		Robot rb = new Robot();
		
		
		//for copy the path of the file in system clipboard 
		StringSelection src  = new StringSelection("C:\\Users\\win\\Desktop\\study\\TC_ECS_003 fail .PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
		 Thread.sleep(1000);
		 
		 // robot class for handle the sytem file exployer 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
	 
		
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='processTaskTextBtn']")).click();
		
		
	}
}
