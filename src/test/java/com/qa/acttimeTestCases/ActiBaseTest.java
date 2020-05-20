package com.qa.acttimeTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.acttimeBase.DriverScript;
import com.qa.acttimePages.ActiEnterTimeTrackPage;
import com.qa.acttimePages.ActiTimeLoginPage;
import com.qa.acttimePages.ActiTimeTaskListPage;

public class ActiBaseTest extends DriverScript {

	ActiTimeLoginPage lp;
	ActiEnterTimeTrackPage tt;
	ActiTimeTaskListPage ttl;
	ExtentHtmlReporter htmlreport;
	ExtentReports extent;
	ExtentTest log;

	public ActiBaseTest() {
		super();
	}
	
	@BeforeClass
	public void PreClass() {
		htmlreport = new ExtentHtmlReporter("./actiReports/AutomationTestResult.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreport);
	}

	@BeforeMethod
	public void preTest()
	{
		initApp();
		lp = new ActiTimeLoginPage();
		tt = new ActiEnterTimeTrackPage();
		ttl = new ActiTimeTaskListPage();
	}
	
	@AfterMethod
	public void postTest() {
		driver.close();
		extent.flush();
	}

}
