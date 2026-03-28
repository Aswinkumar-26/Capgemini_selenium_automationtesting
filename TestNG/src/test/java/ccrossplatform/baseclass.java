package ccrossplatform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseclass {
	WebDriver driver=null;
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("suite done",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("test done",true);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String browser) {
		ChromeOptions copt=new ChromeOptions();
		copt.addArguments("--incognito");
		copt.addArguments("--headless");
		EdgeOptions eopt=new EdgeOptions();
		eopt.addArguments("--inprivate");
		eopt.addArguments("--headless"); 
		FirefoxOptions fopt=new FirefoxOptions();
		fopt.addArguments("--private");
		fopt.addArguments("--headless");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver(copt);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(fopt);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver(eopt);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
//	@BeforeMethod
//	public void beforemethod() {
//		Reporter.log("suite done");
//	}
	
	
	
//	@AfterMethod
//	public void aftermethd() {
//		Reporter.log("after method done");
//	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite done",true);
	}
	
	@Test
	public void aftertest() {
		Reporter.log("after test done",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("after class done",true);
	}

	
	
}