package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		Set<String> allids=driver.getWindowHandles();
		allids.remove(driver.getWindowHandle());
		String yid="";
		for(String cid:allids) {
			driver.switchTo().window(cid);
			if(driver.getTitle().equals("nopCommerce - YouTube")) {
				yid=cid;
			}
		}
		driver.switchTo().window(yid);
		
		for(String cid:allids) {
			String s=driver.switchTo().window(cid).getTitle();
			if(s.equals("www.facebook.com")) {
				driver.close();
			}
			else if(s.equals("nopCommerce (@nopCommerce) / X")) {
				driver.close();
			}
			
		}


	}

}