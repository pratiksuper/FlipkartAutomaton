package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	   private WebDriver driver ;
	   
	   public LoginPage(WebDriver d)
	   {
		   driver = d ;
		   
	   }
	   
	   //------------ obj repo-----------
	
	private By username_textbox = By.xpath("//input[@id='loginusername']");
	private By userpass_textbox = By.xpath("//input[@id='loginpassword']");
	private By clickonLoginLink = By.xpath("//button[contains(text(),'Log in')]");
	 //----------  Action Method -----------
	   
	   
	   public void enterUserName(String username)
	   {
		   driver.findElement(username_textbox).sendKeys(username);;
	   }
	   
	   public void enterPassword(String password)
	   {
		   driver.findElement(userpass_textbox).sendKeys(password);;
	   }
	   public void clickOnLoginBtn ()
	   {
		   driver.findElement(clickonLoginLink).click();;
	   }
}
