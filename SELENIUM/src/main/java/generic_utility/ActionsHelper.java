package generic_utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver driver;
	Actions act;
	public ActionsHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOneElement(WebElement element) {
		act.moveToElement(element).click().perform();
	}
	
	public void navigateDownDropdown(WebElement element) {
		act.click(element).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
	}

}
