package handling_synchronization_methods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		
		String mid=driver.getWindowHandle();
		
		//driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.cssSelector("a[href='http://www.facebook.com/nopCommerce']")).click();

		
		driver.findElement(By.linkText("Twitter")).click();
		
		
		driver.findElement(By.linkText("youtube")).click();
		
		Set<String> all=driver.getWindowHandles();
		all.remove(mid);
		for(String id:all) {
			
		}
		
	}

}
