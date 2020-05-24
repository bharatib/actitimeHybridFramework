package com.qa.acttimeTestCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class ActiTimeCreateProject extends ActiBaseTest{
	
	@Test
	public void CreateProject() throws InterruptedException {
		log =extent.createTest("Create Test under Task Menu");
		lp.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		log.log(Status.PASS, "Login Sucessful");
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
		ttl.ClickOnNewProject();
		ttl.EnterProjectName("iTop Project");
		ttl.ClickOnCustomerComboBox();
		ttl.SelectCustomer();
		ttl.EnterProjectDesc("This is Bharati's first procject");
		ttl.EnterTaskOne("Bharati's Task one");
		ttl.ClickTaskDescription();
		ttl.EnterTaskDescription("This Task Created on 05/23/2020");
		ttl.ClickOnSaveBtn();
		ttl.ClickOnDeadLineBtn();
		ttl.SelectDeadLineDate();
		ttl.ClickOnTypeOfWork();
		ttl.SelectTypeOfWork();
		ttl.ClickOnCreateProject();
		
		tt.CickOnLogoutLink();
	}

}
