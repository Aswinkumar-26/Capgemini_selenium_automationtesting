package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class rightOf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement fn=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		WebElement ln=driver.findElement(RelativeLocator.with(By.tagName("input")).near(fn,100));
		ln.sendKeys("kumar");
		

	}

}