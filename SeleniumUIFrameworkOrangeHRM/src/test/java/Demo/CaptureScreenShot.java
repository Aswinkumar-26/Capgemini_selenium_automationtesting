package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Utility_package.WebDriverUtility;
import orange_pom.dashboardpage;
import orange_pom.login;

public class CaptureScreenShot {
	@Test
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverUtility wu = new WebDriverUtility(driver);
		login l = new login(driver);
		dashboardpage dbp = new dashboardpage(driver);
		//creating a method for time-stamp
		String Timestamp = new SimpleDateFormat("yyyy-mm-dd[hh-mm-ss]").format(new Date());
		
		wu.configMaximizedBrowser();
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		l.entercred("Admin", "admin123");
		Thread.sleep(3000);
		//Capture the screenshot of home page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Reports/dashboard.png");
		FileHandler.copy(temp,perm);
		// Capture the screenshot of web element
		WebElement recruitmentLink = dbp.getRecruitmentlink();
		recruitmentLink.click();
		Thread.sleep(2000);
		File tempsrc = ts.getScreenshotAs(OutputType.FILE);
		File permTrg = new File("./Reports/recruitment.png" +Timestamp+".png");//timestamp doesn't override the img it create the new image
		FileHandler.copy(tempsrc, permTrg);
		
	}

}