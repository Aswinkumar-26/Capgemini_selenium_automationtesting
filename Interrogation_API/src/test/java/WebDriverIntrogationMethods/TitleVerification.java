package WebDriverIntrogationMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// We can also do storing and process
//		try {
//		System.out.println(driver.getTitle().equals("Demo Web Shop"));
//		throw new Exception();
//		
//		}
//		catch(Exception e) {
//			System.out.println("Invalid print"));
//		}
//	}
		
	//	System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		driver.quit();
	}
}