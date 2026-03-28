package demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {
	public String captureScreen(WebDriver driver,String testName) throws IOException{
		String timeStamp=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String path=System.getProperty("");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File(path);
			
		
		return path;
	}

}
