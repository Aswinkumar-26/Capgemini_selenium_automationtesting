package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
		Dimension dim=we.getSize();
		System.out.println(dim);
		//height
		System.out.println(dim.getHeight());
		System.out.println(dim.height);
		//width
		System.out.println(dim.getWidth());
		System.out.println(dim.width);
		

	}

}