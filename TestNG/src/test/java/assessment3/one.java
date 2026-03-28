package assessment3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class one {
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
		String p="Products";
		WebElement prod=driver.findElement(By.xpath("//span[.='Products']"));
		Assert.assertEquals(prod.getText(),p);
		if(p.equals(prod.getText())) {
			System.out.println("products verified");
		}
		else {
			System.out.println("products not verified");
		}
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> items=driver.findElements(By.xpath("//div[@class='cart_list']//a"));
		int ac=2;
		int count=0;
		String s1="Sauce Labs Backpack";
		String s2="Sauce Labs Bolt T-Shirt";
		String s="";
		for(WebElement e:items) {
			s+=e.getText();
			count++;
		}
		Assert.assertTrue(s.contains(s1) && s.contains(s2));
		Assert.assertEquals(ac,count);
		if(ac==count) {
			System.out.println("cart iems verfied");
		}
		else {
			System.out.println("cart items not vrified");
		}
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("naveen");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("600007");
		driver.findElement(By.id("continue")).click();
		WebElement total=driver.findElement(By.xpath("//div[@class='summary_total_label']"));
		String tot=total.getText();
		String atot="Total: $49.66";
		Assert.assertEquals(tot, atot);
		if(tot.equals(atot)) {
			System.out.println("total amount validated");
		}
		else {
			System.out.println("total amount not validated");
		}
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		

	}

}