package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.CartPage;
import popupHandling.SimplePopup;


public class BuyTestCases {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		CartPage CartPage_obj = new CartPage(driver);
		SimplePopup SimplePopup_obj = new SimplePopup(driver);
		
		CartPage_obj.clickonnokia_lumiaproduct();
		CartPage_obj.clickonaddto_cart();
	    Thread.sleep(3000);
	    SimplePopup_obj.popup();
		CartPage_obj.clickoncart_link();
		CartPage_obj.clickonplace_orderbtn();
		CartPage_obj.clickonenter_name("pawan");
		CartPage_obj.clickonenter_country("india");
		CartPage_obj.clickonenter_city("wai");
		CartPage_obj.clickoncreadit_cart("12346");
		CartPage_obj.clickon_month("jan");
		CartPage_obj.clickon_year("2012");
		CartPage_obj.clickon_purchas();
	}
}
