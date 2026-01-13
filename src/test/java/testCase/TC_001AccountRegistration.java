package testCase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobjects.AccountRegistreatiom;
import pageobjects.HomePage;
import testBase.BaseClass;

public class TC_001AccountRegistration extends BaseClass{
	
	  public Logger logger;	
		public WebDriver driver;
	
	@Test 
public	void testlogin()

	{logger =LogManager.getLogger(this.getClass());
		try {
		logger.info("*********Statrint Test Case*****");
		
		HomePage hp =new HomePage(driver);
		//hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistreatiom AR =new AccountRegistreatiom(driver);
		logger.info("*********Enter name*****");
		AR.enterFirstname("Dny");
		AR.enterLastname("Dan");
		AR.entertxtemail(RandomeString()+"@89gmail.com");
		AR.entertxtPassword("Danave@2008");
		AR.clickPrivacyButton();
		AR.clickcontinueButton();
		
		String Confmsg=AR.msgAccountAdded();
		logger.info("*********Validation*****");
		Assert.assertEquals(Confmsg, "Ypur Account Has Been Created");
	}
		catch (Exception e)
		{
			
			
			logger.error("test failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
		
	}
	
	
	public String RandomeString() {
		String RandomString = RandomStringUtils.randomAlphabetic(5);
		return RandomString;
		
		
	}
	
	
	
}