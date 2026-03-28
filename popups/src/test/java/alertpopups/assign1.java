package alertpopups;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Dresses",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Thread.sleep(3000);
		String pid=driver.getWindowHandle();
		Set<String> aid=driver.getWindowHandles();
		aid.remove(pid);
		for(String cid:aid) {
			driver.switchTo().window(cid);
		}
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}