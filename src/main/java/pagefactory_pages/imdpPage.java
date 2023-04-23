package pagefactory_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class imdpPage {
	@FindBy(xpath=("//input[@id=\"suggestion-search\"]"))private  WebElement Search;
	@FindBy(xpath=("//button[@id=\"suggestion-search-button\"]"))private  WebElement SearchBtn;
	
	@FindBy(xpath=("//a[text()='December 17, 2021 (United States)']"))private  WebElement releaseDate;
	@FindBy(xpath=("//a[text()='India']"))private  WebElement releaseCountry;
	
	
	public imdpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void imdsearch(String moviename) {
		Search.sendKeys(moviename);
		
		Search.sendKeys(Keys.DOWN,Keys.ENTER);
		//Search.click();
		//String moviesname=Search.getAttribute("values");
	}
	public String  releaseDate() {
		String imdate=releaseDate.getText();
		return imdate;
	}
	public String   countryname() {
		String imcountyname = releaseCountry.getText();
		return imcountyname;
	}

}
