package pagefactory_testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pagefactory_pages.imdpPage;
import pagefactory_pages.wikiPage;




public class imdwikiTest {
	WebDriver driver;
	imdpPage i;
	wikiPage w;
	String moviename = "Pushpa: The Rise - Part 1";
	
	
@Test
public void VerifyText() throws Throwable {
	System.setProperty("webdriver.chrome.driver","F:\\software\\chromedriver110\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.imdb.com/");
	    Thread.sleep(4000);
	    i = new imdpPage(driver);
	    i.imdsearch(moviename);
	    String imdate =i.releaseDate();
	    Reporter.log(imdate,true);
	    
	    
	    String   imcountyname= i.countryname();
	    Reporter.log(imcountyname,true);
	    
	    driver.get("https://en.wikipedia.org/wiki/Main_Page");
	    w= new wikiPage(driver);
	    w.wikisearch(moviename);
	  String   wikireleaseDate   =w.wikireleaseDate();
	  Reporter.log(wikireleaseDate,true);
	  
	 String wikicountryname=   w.wikicountryname();
	 Reporter.log(wikicountryname,true);
	// Assert.assertEquals(imdate, wikireleaseDate);
	 Assert.assertEquals(imcountyname, wikicountryname);
	 
}
}