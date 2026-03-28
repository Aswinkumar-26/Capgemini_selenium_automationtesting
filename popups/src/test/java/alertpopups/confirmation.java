package alertpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Alert with OK &")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.dismiss();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}