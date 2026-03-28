package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Xpathbystartswith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();

		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[starts-with(@role,'combobox')]"))
        .sendKeys("Laptop");
	}

}
