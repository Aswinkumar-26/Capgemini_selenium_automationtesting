package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class assign2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement fn=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		fn.sendKeys("naveen");
		Thread.sleep(3000);
		WebElement ln=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(fn));
		ln.sendKeys("kumar");
		Thread.sleep(3000);
		WebElement address=driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(fn));
		address.sendKeys("rtylll");
//		Thread.sleep(3000);
//		WebElement n1=driver.findElement(RelativeLocator.with(By.tagName("button")).below(n));
//		n1.click();
		

	}

}