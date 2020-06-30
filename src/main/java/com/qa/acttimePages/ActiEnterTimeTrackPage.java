package com.qa.acttimePages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.actitimeUtilities.Common;
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
		Common.highLightElement(actiTaskMenuOption);
		actiTaskMenuOption.click();
	}
	
	public void CickOnLogoutLink() throws InterruptedException
	{
		Thread.sleep(2000);
		Common.highLightElement(actiLogoutLink);
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
