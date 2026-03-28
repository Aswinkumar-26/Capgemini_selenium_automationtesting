package objectrepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class baseClass {
	public WebDriver driver;
	@BeforeClass
	public void beforeclass() {
	ChromeOptions copt=new ChromeOptions();
	copt.addArguments("--incognito");

	driver=new ChromeDriver(copt);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
}