package Demo;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utility_package.WebDriverUtility;
import Utility_package.fileUtility;
import orange_pom_base.base_class;

//import orange_pom.login;
@Listeners(Utility_package.ListenersImplementation.class)
public class LoginTest extends base_class{
	
	@Test
	public void login() throws IOException {

	   // WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    WebDriverUtility wu = new WebDriverUtility(driver);
	    fileUtility fu = new fileUtility();
	    orange_pom.login lp = new orange_pom.login(driver);

	    String urlpath = fu.getPropertyKeyValue("url");
	    String un = fu.getPropertyKeyValue("username");
	    String pass = fu.getPropertyKeyValue("password");

	    wu.navigateToApplication(urlpath);

	    lp.entercred(un, pass);

	    if (!driver.getCurrentUrl().contains("dashboard")) {
	        throw new RuntimeException("Login failed");
	    }

	    driver.quit();
	}

	   
	}