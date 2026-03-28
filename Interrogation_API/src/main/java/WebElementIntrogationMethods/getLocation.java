package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		Point loc=we.getLocation();
		System.out.println(loc);
	    System.out.println(loc.getX());
	    System.out.println(loc.x);
	    System.out.println(loc.getY());
	    System.out.println(loc.y);
	    
	    Thread.sleep(2000);
		
	}

}