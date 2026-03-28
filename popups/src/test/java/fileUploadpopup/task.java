package fileUploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cFRyY5T9ukMLW4Ep3j1bMDL9&gclid=Cj0KCQiA8KTNBhD_ARIsAOvp6DJc709B1uur8OPeAZtoa6Lxi2lUR9Fp3n5DxXtqA-rwKPZqI6BcmSwaAmlFEALw_wcB");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(.,'I')]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\acer\\Downloads\\M1_Capgemini.pdf");
		
		
		
	}

}