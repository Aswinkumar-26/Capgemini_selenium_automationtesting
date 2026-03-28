package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement radio=driver.findElement(By.id("pollanswers-1"));
		System.out.println(radio.isSelected());
		radio.click();
		System.out.println(radio.isSelected());
		

	}

}