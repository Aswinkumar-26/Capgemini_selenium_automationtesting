package Utility_package;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	public String captureScreenshot(WebDriver driver,String testName) throws InterruptedException {
	//Creating a method for time-stamp
		String timestamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		String path = "./Reports/"+ testName + "" + timestamp +".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		Thread.sleep(4000);
		File temp=ts.getScreenshotAs(OutputType.FILE);
		try {
			File perm = new File(path);
			FileHandler.copy(temp, perm);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return path;
	}
}