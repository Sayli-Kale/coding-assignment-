package pagefactory_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {

	
	@FindBy(xpath="//input[@id=\"username\"]") private WebElement un;     
	@FindBy(xpath="//input[@class=\"textField pwdfield\"]") private WebElement pwd;
	@FindBy(xpath="//a[@id=\"loginButton\"]") private WebElement loginBtn;
	@FindBy(xpath="//a[@id=\"logoutLink\"]") private WebElement logout;
	
	 public Login1Page(WebDriver driver) {
		 PageFactory.initElements(driver, this );
	 }
	 
	 public void enterUn(String username) {
		 un.sendKeys(username);       
	 }
	  public void enterPwd(String password ) {
		  pwd.sendKeys(password);
	  }
	  
	  public void login() {
		  loginBtn.click();
     }
	  public  void logout() {
		  logout.click();
	  }
}


