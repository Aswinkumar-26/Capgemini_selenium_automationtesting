package alertpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.cssSelector("input[class='button-1 search-box-button']"));
		search.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		Thread.sleep(2000);
		search.click();
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}