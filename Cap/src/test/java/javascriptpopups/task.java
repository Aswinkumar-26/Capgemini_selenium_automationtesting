package javascriptpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input")).sendKeys("dresses",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='img-responsive'])[2]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
