package WebDriverIntrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver1.getWindowHandle());
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}