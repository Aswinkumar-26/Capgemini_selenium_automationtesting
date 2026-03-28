package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
//		Thread.sleep(2000);
////		WebElement un=driver.findElement(By.id("R_32d9lplcldcpbn6b5ipamH1"));
////		un.sendKeys("123jshsj");
////		WebElement pass=driver.findElement(By.id("R_33d9lplcldcpbn6b5ipamH1"));
////		pass.sendKeys("11223bs");
//		WebElement login=driver.findElement(By.id("submit"));
//		System.out.println(login.isEnabled());
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(2000);
		WebElement but=driver.findElement(By.xpath("//button[.='Register']"));
		System.out.println(but.isDisplayed());
		
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}