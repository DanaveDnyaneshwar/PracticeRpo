package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver )
	{
		
		super(driver);
	
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="//a[@class='btn btn-black navbar-btn']")
	WebElement lnkregister;
	@FindBy(linkText="Login")
	WebElement linklogin;
	public void clickMyAccount()
	
	{
		
		lnkmyaccount.click();
	}
	
public void clickRegister()
	
	{
		
	lnkregister.click();
	}

public void linklogin()

{
	
	linklogin.click();
}


}
