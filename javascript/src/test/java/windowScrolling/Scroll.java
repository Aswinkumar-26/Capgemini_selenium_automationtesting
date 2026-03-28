package windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		//by using scroll by
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("song",Keys.ENTER);
		WebElement vid=driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[6]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",vid);
		Thread.sleep(2000);
		driver.quit();

	}

}
