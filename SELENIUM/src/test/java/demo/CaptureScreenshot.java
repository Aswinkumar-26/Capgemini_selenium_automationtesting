package demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import generic_utility.WebDriverUtility;

public class CaptureScreenshot {
	
	public void screenShot() {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		Loginpage lp=new LoginPage(driver);
		
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("");
		lp.login("Admin","admin123");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("");
		FileHandler.copy(temp, perm);
		
		WebElement recruitmentLink =dbp.getRecruitmentlink();
		recruitmentLink.click();
		Thread.sleep(2000);
		File tempsrc=ts.getScreenshotAs(OutputType.FILE);
		File permTrg=new File("");
		FileHandler.copy(tempsrc, permTrg);
	}

}
