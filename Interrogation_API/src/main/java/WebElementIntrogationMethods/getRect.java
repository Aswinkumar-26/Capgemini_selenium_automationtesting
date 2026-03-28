package WebElementIntrogationMethods;



import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement rect=driver.findElement(By.linkText("Register"));
		Rectangle rect1=rect.getRect();
		System.out.println(rect1.getDimension());
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getWidth());
		System.out.println(rect1.getPoint());
		System.out.println(rect1.getX());
		System.out.println(rect1.getY());
		

	}

}