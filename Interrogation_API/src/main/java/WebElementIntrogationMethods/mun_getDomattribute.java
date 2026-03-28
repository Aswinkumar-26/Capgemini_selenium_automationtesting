package WebElementIntrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mun_getDomattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement st=driver.findElement(By.id("small-searchterms"));
		System.out.println(st.getAttribute("id"));
		System.out.println(st.getDomAttribute("id"));
		System.out.println(st.getDomProperty("id"));
		
		
		System.out.println();
		
		System.out.println(st.getAttribute("value"));
		System.out.println(st.getDomAttribute("value"));
		System.out.println(st.getDomProperty("value"));
		
		System.out.println();
		
		st.sendKeys("computer");
		
		System.out.println(st.getAttribute("value"));
		System.out.println(st.getDomAttribute("value"));
		System.out.println(st.getDomProperty("value"));
		
		

	}

}