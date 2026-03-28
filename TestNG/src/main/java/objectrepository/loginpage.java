package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	//username
	By username=By.id("user-name");
	//password
	By password=By.id("password");
	//login-button
	By loginbtn=By.id("login-button");
	
	//business logic (login action)
	public void enterdetails(String un,String pass) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clicklogin() {
		driver.findElement(loginbtn).click();
	}
}