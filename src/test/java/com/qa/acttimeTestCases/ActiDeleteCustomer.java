package com.qa.acttimeTestCases;

import org.testng.annotations.Test;

public class ActiDeleteCustomer extends ActiBaseTest{
	
	@Test
	public void DeleteCustomer() throws InterruptedException{
		lp.validateLogin("admin", "manager");
		tt.verifyTaskMenuOption();
		ttl.EnterToSearchCustomer("test123");
	//	Thread.sleep(2000);
	//	ttl.ClickSearchCustomer();
		ttl.ClickHighlightedCustomer();
		ttl.ClickOnEditButton();
		ttl.ClickOnActionBtn();
		ttl.ClickDeleteCustomerButton();
		ttl.ClickDeleteConfiramtionBtn();
	}

}
