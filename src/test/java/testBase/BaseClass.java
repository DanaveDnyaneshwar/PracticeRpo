package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	
	@BeforeClass
//	@Parameters({"os","browser"})
	public void setup(/*String os, String br*/) throws IOException {
		/*FileReader file = new FileReader ("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);//loading properties file
		switch(br.toLowerCase())
		{
		case "chrome" :driver =new ChromeDriver();
			break;
		case "firefox" :driver =new FirefoxDriver();
		break;	
		case "Edge" :driver =new EdgeDriver();
		break;	
		default :System.out.println("invalid browser....");
		return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demo.opencart.com/");
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();

	*/
		 driver= new ChromeDriver();
		 driver.get("https://www.opencart.com/");
	}
	

	@AfterClass
	void tearDown()
	{
	driver.quit();
		
		
	}
}
