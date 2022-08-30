package comqaTestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import comqaPagelayer.Dashpage;
import comqaPagelayer.ExchangePage;
import comqaPagelayer.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public static Dashpage dash;
	public static ExchangePage exchange;
	@BeforeClass
	public void start()
	{
		 logger = Logger.getLogger("16 April EB Auto");
		 PropertyConfigurator.configure("log4j.properties");
		 logger.info("Automation Started");
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Automation Stopped");
	}
	@BeforeMethod
	public void setup() {
		String br="Chrome";
		if(br.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Chrome launches");	
		}
		if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		if(br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("This is incorrect browser name");
		}
		
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//login to website
		Loginpage login=new  Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
			//Obje Creation
			dash = new Dashpage();
			exchange = new ExchangePage();
		
	}
	@AfterMethod
	public void closedown() {
		driver.quit();
		logger.info("browser closed");
	}
		
	}
	


