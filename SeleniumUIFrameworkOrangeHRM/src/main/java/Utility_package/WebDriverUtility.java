package Utility_package;


	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class WebDriverUtility {
		WebDriver driver;
		WebDriverWait wait;
		public WebDriverUtility(WebDriver driver){
			this.driver=driver;
		}
		//manage
		public void configMaximizedBrowser() {
			driver.manage().window().maximize();
		}
		public void configMinimizedBrowser() {
			driver.manage().window().minimize();
		}
		public void configFullscreenBrowser() {
			driver.manage().window().fullscreen();
		}
		public Dimension configBrowserSize() {
			Dimension dim=driver.manage().window().getSize();
			return dim;
		}
		public void fetBrowserSize(int width,int height) {
			driver.manage().window().setSize(new Dimension(width,height));
		}
		public Point configBrowserPosition() {
			Point point=driver.manage().window().getPosition();
			return point;
		}
		public void configBrowserPosition(int x,int y) {
			driver.manage().window().setPosition(new Point(x,y));
		}
		
		//navigate
		
		//navigateTo
		public void navigateToApplication(String url) {
			driver.navigate().to(url);
		}
		//forward
		public void navigateForward() {
			driver.navigate().forward();
		}
		//backward
		public void navigateBackward() {
			driver.navigate().back();
		}
		//refresh
		public void refreshCurrentPage() {
			driver.navigate().refresh();
		}
		//get
		public void enterUrl(String url) {
			driver.get(url);
		}
		
		//get title
		public String fetchApplicationTitle() {
			return driver.getTitle();
		}
		//getUrl
		public String fetchAppicationUrl() {
			return driver.getCurrentUrl();
		}
		//close
		public void closingBrowserTab() {
			driver.close();
		}
		//quit
		public void closingBrowserWindow() {
			driver.quit();
		}
		
		//timeouts
		public void waitForElementsToLoad(long timeSeconds) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSeconds));
		}
		//explicit wait
		public void waitTillTheElementIsClickable(WebElement element,long maximumTimetoWait) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(maximumTimetoWait));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		public void waitTillTheElementIsVisible(WebElement element,long maximumTimetoWait) {
			wait=new WebDriverWait(driver, Duration.ofSeconds(maximumTimetoWait));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		//popups
		//alert
		public void clickToAccept() {
			driver.switchTo().alert().accept();
		}
		public void clickOnDismiss() {
			driver.switchTo().alert().dismiss();
		}
		public void typeMsgInJsPopup(String text) {
			driver.switchTo().alert().sendKeys(text);
		}
		public String fetchJsPopupMsg() {
			String msg=driver.switchTo().alert().getText();
			return msg;
		}
		//child window switching
		public void childWindowSwitchingByTitle(String childAppTitle) {
			String pid=driver.getWindowHandle();
			Set<String> aid=driver.getWindowHandles();
			aid.remove(pid);
			for(String cid:aid) {
				driver.navigate().to(cid);
				String title=driver.getTitle();
				if(title.contains(childAppTitle)) {
					break;
				}
			}
		}
		//child window by url
		public void childWindowSwitchingByUrl(String childAppUrl) {
			String pid=driver.getWindowHandle();
			Set<String> aid=driver.getWindowHandles();
			aid.remove(pid);
			for(String cid:aid) {
				driver.navigate().to(cid);
				String url=driver.getCurrentUrl();
				if(url.contains(childAppUrl)) {
					break;
				}
			}
		}
		
		//Frames
		public void switchFrameIndex(int index) {
			driver.switchTo().frame(index);
		}
		public void switchFrameByIndexOrname(String idOrNumValue) {
			driver.switchTo().frame(idOrNumValue);
		}
		public void switchFrameByFrameElement(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
		public void switchBacktheControltoPreviousPage() {
			driver.switchTo().parentFrame();
		}
		public void switchBacktheControltoMainPage() {
			driver.switchTo().defaultContent();
		}
		
	}