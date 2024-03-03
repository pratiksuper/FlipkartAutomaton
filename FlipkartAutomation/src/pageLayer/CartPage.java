package pageLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// ----------obj repo-------
	@FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
	 private WebElement nokia_lumiaproduct;
	
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement addto_cart;
	
	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement cart_link;
	
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	private WebElement place_orderbtn;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement enter_name;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement enter_country;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement enter_city;
	
	@FindBy(xpath = "//input[@id='card']")
	private WebElement creadit_cart;
	
	@FindBy(xpath = "//input[@id='month']")
	private WebElement month;
	
	@FindBy(xpath = "//input[@id='year']")
	private WebElement year ;
	
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	private WebElement purchase;
	// -----------Action Method --------
	public void clickonnokia_lumiaproduct()
	{
		nokia_lumiaproduct.click();
	}
	public void clickonaddto_cart()
	{
		addto_cart.click();
	}
	public void clickoncart_link()
	{
		cart_link.click();
	}
	public void clickonplace_orderbtn()
	{
		place_orderbtn.click();
	}
	public void clickonenter_name(String name )
	{
		enter_name.sendKeys(name);
	}
	public void clickonenter_country(String country)
	{
		enter_country.sendKeys(country);
	}
	public void clickonenter_city(String city)
	{
		enter_city.sendKeys(city);
	}
	public void clickoncreadit_cart(String ccn)
	{
		creadit_cart.sendKeys(ccn);
	}
	public void clickon_month(String months)
	{
		month.sendKeys(months);
	}
	public void clickon_year(String years)
	{
		year.sendKeys(years);
	}
	public void clickon_purchas()
	{
		purchase.click();;
	}
	}
