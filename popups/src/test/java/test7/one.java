package test7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		WebElement oh=driver.findElement(By.partialLinkText("OrangeHRM, Inc"));
		String pid=driver.getWindowHandle();
		oh.click();
		Set<String> aid=driver.getWindowHandles();
		for(String cid:aid) {
			driver.switchTo().window(cid);
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);//orange hrm url
		System.out.println(driver.getTitle()); //title
		driver.close();//child window close
		driver.switchTo().window(pid);
		Thread.sleep(3000);
		driver.quit();
		

	}

}