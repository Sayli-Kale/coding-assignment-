package pagefactory_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetSuggetionjioPage {
@FindBy(xpath = "//input[@id='autocomplete-0-input']")  private  WebElement serchFiled ;
@FindAll(@FindBy(xpath = "//div[@id='search_initial_discover_more']//child::a")) private List<WebElement> optnis  ;

WebDriver driver;

public GetSuggetionjioPage( WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver, this);  
}
	
	
public  void clickserchFiled() {
	serchFiled.click();
	
}
public void getallSugetions() {
	for( WebElement all:optnis) {
		String sugetions =all.getText();
		System.out.print(  sugetions + " ," );
		
	}
	
	int noOFoptions=optnis.size();
	System.out.println(noOFoptions);
}
}
