package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='column follow-us']")).getText());
		System.out.println();
		System.out.println(driver.findElement(By.xpath("//div[@class='column follow-us']")).getTagName());
	}

}