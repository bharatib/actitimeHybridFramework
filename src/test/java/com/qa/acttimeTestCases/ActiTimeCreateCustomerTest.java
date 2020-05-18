package com.qa.acttimeTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.acttimePages.ActiEnterTimeTrackPage;
import com.qa.acttimePages.ActiTimeLoginPage;
import com.qa.acttimePages.ActiTimeTaskListPage;

public class ActiTimeCreateCustomerTest extends ActiBaseTest{
	
			
	@Test
	public void createCustomer() throws InterruptedException 
	{
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		String loginpgTitle=lp.verifyLoginTitle();
		System.out.println(loginpgTitle);
		Thread.sleep(1000);
		String timeTrackPageTitle=tt.verifyTimeTrackPageTitle();
		System.out.println("Time Track Page Title is : " + timeTrackPageTitle);
		
		String username = tt.verifyUsername();
		System.out.println("Logged username is :  " + username);
		
		tt.verifyTaskMenuOption();
		
		//Verify and Click on Add New button
		
		boolean addNewbtn = ttl.isDisplayedAddNewButton();
		
		System.out.println("Is Add New Button Displayed :" + addNewbtn);
		
		ttl.clickonAddNewButton();
		
        // Verify Create New Customer Menu item and Click
		 Assert.assertTrue(ttl.isDisplayedCreatNewCustomer());
		 
		ttl.clickOnCreatNewCustomer();
		
		//Verify Details Tab
		boolean detailsTabdis = ttl.isDisplayedDetailsTab();
		System.out.println("Is DETAILS Tab displayed :" + detailsTabdis );
		
		String detailstab = ttl.verifyDetailsTab();
		System.out.println("Tab Name is : " + detailstab);
		
		//Verify and Enter Customer name
		boolean custName=ttl.isDisplayedCustomerName();
		System.out.println("Is Customer Name Displayed  :" + custName);
				
		ttl.enterCustomerName("test123");
		
		//Verify and enter customer description
		boolean custdesc = ttl.isDisplayedcustomerDescTb();
		System.out.println("Is Customer Description displayed : " + custdesc);
		
		ttl.enterCustomerDescription("Test Customer Description");
		
		//Verify project dropdown field
		boolean projectdropDown = ttl.isDisplayedselectProjectDropdown();
		System.out.println("Is Project DropDown Displayed : " + projectdropDown);
	//	ttl.selectProject(0);
						
		//Verify and click on Create customer Button
		boolean custbtn = ttl.isDisplayedcreateCustomerbtn();
		System.out.println("Is Create Customer Button Displayed :" + custbtn);
	    ttl.createCutomerButton();
	}
	
}
