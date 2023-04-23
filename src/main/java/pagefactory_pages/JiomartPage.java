package pagefactory_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JiomartPage {
	
	
@FindBy(xpath = "//button[@id='btn_ham_menu']") private WebElement Btn_main;
@FindBy(xpath = "//a[text()='Sign In']") private WebElement sign_in;
@FindBy(xpath = "//input[@id='loginfirst_mobileno']") private WebElement mobNo;
@FindBy(xpath = "//jds-button[@id='basic-button']") private WebElement optbtn;



public JiomartPage(WebDriver driver ) {
	PageFactory.initElements(driver, this);
	}

public void click_Btn_main() {
	Btn_main.click();
	
	}
public  void sign_in_click() {
	sign_in.click();
	
}
	public void Enter_no(String mobileno ){
	mobNo.sendKeys(mobileno);
}
	public void clikoptbtn(){
		optbtn.click();
	}
	}
 