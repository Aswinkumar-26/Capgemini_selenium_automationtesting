package ObjectRepo_pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//public WebDriver driver;
	public loginpage(WebDriver driver){
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css = "button[type='submit']")
	WebElement loginbtn;

	
	public void enterCredentials(String un,String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
	}
	
	
}