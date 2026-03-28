package handling_synchronization_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		String cur=driver.getWindowHandle();
		
         
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-medium w-100 text-uppercase']")).click();
		
		String sec=driver.getWindowHandle();
		
		String cururl="https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin";
		
		if(driver.getCurrentUrl().equals(cururl))
				System.out.println("Success");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Employees']")).click();
		
		driver.findElement(By.cssSelector("a[href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();
		
		driver.findElement(By.cssSelector("button[class='ant-btn css-dev-only-do-not-override-240cud ant-btn-dashed ant-btn-color-default ant-btn-variant-dashed'")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[contains(@class,'ant-btn-dashed')]")).click();
		
		//driver.findElement(By.cssSelector("rc_select_8")).click();
		driver.findElement(By.xpath("//label[@for='department']/../..//input")).click();

		
	}

}
