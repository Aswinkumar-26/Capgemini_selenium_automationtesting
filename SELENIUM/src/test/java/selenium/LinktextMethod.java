package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("YouTube")).click();
//		Thread.sleep(2000);
		
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Gmail")).click();
//		
//		driver.get("https://amazon.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.tagName("input")).sendKeys("pendant",Keys.ENTER);
		//driver.findElement(By.partialLinkText("")).click();
		
		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.className("ico-register")).click();
//		Thread.sleep(2000);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		for(WebElement link:alllinks) {
			System.out.println(link.getText());
		}
		}

}
