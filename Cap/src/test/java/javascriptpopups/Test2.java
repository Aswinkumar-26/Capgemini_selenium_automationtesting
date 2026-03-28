package javascriptpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login?utm_source=chatgpt.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.getWindowHandle();
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123",Keys.ENTER);
		
		driver.getWindowHandle();
		
		driver.findElement(By.linkText("Admin")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		
		
		//WebElement dropdown = driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]"));
	
		
		
		WebElement dropdown=driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][1])"));
		dropdown.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//div[@role='option']//span[normalize-space()='Admin']")).click();	
		
		String role=dropdown.getText();
		System.out.println(role);
		
		dropdown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='ESS']")).click();
		
		String role2=dropdown.getText();
		System.out.println(role2);
		
		driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
		
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name'][1]")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

}
