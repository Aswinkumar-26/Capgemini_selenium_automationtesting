package Utility_package;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static ExtentReports extent;
	
		public static ExtentReports getInstance() {
			if(extent==null) {
				ExtentSparkReporter spark=new ExtentSparkReporter("./reports/test_result.html");
				//ReporterConfiguration
				spark.config().setReportName("OrangeHRM UI automation report");
				spark.config().setDocumentTitle("test results");
				extent=new ExtentReports();
				extent.attachReporter(spark);
				extent.setSystemInfo("VV tester", "Bhai");
				extent.setSystemInfo("UI_Automation_Framework","SeleniumTestNg");
			}
			return extent;
		}
	}