package orange_pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class dashboardpage {
		public dashboardpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		@FindBy(partialLinkText = "Admin")
		private WebElement adminlink;
		
		@FindBy(xpath = "//span[.='PIM']")
		private WebElement pimlink;
		
		@FindBy(xpath="//span[text()='Recruitment']")
		private WebElement recruitmentlink;
		
		
		@FindBy(css = "[class='--active oxd-userdropdown']")
		private WebElement logoutdropdown;

		public WebElement getAdminlink() {
			return adminlink;
		}

		public void clickAdminlink() {
			getAdminlink().click();
		}

		public WebElement getPimlink() {
			return pimlink;
		}

		public void clickPimlink() {
			getPimlink().click();
		}

		public WebElement getLogoutdropdown() {
			return logoutdropdown;
		}

		public void clickLogoutdropdown() {
			getLogoutdropdown().click();
		}
		
		public WebElement getRecruitmentlink() {
			return recruitmentlink;
		}

		public void clickRecruitmentlink() {
			getRecruitmentlink().click();
		}
		
	}