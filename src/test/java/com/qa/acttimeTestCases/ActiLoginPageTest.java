package com.qa.acttimeTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.acttimeBase.DriverScript;
import com.qa.acttimePages.ActiTimeLoginPage;

public class ActiLoginPageTest extends DriverScript{
	
	ActiTimeLoginPage lp;
	
	public ActiLoginPageTest() {
		super();
	}
	

	
	@BeforeMethod
	public void preTest()
	{
		initApp();
		lp = new ActiTimeLoginPage();
		
	}
	
	@Test(priority=1)
	public void testVerifyActiLogo()
	{
		boolean flag = lp.verifyActiLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void testVerifyLoginPageTitle()
	{
		String title = lp.verifyLoginTitle();
		Assert.assertEquals("actiTIME - Login", title);
	}
	
	/*@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLogin("admin", "manager");
	}*/
	
	@Test(priority=3)
	public void testValidateLoginFunction()
	{
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void postTest()
	{
		driver.close();
	}

}
