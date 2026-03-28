package handling_synchronization_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		String cur=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		
		driver.findElement(By.id("username")).sendKeys("Admin");
		
		driver.findElement(By.id("password")).sendKeys("Admin",Keys.ENTER);
		
		//Login failed
		
		driver.navigate().to("https://icehrmpro.gamonoid.com/login.php");
         
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		
		String sec=driver.getWindowHandle();
		
//		String cururl="https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin";
//		
//		driver.getCurrentUrl();
		
//		if(!sec.equals(cur))
//			System.out.println("Success");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@class='navbar-btn sidebar-toggle']")).click();
		//driver.findElement(By.cssSelector("a[href*='#']")).click();
		
		driver.findElement(By.xpath("//span[text()='Employees']")).click();
		
		driver.findElement(By.cssSelector("a[href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		
		driver.findElement(By.id("tabEmployeeSkill")).click();
		 
		//driver.findElement(By.xpath("//button[@class='ant-btn css-dev-only-do-not-override-240cud ant-btn-primary ant-btn-color-primary ant-btn-variant-solid']")).click();
		

		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}

}
