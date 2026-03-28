package orange_pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_module {
    WebDriver driver;
    dashboardpage dbp;

    public PIM_module(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        dbp = new dashboardpage(driver);
    }

    @FindBy(xpath = "//a[.='Add Employee']")
    WebElement add_employee;

    @FindBy(xpath = "//button[.=' Add ']")
    WebElement add_btn;
    @FindBy(xpath="//span[.='Configuration ']")
    WebElement config_btn;
    @FindBy(xpath="//a[.='Optional Fields']")
	WebElement optional_field;
    @FindBy(xpath="//a[.='Custom Fields']")
    WebElement custom_field;
    @FindBy(xpath="(//a[@role='menuitem'])[3]")
    WebElement Data_import;
    @FindBy(linkText="Reporting Methods")
    WebElement reporting_methods;
    @FindBy(linkText="Termination Reasons")
    WebElement termination_reasons;
    @FindBy(xpath="//button[.=' Add ']")
    WebElement termination_reason_add_btn;
    @FindBy(xpath="//div[@role='row']//div[2]")
	private List<WebElement> term_reason;
    @FindBy(xpath="//button[.=' Save ']")
    WebElement save_btn;
    public void click_config() {
    	config_btn.click();
    	
    	
    	}
    public List<WebElement> getReasonList() {
		return term_reason;
	}
    
    public void click_termination() throws InterruptedException {
    	termination_reasons.click();
    	Thread.sleep(4000);
    	termination_reason_add_btn.click();
    	
    }
    public boolean add_termination_reason(String reason) throws InterruptedException {
    	
    	
    	
    	
    	
    	

    	    WebElement reasons = driver.findElement(By.xpath("//label[.='Name']/../..//input"));
    	    reasons.sendKeys(reason);

    	    save_btn.click();

    	    Thread.sleep(3000);   // wait for UI update

    	    for (WebElement str : term_reason) {
    	        if (str.getText().contains(reason)) {   // ✅ FIX
    	            return true;
    	        }
    	    }
    	    return false;
    	}
    
    public void clickadd_btn() {
        dbp.clickPimlink();   // Navigate to PIM
        add_btn.click();      // Click Add
    }
}