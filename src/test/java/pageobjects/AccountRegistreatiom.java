package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistreatiom extends BasePage{

	
public AccountRegistreatiom(WebDriver driver) {
		super(driver);
		
	}



@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;

@FindBy(xpath="//*[@id='input-email']")
WebElement txtemail;
@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@name='agree']")
WebElement privcyButton;

@FindBy(xpath="//button[normalize-space()='Continue']")
WebElement continueButton;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement AccountAddeMsg;

@FindBy(xpath="//a[normalize-space()='Continue']")
WebElement continueButton1;

public void entertxtemail(String email )

{
	
	txtemail.sendKeys(email);
}
public void enterFirstname(String txtFirstName1 )

{
	
	txtFirstName.sendKeys(txtFirstName1);
}
public void enterLastname(String txtLastName1 )

{
	
	txtLastName.sendKeys(txtLastName1);
}


public void entertxtPassword(String txtPassword1 )

{
	
	txtPassword.sendKeys(txtPassword1);
}
public void clickPrivacyButton( )

{
	
	privcyButton.click();
}

public void clickcontinueButton( )

{
	
	continueButton.click();
}

public String  msgAccountAdded()

{
	try {
	String AccountAddedMsg1= AccountAddeMsg.getText();
	
	return AccountAddedMsg1;
	
	}catch(Exception e) {
		
		
		return(e.getMessage());
}
}
}
