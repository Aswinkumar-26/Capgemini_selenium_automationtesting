package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		String browser="chrome";
		
		WebDriver driver=null;
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browser.contains("firefox")){
			driver=new FirefoxDriver();
			
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
	}

}
}
