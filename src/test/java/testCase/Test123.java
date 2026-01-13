package testCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistreatiom;
import pageobjects.HomePage;
import testBase.BaseClass;

public class Test123 extends BaseClass{

	
	@Test 
	public	void testlogin()

	{
			HomePage hp =new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			AccountRegistreatiom AR =new AccountRegistreatiom(driver);
			AR.enterFirstname("Dny");
			AR.enterLastname("Dan");
			AR.entertxtemail("Dan@5689gmail.com");
			AR.entertxtPassword("Danave@2008");
			AR.clickPrivacyButton();
			AR.clickcontinueButton();
			String Confmsg=AR.msgAccountAdded();
			Assert.assertEquals(Confmsg, "Ypur Account Has Been Created");
		}
	
		public String RandomeString() {
			String RandomString = RandomStringUtils.randomAlphabetic(5);
			return RandomString;
		
		}
}
