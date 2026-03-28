package excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class orange_hrm_login {
	WebDriver driver;
	@DataProvider(name="logindata")
	Object[][] getcredential(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
	
	@Test(dataProvider="LoginData")
	public void login(String user,String pass) {
		driver=new ChromeDriver();
		driver.get("");
	}

}
