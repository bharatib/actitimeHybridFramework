package com.qa.acttimePages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.qa.acttimeBase.DriverScript;

public class ActiEnterTimeTrackPage extends DriverScript{
	
	@FindBy(id = "container_tasks") WebElement actiTaskMenuOption;
	@FindBy(id = "logoutLink") WebElement actiLogoutLink;
	@FindBy(xpath = "//a[@class='userProfileLink username']") WebElement userProfileLink;
	
	
	
	
	
	public ActiEnterTimeTrackPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTaskMenuOption()
	{
		
		actiTaskMenuOption.click();
	}
	
	public void verifyLogoutLink()
	{
		actiLogoutLink.click();
	}
	
	public String verifyUsername()
	{
		return userProfileLink.getText();
	}
	
	public String verifyTimeTrackPageTitle()
	{
		return driver.getTitle();
	}

}
