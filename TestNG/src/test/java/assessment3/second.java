package assessment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class second {
	@Test

	public void method1() {
		ChromeOptions opt=new  ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//option[contains(.,'Price (low to high)')]")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		String v=driver.findElement(By.className("inventory_item_name")).getText();
		String av="Sauce Labs Onesie";
		Assert.assertEquals(v,av);
		if(v.equals(av)) {
			Reporter.log("item verified",true);
		}
		else {
			Reporter.log("item not verified",true);
		}
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("naveen");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600007");
		driver.findElement(By.id("continue")).click();
		WebElement total=driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		String sum=total.getText();
		String asum="Total: $8.63";
		boolean sum1=sum.equals(asum);
		String ap="Sauce Labs Onesie";
		String ep=driver.findElement(By.className("inventory_item_name")).getText();
		boolean sum2=ap.equals(ep);
		Assert.assertEquals(sum1, sum2);
		if(sum.equals(asum)) {
			System.out.println("summary verified");       
		}
		else {
			System.out.println("summary not verified");
		}
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();



		
		
		
	}

}