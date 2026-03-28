package javascriptpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hiddenpopus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		//driver.findElement(By.linkText("OK")).click();
		
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("11")).click();

	}

}
