package javascriptpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc']")).click();
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.cssSelector("a[href*='http://www.orangehrm.com']")).click();
		
		Set<String> all=driver.getWindowHandles();
		
		for(String window:all) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		String url=driver.getCurrentUrl();
		String title = null;
		if(url.contains("https://www.orangehrm.com"))
		title=driver.getTitle();
		if(!title.isEmpty())
			driver.close();
			
			driver.switchTo().window(parentWindow); 	
			if(driver.getCurrentUrl().contains("login"))
				driver.quit();
				
		


	}

}
