package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
        WebElement c=driver.findElement(By.id("circle"));
        Actions act=new Actions(driver);
        act.clickAndHold(c).pause(3000).release().perform();
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
        WebElement s1=driver.findElement(By.linkText("Mobile Charger"));
        WebElement s2=driver.findElement(By.linkText("Mobile Accessories"));
        act.dragAndDrop(s1, s2);
        
	}

}