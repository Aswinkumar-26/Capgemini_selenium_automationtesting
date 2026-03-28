package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		//Create a new Test
		ExtentReports test = new ExtentReports();
		// Create a reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");//Path to store the reports
		test.attachReporter(spark);
		test.createTest("Sample Test");
		ExtentTest ref = test.createTest("Sample Test");
		// Logging
		ref.info("--Started test execution--");
		ref.info("--The test step has passes--");
		ref.info("--The test step has failed--");
		 // flush
		test.flush();
	}
	
	
}