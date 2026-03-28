package orange_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	public class logout {
		public logout(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath = "//div[@class='oxd-topbar-header-userarea']/ul/li/span/i")
		private WebElement userdropdown;
		
		@FindBy(partialLinkText = "Logout")
		private WebElement  logoutlink;

		public WebElement getUserdropdown() {
			return userdropdown;
		}

		public void clickUserdropdown() {
			getUserdropdown().click();
		}

		public WebElement getLogoutlink() {
			return logoutlink;
		}

		public void clickLogoutlink() {
			getLogoutlink().click();;
		}
		
		public void logout(){
			clickUserdropdown();
			clickLogoutlink();
		}
	}