package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//img[@class='nivo-main-image']")).getTagName());
		System.out.println("hello");
		
		
		
		Thread.sleep(2000);
		driver.quit();

	}

}