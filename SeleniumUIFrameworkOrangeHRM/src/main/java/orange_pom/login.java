package orange_pom;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class login {
		public login(WebDriver driver){
			//this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(name="username")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(css = "button[type='submit']")
		WebElement loginbtn;
		
		public void entercred(String un,String pass) {
			userName.sendKeys(un);
			password.sendKeys(pass);
			loginbtn.click();
		}

	}