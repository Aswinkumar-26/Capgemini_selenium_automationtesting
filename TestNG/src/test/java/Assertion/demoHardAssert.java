package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demoHardAssert {
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertTrue(expectedTitle.equals(actualTitle));
		Assert.assertEquals(expectedTitle.equals(actualTitle), true);
		
		
		
		
	}
}