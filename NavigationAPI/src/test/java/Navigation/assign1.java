package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).sendKeys("Automation");
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.amazon.in/");
//		Thread.sleep(2000);
//	    WebElement web =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//	    web.sendKeys("tools");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2200);
////		driver.navigate().back();
////		System.out.println(driver.getTitle());
////		
//		
//		WebElement web1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		web1.sendKeys("check1");
//		Thread.sleep(2000);
//		web1.clear();
//		Thread.sleep(2000);
//		//web1.clear();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(12000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.name("password"));
		wb.sendKeys("admin123");
		wb.submit();
	
		
		
		
		
		

		
		

	}

}