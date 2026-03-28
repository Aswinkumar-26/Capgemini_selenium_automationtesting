package genericUtility;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
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

public class baseClass {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Executing BEFORE SUITE");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Executing before test");

	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before class");

	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing before method");

	}
	
	
	
	@AfterMethod
	public void aftermethd() {
		System.out.println("Executing afer method");

	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("Executing after suite");

	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("Executing after test");

	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("Executing after class");

	}
	

}