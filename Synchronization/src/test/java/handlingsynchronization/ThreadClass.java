package handlingsynchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//long millis
		Thread.sleep(3000L);
		//long millis int nanos
		driver.navigate().to("https://www.ebay.com/");
		Thread.sleep(3000L,4000);
		driver.navigate().to("https://www.shoppersstack.com/");
		//duration
		Thread.sleep(Duration.ofSeconds(3));
		

	}

}