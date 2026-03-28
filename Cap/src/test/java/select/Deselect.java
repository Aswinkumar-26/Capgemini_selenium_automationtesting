package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1&scenario=1");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'bg-orange-500')]")).click();
		Thread.sleep(1000);

	}

}
