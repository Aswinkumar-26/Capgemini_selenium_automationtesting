package orange_pom_base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Utility_package.WebDriverUtility;
import Utility_package.excelUtility;
import Utility_package.fileUtility;
import orange_pom.PIM_module;
import orange_pom.Vacancies_OrangeHRM;
import orange_pom.dashboardpage;
import orange_pom.login;
import orange_pom.logout;


@Listeners(Utility_package.ListenersImplementation.class)
public class base_class {
	public WebDriver driver;
	FileInputStream fis;
	public Properties prop;
	fileUtility fiu=new fileUtility();
	public String Browser;
	public WebDriverUtility wdu;
	public login l;
	public logout lo;
	public excelUtility eu;
public	PIM_module pm;
	public dashboardpage dbp;
	
	
	@BeforeSuite
	public void configbeforeSuite() {
		Reporter.log("--Executing suite--",true );
	}
	@BeforeTest
	public void configbeforeTest() {
		Reporter.log("--Executing test--",true);
	}
	@Parameters("BROWSER")
	@BeforeClass
	public void configbeforeclass() throws Exception {
		Reporter.log("--Executing class--",true);
		Browser=fiu.getPropertyKeyValue("browser");
		if(Browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else if(Browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		wdu=new WebDriverUtility(driver);
		l=new login(driver);
		lo=new logout(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(25);
		 pm = new PIM_module(driver);
		 dbp = new dashboardpage(driver);
		
	}
	@BeforeMethod
	public void configbeforemethod() throws Exception {
		Reporter.log("--Executing method--" ,true);
		String URL=fiu.getPropertyKeyValue("url");
		String validUserName=fiu.getPropertyKeyValue("username");
		String validPassword=fiu.getPropertyKeyValue("password");
		
		//login
		wdu.navigateToApplication(URL);
		l.entercred(validUserName, validPassword);
		//Move PIM
		
		
		
		
		
	}
/*	@DataProvider(name="addDataFromExcel")
	public Object[][] dataFromExcel() throws IOException{
		eu = new excelUtility();
		eu.loadExcelFile("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium\\selenium.UIFramework.test.genericUtility\\src\\main\\resources\\Properties\\VacanciesData.xlsx", "Sheet2");
		return eu.getDataFromExcelSheet();
	} */ 
	
	@AfterSuite
	public void configaftersuite() {
		Reporter.log("--Suite done--" ,true);
	}
	@AfterTest
	public void configaftertest() {
		Reporter.log("--Test done--",true );
	}
	@AfterClass
	public void configafterclass() {	
		Reporter.log("--Class done--",true);
		wdu.closingBrowserWindow();
	}
	@AfterMethod
	public void configaftermethod() {
		Reporter.log("--Class done--",true);
		lo.logout();
        
	}

}