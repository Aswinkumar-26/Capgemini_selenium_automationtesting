package javascriptpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement srcb=driver.findElement(By.xpath("//input[@class='button-1 search-box-button']"));
		srcb.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.id("small-searchterms")).sendKeys("Computers",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
