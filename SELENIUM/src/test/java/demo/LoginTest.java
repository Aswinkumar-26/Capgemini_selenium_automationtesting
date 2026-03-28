package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import generic_utility.FileUtility;
import generic_utility.WebDriverUtility;

public class LoginTest {
	@Test
	public void login() {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login Test");
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility();
		FileUtility fu=new FileUtility();
		login lp=new login(driver);
		
		String urlpath=fu.getPropertyKeyValue("url");
		String un=fu.getPropertyKeyValue("username");
		String pass=fu.getPropertyKeyValue("password");
		//navigation to application
		wu.navigateToApplication(urlpath);
		test.log(Status.INFO,"Navigation to OrangeHRM login page");
		//test.info("Navigated to OrangeHRM login page");
		lp.login(un,pass);
		test.log(Status.PASS, "Login Sucessfull");
		extent.flush();
		
		
		
		
	}

}
