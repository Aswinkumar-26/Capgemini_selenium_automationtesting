package assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://icehrmpro.gamonoid.com/");
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.id("username")).sendKeys("admi");
		driver.findElement(By.id("password")).sendKeys("admi");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		driver.findElement(By.xpath("//span[.='Employees']")).click();
		driver.findElement(By.xpath("//ul[@id='admin_Employees']//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		driver.findElement(By.xpath("//a[.='Skills']")).click();
		driver.findElement(By.xpath("//span[.=' Add New']")).click();

	}

}