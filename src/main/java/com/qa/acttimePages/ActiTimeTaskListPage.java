package com.qa.acttimePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.actitimeUtilities.Common;
import com.qa.acttimeBase.DriverScript;

public class ActiTimeTaskListPage extends DriverScript {

	@FindBy(xpath = "//div[@class='addNewButton']")
	WebElement addNewTaskbtn;
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement createNewCustomer;
	@FindBy(xpath = "//div[@id='customerLightBox_content']//div//div[@class='details selected']")
	WebElement detailsTab;
	@FindBy(xpath = "//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	WebElement customerNameTb;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	WebElement customerDescTb;
	@FindBy(xpath = "//div[@class='emptySelection']")
	WebElement selectProjectDropdown;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	WebElement createCustomerbtn;

	public ActiTimeTaskListPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isDisplayedAddNewButton() {
		return addNewTaskbtn.isDisplayed();
	}

	public void clickonAddNewButton() {
		Common.highLightElement(addNewTaskbtn);
		addNewTaskbtn.click();
	}

	public boolean isDisplayedCreatNewCustomer() {
		return createNewCustomer.isDisplayed();
	}

	public void clickOnCreatNewCustomer() {
		Common.highLightElement(createNewCustomer);
		createNewCustomer.click();
	}

	public boolean isDisplayedDetailsTab() {
		return detailsTab.isDisplayed();
	}

	public String verifyDetailsTab() {
		return detailsTab.getText();
	}

	public boolean isDisplayedCustomerName() {
		return customerNameTb.isDisplayed();
	}

	public void enterCustomerName(String customerName) {
		Common.highLightElement(customerNameTb);
		customerNameTb.sendKeys(customerName);
	}

	public boolean isDisplayedcustomerDescTb() {
		return customerDescTb.isDisplayed();
	}

	public void enterCustomerDescription(String desc) {
		Common.highLightElement(customerDescTb);
		customerDescTb.sendKeys(desc);
	}

	public boolean isDisplayedselectProjectDropdown() {
		return selectProjectDropdown.isDisplayed();
	}

	/*public void selectProject(int index) {
		Select selectProject = new Select(selectProjectDropdown);
		
		selectProjectDropdown.click();
		
	//	int index = 0;
		selectProject.selectByIndex(index);

	}
*/
	public boolean isDisplayedcreateCustomerbtn() {
		return createCustomerbtn.isDisplayed();
	}

	public void createCutomerButton() {
		Common.highLightElement(createCustomerbtn);
		createCustomerbtn.click();
	}
}
