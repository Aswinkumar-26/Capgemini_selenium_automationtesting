package demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@Test
	public void login() throws IOException {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		FileInputStream f1=new FileInputStream("");
		Properties prop=new Properties();
		prop.load(f1);
		
		String URL=prop.getProperty("url");
		System.out.println(URL);
		String Browser=prop.getProperty("browser");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(Browser);
		System.out.println(username);
		System.out.println(password);
		
		
		
		
	}

}
