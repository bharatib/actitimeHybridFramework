package com.qa.acttimePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.acttimeBase.DriverScript;

public class actiTimeLoginPage extends DriverScript{
	
	//**************************************Page Elements************************************************//
	
	@FindBy(id = "logoContainer") WebElement actiLogo;
	@FindBy(id = "username") WebElement actiuser;
	@FindBy(name = "pwd") WebElement actipassword;
	@FindBy(id = "loginButton") WebElement actiLoginbtn;

	//**************************************Page Initialization************************************************//
	public actiTimeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//**************************************Page Action/Methods************************************************//
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public void validateLogin(String username, String password)
	{
		actiuser.sendKeys(username);
		actipassword.sendKeys(password);
		actiLoginbtn.click();
		
	}
	
	public String verifyLoginTitle()
	{
		return driver.getTitle();
	}
}
