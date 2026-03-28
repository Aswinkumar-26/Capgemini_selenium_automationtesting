package test7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][1]//a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).click();

		
		
		Thread.sleep(3000);
		driver.quit();

	}

}