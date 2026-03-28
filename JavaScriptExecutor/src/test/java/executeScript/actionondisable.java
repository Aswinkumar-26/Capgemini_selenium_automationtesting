package executeScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionondisable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/javase-jdk25-doc-downloads.html");
		WebElement btn=driver.findElement(By.cssSelector("a[class='license-link icn-download-locked']"));
		btn.click();
		Thread.sleep(3000);
		WebElement dbtn=driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", dbtn);
	
	}

}