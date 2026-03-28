package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class First_select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		WebElement listbox=driver.findElement(By.id("cars"));
		Select sel=new Select(listbox);
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Opel");
		Thread.sleep(2000);
		
		System.out.println(sel.getFirstSelectedOption());
		System.out.println(sel.getFirstSelectedOption().getText());
		driver.quit();

	}

}
