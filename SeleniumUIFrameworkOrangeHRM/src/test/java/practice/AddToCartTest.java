package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.Baseclass;

import java.util.*;

public class AddToCartTest extends Baseclass{
	WebDriver driver=null;
	ChromeOptions opt=null;
	@Test(priority=-1)
	public void launchingBrowser() {
	opt=new ChromeOptions();
	opt.addArguments("--incognito");
	driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	
		
	}
	@Test(priority=1,dependsOnMethods ="launchingBrowser")
	public void login() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			System.out.print("success");
		else
			System.out.print("fail");
		
	}
	@Test(priority=2,dependsOnMethods ="login")
	public void addToCart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.id("shopping_cart_container")).click();
		
		//List<WebElement> productsInCart=driver.findElements(By.cssSelector(""));
		//String AddToCartVerify="";
//		for(WebElement cartproducts:productsInCart) {
//			AddToCartVerify+=
//		}
//		boolean found=false;
//		for(WebElement product : productsInCart)
//		{
//		    if(product.getText().equals(cartA))
//		    {
//		    	
//		        found = true;
//		        break;
//		    }
//		}
//
//		if(found)
//		    System.out.println("Product present in cart");
//		else
//		    System.out.println("Product not present");
		String title="";
		List<WebElement> items= driver.findElements(By.cssSelector("[class='cart_item']"));
		for(WebElement item:items) {
			title+=item.getText();
		}
		if(title.contains("Sauce Labs Backpack") && title.contains("Sauce Labs Bolt T-Shirt")) {
			Reporter.log("sir method verified ",true);
		}
		else {
			Reporter.log("sir method not success ",true);
		}
			
		String prod1 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText();
		String prod2=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]")).getText();
		if(prod1.equals("Sauce Labs Backpack") && prod2.equals("Sauce Labs Bolt T-Shirt"))
			Reporter.log("successfully added",true);
		
	}
	
	@Test(priority=3,dependsOnMethods ="login")
	public void logout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(2000);
		driver.quit();

	}
}
	
		
