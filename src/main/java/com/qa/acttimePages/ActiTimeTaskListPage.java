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
	@FindBy(xpath = "//div[@class='header']//input[@placeholder='Start typing name ...']") 
	WebElement SearchCustomerName;
	@FindBy(xpath = "//div[@class='header']//div[@class='icon']") 
	WebElement SearchBtn;
	@FindBy(xpath = "//span[@class='highlightToken']") WebElement HighlightedCustomer;
	@FindBy(xpath = "//div[@class='node customerNode editable selected']//div[@class='editButton']") 
	WebElement EditBtn;
	@FindBy(className="action") WebElement actionBtn;
	@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[@class='title'][contains(text(),'Delete')]") WebElement DeleteBtn;
	@FindBy(xpath = "//span[contains(text(),'Delete permanently')]") 
	WebElement DeletePermanentlyBtn;
	
	
//Create Customer
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
	//Search Existing Customer and Delete customer
	public void EnterToSearchCustomer(String customer) {
		Common.highLightElement(SearchCustomerName);
		SearchCustomerName.sendKeys(customer);
	}
	
	/*public void ClickSearchCustomer() {
		Common.highLightElement(SearchBtn);
		SearchBtn.click();
	}*/
	
	public void ClickHighlightedCustomer() {
		Common.highLightElement(HighlightedCustomer);
		HighlightedCustomer.click();
	}
	
	public void ClickOnEditButton() throws InterruptedException {
		Common.highLightElement(EditBtn);
		Thread.sleep(2000);
		EditBtn.click();
	}
	
	public void ClickOnActionBtn() throws InterruptedException{
		Thread.sleep(2000);
		Common.highLightElement(actionBtn);
		actionBtn.click();
	}
	
	public void ClickDeleteCustomerButton() throws InterruptedException {
		Common.highLightElement(DeleteBtn);
		Thread.sleep(2000);
		DeleteBtn.click();
	}
	
	public void ClickDeleteConfiramtionBtn() throws InterruptedException {
		Common.highLightElement(DeletePermanentlyBtn);
		Thread.sleep(2000);
		DeletePermanentlyBtn.click();
	}
}
