package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginClass;
import pageobjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTestCase extends BaseClass

{

@Test 

public void verify_login()

{
	try {
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.linklogin();
		
		LoginClass LC = new LoginClass(driver);
		
		LC.setEmail(p.getProperty("email"));
		LC.setPass(p.getProperty("pass"));
		LC.ClickLogIn();
		
		MyAccountPage mcc =new MyAccountPage(driver);
		boolean targetpage =mcc.isMyaccountExist();
		Assert.assertTrue(targetpage);
		
	}
	catch(Exception e)
	
	{
		
		Assert.fail();
	}
}}