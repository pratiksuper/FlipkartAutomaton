package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.LoginPage;

public class LoginTestCase {

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage HomePage_obj = new HomePage(driver); 
		LoginPage LoginPage_obj = new LoginPage(driver);
		HomePage_obj.clickOnLogin();
		LoginPage_obj.enterUserName("prateek");
		LoginPage_obj.enterPassword("12344");
		LoginPage_obj.clickOnLoginBtn();
	}
}
