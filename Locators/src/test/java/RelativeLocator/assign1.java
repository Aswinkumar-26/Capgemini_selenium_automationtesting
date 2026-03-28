package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement st=driver.findElement(By.id("name"));
		st.sendKeys("naveen");
		Thread.sleep(3000);
		WebElement test=driver.findElement(RelativeLocator.with(By.tagName("input")).below(st));
		test.sendKeys("n@gmail.com");
		Thread.sleep(3000);
		WebElement n=driver.findElement(RelativeLocator.with(By.tagName("input")).below(test));
		n.sendKeys("rtylll");
		Thread.sleep(3000);
		WebElement n1=driver.findElement(RelativeLocator.with(By.tagName("button")).below(n));
		n1.click();
		

	}

}