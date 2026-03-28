package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interact_web {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("Bhai");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		lastname.sendKeys("Kumar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value='APIs']")).click();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.className("select2-selection__arrow"));
		Thread.sleep(2000);
		dropDown.click();
		
	//	dropDown.sendKeys("India");
		//dropDown.click();
		

	}

}