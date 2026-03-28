package baseclass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.orangehrm.selenium_ui.objectrepository.addemployeepage;
import com.orangehrm.selenium_ui.objectrepository.dashboardpage;
import com.orangehrm.selenium_ui.objectrepository.loginpage;
import com.orangehrm.selenium_ui.objectrepository.logoutpage;
import com.orangehrm.selenium_ui.objectrepository.recruitmentpage;

public class base_class {
public WebDriver driver;
public loginpage lp=null;
public dashboardpage dp=null;
public recruitmentpage rp=null;
public  addemployeepage ap=null;
public logoutpage loop=null;
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("suite done",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("test done",true);
	}
	@BeforeClass
	public void beforeclass() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 lp=new loginpage(driver);
		 dp=new dashboardpage(driver);
		 rp=new recruitmentpage(driver);
		 ap=new addemployeepage(driver);
		 loop=new logoutpage(driver);
	}
	@BeforeMethod
	public void beforemethod() {
		lp.login("Admin","admin123");
	}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite done",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("after test done",true);
	}
	@AfterClass
	public void afterclass() {
		driver.quit();
		Reporter.log("after class done",true);
	}
	@AfterMethod
	public void aftermethod() throws InterruptedException {
		loop.logout();
	}
	

}