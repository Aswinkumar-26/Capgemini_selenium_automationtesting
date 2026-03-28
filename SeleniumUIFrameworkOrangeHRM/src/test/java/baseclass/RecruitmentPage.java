package baseclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
	WebDriver driver;
	public RecruitmentPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText = "Vacancies")
	WebElement vacancylink;
	
	@FindBy(xpath = "//button[.=' Add ']")
	WebElement addvacancybtn;
	
	@FindBy(xpath = "//label[.='Vacancy Name']/../../div/input")
	WebElement vacancynamefield;
	
	@FindBy(xpath = "//div[.='-- Select --' and @class='oxd-select-text-input']")
	WebElement jobtitledropdown;
	
	@FindBy(css = "textarea[placeholder='Type description here']")
	WebElement descriptionfield;
	
	@FindBy(css = "input[placeholder='Type for hints...']")
	WebElement hiringmanagerfield;
	
	@FindBy(xpath = "//label[.='Number of Positions']/../../div/input")
	WebElement no_of_posfield;
	
	@FindBy(css = "button[type='submit']")
	WebElement savebtn;

	public WebElement getVacancylink() {
		return vacancylink;
	}

	public void clickVacancylink() {
		getVacancylink().click();
	}

	public WebElement getAddvacancybtn() {
		return addvacancybtn;
	}

	public void clickAddvacancybtn() {
		getAddvacancybtn().click();
	}

	public WebElement getVacancynamefield() {
		return vacancynamefield;
	}

	public void setVacancynamefield(String vacancyname) {
		getVacancynamefield().sendKeys(vacancyname);
	}

	public WebElement getJobtitledropdown() {
		return jobtitledropdown;
	}

	public void selectJobtitledropdown() {
		Actions act=new Actions(driver);
		act.click(getJobtitledropdown()).pause(1000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
	}

	public WebElement getDescriptionfield() {
		return descriptionfield;
	}

	public void setDescriptionfield(String desc) {
		getDescriptionfield().sendKeys(desc);
	}

	public WebElement getHiringmanagerfield() {
		return hiringmanagerfield;
	}

	public void setHiringmanagerfield(String manager) {
		getHiringmanagerfield().sendKeys(manager);
	}

	public WebElement getNo_of_posfield() {
		return no_of_posfield;
	}

	public void setNo_of_posfield(String pos) {
		getNo_of_posfield().sendKeys(pos);
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void clickSavebtn() {
		getSavebtn().click();
	}
	

	public void addvacancy(String vacancyname,String desc,String manager,String pos) {
		clickVacancylink();	
		clickAddvacancybtn();
		setVacancynamefield(vacancyname);
		setDescriptionfield(desc);
		setHiringmanagerfield(manager);
		setNo_of_posfield(pos);
		clickSavebtn();
	}

}




