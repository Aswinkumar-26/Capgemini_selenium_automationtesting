package WebDriverIntrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(3000);
		String pid=driver.getWindowHandle();
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		windows.remove(pid);
		System.out.println(windows);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}