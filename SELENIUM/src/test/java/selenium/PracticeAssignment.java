package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://www.google.com");
//		driver.findElement(By.tagName("textarea")).sendKeys("virat",Keys.ENTER);
//		Thread.sleep(2000);
		
//		driver.get("http://www.gmail.com");
//		driver.findElement(By.tagName("input")).sendKeys("hariprasathsath05@gmail.com",Keys.ENTER);
//		Thread.sleep(5000);
//		// driver.findElement(By.linkText("Try again")).click();
		
//		driver.get("http://www.chatgpt.com");
//		driver.findElement(By.tagName("span")).click();
//		
		    
	//	driver.get("http://www.twitter.com");
	//	driver.findElement(By.linkText("Get Grok")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.tagName("textarea")).sendKeys("Hi! What is your name",Keys.ENTER);
		
	//	driver.get("http://maps.google.com");
	//	Thread.sleep(7000);
	//	driver.findElement(By.linkText("Restaurants")).click();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.tagName("div")).click();
		
		driver.get("http://www.instagram.com");
		driver.findElement(By.tagName("input")).sendKeys("hari_135",Keys.ENTER);
		
		driver.get("http://www.wikipedia.com");
		driver.findElement(By.tagName("div")).click();
		
		driver.get("http://www.Threads.com");
		driver.findElement(By.tagName("input")).sendKeys("hari_135",Keys.ENTER);
		

        
		        
		        
		driver.get("https://testfreshers.qspiders.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("standard-adornment-weight"));
		Thread.sleep(3000);
		        
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ybar-sbq"))
			.sendKeys("Selenium WebDriver", Keys.ENTER);
		Thread.sleep(3000);
		       
		        
		        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		        Thread.sleep(2000);
		        driver.findElement(By.id("login1")).sendKeys("test");
		        
		        driver.get("https://duckduckgo.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("searchbox_input"))
		              .sendKeys("Automation", Keys.ENTER);
		        
		        driver.get("https://www.bing.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("sb_form_q"))
		              .sendKeys("Selenium", Keys.ENTER);

//		         YouTube
		        driver.get("https://www.youtube.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("guide-button")).click();

		        // Google
		        driver.get("https://www.google.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("APjFqb"))
		              .sendKeys("Selenium", Keys.ENTER);

		        // Amazon
		        driver.get("https://www.amazon.in/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("twotabsearchtextbox"))
		              .sendKeys("Laptop", Keys.ENTER);

		        // Wikipedia
		        driver.get("https://www.wikipedia.org/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("searchInput"))
		              .sendKeys("India", Keys.ENTER);

		        //  Gmail
		        driver.get("https://accounts.google.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		        Thread.sleep(2000);


		    }
		
		
		
		
	}


