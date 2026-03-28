package alertpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Alert with Textbo")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[class='btn btn-info']")).click();
		Thread.sleep(2000);
		Alert popup=driver.switchTo().alert();
		popup.sendKeys("mass bhai nee");
		popup.accept();		
		
		
	}
}