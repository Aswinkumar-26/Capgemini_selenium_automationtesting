package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		String eurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String aurl=driver.getCurrentUrl();
		Assert.assertEquals(eurl,aurl);
		if(eurl.equals(aurl)) {
			System.out.println("success");
		}
		else {
			System.out.println("not success");
		}
		

		
	}

}