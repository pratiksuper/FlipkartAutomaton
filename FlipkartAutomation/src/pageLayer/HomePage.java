package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
       private WebDriver driver ;
       
	public HomePage (WebDriver d )
	{
		driver = d ;	
	}

	//---------------obj repo ----------------
	
	 private By login_link = By.xpath("//a[@id='login2']");
	
	
	//----------Action MEthod -----------
	public void clickOnLogin()
	{
		driver.findElement(login_link).click();;
	}
}
