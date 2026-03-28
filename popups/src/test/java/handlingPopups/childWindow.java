package handlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']")).click();
		Thread.sleep(3000);
		String pid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		allid.remove(pid);
		for(String cid:allid) {
			driver.switchTo().window(cid);
		}
		driver.findElement(By.xpath("(//input[@data-hover='Select <b>_dims_</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}