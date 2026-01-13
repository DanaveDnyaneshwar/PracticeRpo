package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass extends BasePage{

	public LoginClass(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String email) {
		
		txtemail.sendKeys(email);
		
	}
	
	public void setPass(String Pass) {
			
		txtPassword.sendKeys(Pass);
			
		}
	
	public void ClickLogIn() {
		
		btnLogin.click();
		
	}
	
}
