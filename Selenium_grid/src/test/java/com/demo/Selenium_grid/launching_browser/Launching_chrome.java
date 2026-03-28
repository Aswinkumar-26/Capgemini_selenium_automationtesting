package com.demo.Selenium_grid.launching_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launching_chrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.29.152:4444"), options);
		//Navigating to an application
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();
	}

}
