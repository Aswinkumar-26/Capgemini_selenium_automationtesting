package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import baseclass.Loginpage;

public class LoginPageFactory {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		Loginpage lp=new Loginpage(driver);
		lp.enterUrl("https://www.saucedemo.com/");
		lp.enterCredentials("standard_user", "secret_sauce");
		lp.clickloginbtn();
	}

}
