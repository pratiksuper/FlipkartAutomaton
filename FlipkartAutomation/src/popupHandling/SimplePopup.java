package popupHandling;

import org.openqa.selenium.WebDriver;

public class SimplePopup {
	
	private WebDriver driver ;
	
	public SimplePopup(WebDriver d)
	{
		
		driver = d ;
	}

	
	public void popup()
	{
		driver.switchTo().alert().accept();
		
	}
}
