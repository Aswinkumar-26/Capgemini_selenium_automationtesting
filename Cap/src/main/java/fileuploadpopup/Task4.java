package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("h2[class='main-3']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\aswin\\Downloads\\Hexaware.pdf");
		driver.quit();

	}

}
