package baseclass;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
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
		Reporter.log("class done",true);
	}
	
//	@BeforeMethod
//	public void beforemethod() {
//		Reporter.log("method done",true);
//	}
//	
	@AfterSuite
	public void aftersuite1() {
		Reporter.log("asuite done",true);
	}

	@AfterClass
	public void afterclass() {
		Reporter.log("aclass done",true);
	}
//	@AfterMethod
//	public void aftermethod() {
//		Reporter.log("amethod done",true);
//	}
	@AfterTest
	public void aftertest() {
		Reporter.log("atest done",true);
	}
}
