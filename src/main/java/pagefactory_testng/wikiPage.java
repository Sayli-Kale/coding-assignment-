package pagefactory_testng;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class wikiPage {
	@FindBy(xpath=("//input[@name='search']"))private  WebElement wikiSearch;
	@FindBy(xpath=("//a[@href=\"https://en.wikipedia.org/wiki/Pushpa:_The_Rise?wprov=srpw1_0\"]"))private  WebElement wikiSearch2;
	
	@FindBy(xpath=("//button[text()='Search']"))private  WebElement wikiSearchBtn;
	@FindBy(xpath=("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li"))private  WebElement wikiDate;
	@FindBy(xpath=("//td[text()='India']"))private  WebElement wikiCountry;
	
	
	public wikiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void  wikisearch(String moviename) throws Throwable {
	    wikiSearch.sendKeys(moviename);
	    
	    Thread.sleep(4000);
	    wikiSearch.sendKeys(Keys.TAB,Keys.ENTER);
	    //wikiSearch2.click();
		//wikiSearch.click();
		//wikiSearchBtn.click();
	}
	public String  wikireleaseDate() {
		String wikidate=wikiDate.getText();
		return wikidate;
	}
	public String   wikicountryname() {
		String wikicountyname = wikiCountry.getText();
		return wikicountyname;
	}

}
