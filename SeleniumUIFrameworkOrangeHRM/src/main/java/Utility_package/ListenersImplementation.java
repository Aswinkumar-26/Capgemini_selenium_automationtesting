package Utility_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import orange_pom_base.base_class;

public class ListenersImplementation implements ITestListener  {
	

	    ExtentReports extent = ExtendReportUtility.getInstance();
	    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	    @Override
	    public void onTestStart(ITestResult result) {
	        ExtentTest et = extent.createTest(result.getMethod().getMethodName());
	        test.set(et);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.get().pass("Test status: PASS");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        test.get().fail("Test Failed: " + result.getMethod().getMethodName());
	        test.get().fail(result.getThrowable());

	        Object obj = result.getInstance();
	        base_class bc = (base_class) obj;
	        WebDriver driver = bc.driver;

	        ScreenshotUtility sc = new ScreenshotUtility();

	        try {
	            String path = sc.captureScreenshot(driver, result.getMethod().getMethodName());
	            test.get().addScreenCaptureFromPath(path);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.get().skip("Test status: SKIPPED");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
	
	}