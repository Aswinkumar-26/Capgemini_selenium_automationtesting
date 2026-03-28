package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningget {

	public static void main(String[] args) throws InterruptedException {
		// browser Launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		//navigating to youtube
		//driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//fetching the source code of the page
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shopping")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
