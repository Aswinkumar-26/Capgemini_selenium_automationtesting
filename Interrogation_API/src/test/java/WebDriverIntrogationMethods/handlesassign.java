package WebDriverIntrogationMethods;

import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlesassign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(3000);
		String f=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(3000);
		String t=driver.getWindowHandle();
		Set<String> win=driver.getWindowHandles();
		System.out.println(win);
//		LinkedHashSet<String> windows=new LinkedHashSet<>(driver.getWindowHandles());
//		System.out.println(windows);
//		int count=0;
//		for(String s:windows) {
//			if(count==1) {
//				System.out.println("Facebook id:"+s);
//			}
//			if(count==2) {
//				System.out.println("twiiter id:"+s);
//			}
//			count++;
//		}
		
		for(String s:win) {
			driver.switchTo().window(s);
			System.out.println("Title :"+driver.getTitle());
			Thread.sleep(2000);
			System.out.println("Id:"+s);
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}