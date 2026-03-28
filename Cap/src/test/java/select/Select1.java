package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("Skills"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(9);
		Thread.sleep(2000);
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("JavaScript");
		Thread.sleep(2000);
//		sel.selectByContainsVisibleText("Java");
//		Thread.sleep(2000);
	}

}
