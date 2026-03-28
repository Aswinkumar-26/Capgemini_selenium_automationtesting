package assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://icehrmpro.gamonoid.com/");
		driver.findElement(By.id("username")).sendKeys("admi");
		driver.findElement(By.id("password")).sendKeys("admi");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		//log in failed due to invalid credentials so login again
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		driver.findElement(By.xpath("//span[.='Employees']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='admin_Employees']//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		WebElement we= driver.findElement(By.xpath("//label[@for='department']/../..//input"));
		we.click();
		we.sendKeys(Keys.ARROW_DOWN);
		we.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Save']")).click();
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		System.out.println(we.isDisplayed());
		WebElement e= driver.findElement(By.xpath("//input[@id='rc_select_4']"));
		e.click();
		e.sendKeys(Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
		System.out.println(e.isDisplayed());
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
	
		
		
		
		
		
		

	}

}