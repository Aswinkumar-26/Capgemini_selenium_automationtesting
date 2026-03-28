package orange_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vacancies_OrangeHRM {
	WebDriver driver;
	dashboardpage dbp;
	public Vacancies_OrangeHRM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		  dbp = new dashboardpage(driver);
			
	}
	
	@FindBy(xpath="//a[.='Vacancies']")
	WebElement Vacancies;
	public void click_recruitment() {
		dbp.clickRecruitmentlink();
	}
	public void click_vacancies() {
		Vacancies.click();
	}
	
}