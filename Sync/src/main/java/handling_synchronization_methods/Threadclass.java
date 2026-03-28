package handling_synchronization_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(1500, 100);
		
		
		driver.navigate().to("https://www.shoppersstack.com/");
		Thread.sleep(Duration.ofSeconds(5));
		
		
	}

}
