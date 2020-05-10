package com.qa.acttimeTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.acttimeBase.DriverScript;
import com.qa.acttimePages.ActiEnterTimeTrackPage;
import com.qa.acttimePages.ActiTimeLoginPage;
import com.qa.acttimePages.ActiTimeTaskListPage;

public class ActiBaseTest extends DriverScript {

	ActiTimeLoginPage lp;
	ActiEnterTimeTrackPage tt;
	ActiTimeTaskListPage ttl;

	public ActiBaseTest() {
		super();
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
	}

}
