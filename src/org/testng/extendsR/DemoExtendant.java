package org.testng.extendsR;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoExtendant {
	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\eclipse\\Selenium\\TestNG\\reports\\rep.html");
		reporter.config().setDocumentTitle("Automation");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("regression test");

		ExtentReports ext = new ExtentReports();
		ext.attachReporter(reporter);

		ExtentTest test = ext.createTest("test1");

		ext.setSystemInfo("Env", "Dev");
		ext.setSystemInfo("Tester", "Ankur");
		ext.setSystemInfo("project", "pro");
		ext.setSystemInfo("version", "3.9");

		test.log(Status.INFO, "Working fine");
		test.log(Status.PASS, "test is pass");

		test.addScreenCaptureFromPath("C:\\Users\\Ankur Verma\\Desktop\\sc.jpg");

		ExtentTest test2 = ext.createTest("test2");
		test2.log(Status.FAIL, "Fail");

		ext.flush();
		System.out.println("Done");
	}

}
