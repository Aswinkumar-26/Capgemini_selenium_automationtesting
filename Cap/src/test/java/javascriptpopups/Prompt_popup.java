package javascriptpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
		
		Alert popup=driver.switchTo().alert();
		Thread.sleep(2000);
		
		popup.sendKeys("Soga");
		System.out.println(popup.getText());
		Thread.sleep(2000);
		popup.accept();
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
