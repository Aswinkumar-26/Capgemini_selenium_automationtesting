package Hidden;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hidden_popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-calendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c69-9 ng-star-inserted' and .='12']")).click();
		
		
		Thread.sleep(3000);
		driver.quit();						

	}

}