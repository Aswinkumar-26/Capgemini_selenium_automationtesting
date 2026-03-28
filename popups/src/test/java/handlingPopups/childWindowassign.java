package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowassign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		String pid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		allid.remove(pid);
		for(String cid:allid) {
			driver.switchTo().window(cid);
		}
		WebElement addtocart=driver.findElement(By.xpath("//button[@class='bg-orange-600 text-white px-6 py-2 rounded-lg hover:bg-orange-700 transition duration-200']"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		WebElement cartlogo=driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartlogo.click();
		Thread.sleep(3000);
		
		WebElement shopcartlist=driver.findElement(By.tagName("h2"));
		if(shopcartlist.isDisplayed()) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}