package ccrossplatform;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class addTocart extends baseclass{

	
	@Test
	public void addtocart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		List<String> arr=new ArrayList<>();
		List<WebElement> cartlist=driver.findElements(By.xpath("//div[@class='cart_item']//a//div"));
		int count=0;
		for(WebElement cart:cartlist) {
			System.out.println(cart.getText());
			arr.add(cart.getText());
		}
		if(arr.get(0).equals("Sauce Labs Backpack") && arr.get(1).equals("Sauce Labs Bolt T-Shirt")) {
			Reporter.log("Verified",true);
		}
		else {
			Reporter.log("failed",true);
		}
	}
	
	
	
	

}