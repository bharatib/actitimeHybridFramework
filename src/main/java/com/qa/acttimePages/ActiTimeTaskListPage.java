package com.qa.acttimePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.actitimeUtilities.Common;
import com.qa.acttimeBase.DriverScript;

public class ActiTimeTaskListPage extends DriverScript {
//Add New button
	@FindBy(xpath = "//div[@class='addNewButton']")
	WebElement addNewTaskbtn;
//Create New Customer
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement createNewCustomer;
	@FindBy(xpath = "//div[@id='customerLightBox_content']//div//div[@class='details selected']")
	WebElement detailsTab;
	@FindBy(xpath = "//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")
	WebElement customerNameTb;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	WebElement customerDescTb;
	@FindBy(xpath = "//span[contains(@class,'customerSelectorPlaceholder selectorWithPlaceholderContainer')]//div[contains(@class,'dropdownButton')]")
	WebElement ProjectDropdown;
	@FindBy(xpath = "//div[contains(@class,'itemRow cpItemRow')][contains(text(),'Big Bang Company')]")
	WebElement SelectProject;
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	WebElement createCustomerbtn;
//Delete Customer
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
		
//Create New Project
	@FindBy(xpath = "//div[@class='item createNewProject']") WebElement CreateNewProject;
	@FindBy(xpath = "//div[@class='sectionDetails']//input[@placeholder='Enter Project Name']") WebElement ProjectName;
	@FindBy(xpath="//div[contains(@class,'customerSelectorPlaceholder selectorWithPlaceholderContainer notSelected')]//div[contains(@class,'dropdownButton')]") WebElement CustomerCombobox;
	@FindBy(xpath="//div[contains(@class,'itemRow cpItemRow')][contains(text(),'Big Bang Company')]") WebElement SelectCustomer;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']") WebElement ProjectDescription;
	@FindBy(xpath="//div[@id='createProjectPopup']//tr[1]//td[1]//input[1]") WebElement EnterTaskone;
	@FindBy(id="descriptionElement") WebElement TaskDescbtn;
	@FindBy(name="comment") WebElement EditDescText;
	@FindBy(id="scbutton") WebElement SaveBtn;
	@FindBy(xpath="//div[@id='createProjectPopup']//tr[1]//td[4]") WebElement Deadlinebtn;
	@FindBy(xpath="//span[contains(text(),'26')]") WebElement DeadlineDate;
	@FindBy(xpath="//div[@id='createProjectPopup']//tr[1]//td[5]")
	WebElement TypeOfWork;
	@FindBy(xpath="//tr[1]//td[5]//div[1]//div[1]//div[1]//div[1]//div[1]//div[11]//div[1]") WebElement SelectTypeOfWork;
	@FindBy(xpath="//div[contains(text(),'Create Project')]") WebElement CreateProjectBtn;
	
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
		return ProjectDropdown.isDisplayed();
	}

	public void ClickOnProjectDropDown(){
		ProjectDropdown.click();

	}
	
	public void SelectProject() {
		SelectProject.click();
	}

	public boolean isDisplayedcreateCustomerbtn() {
		return createCustomerbtn.isDisplayed();
	}

	public void createCutomerButton() throws InterruptedException {
		Thread.sleep(2000);
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
	//Create Project
	public void ClickOnNewProject() {
		Common.highLightElement(CreateNewProject);
		CreateNewProject.click();
	}
	
	public void EnterProjectName(String projectname) {
		Common.highLightElement(ProjectName);
		ProjectName.sendKeys(projectname);
	}
	
	public void ClickOnCustomerComboBox() {
		Common.highLightElement(CustomerCombobox);
		CustomerCombobox.click();
	}
	
	
	public void SelectCustomer() {
		Common.highLightElement(SelectCustomer);
		SelectCustomer.click();
	}
	
	public void EnterProjectDesc(String ProjectDesc) {
		Common.highLightElement(ProjectDescription);
		ProjectDescription.sendKeys(ProjectDesc);
	}
	
	public void EnterTaskOne(String Taskone) {
		Common.highLightElement(EnterTaskone);
		EnterTaskone.sendKeys(Taskone);
	}
	
	public void ClickTaskDescription() {
		Common.highLightElement(TaskDescbtn);
		TaskDescbtn.click();
	}
	
	public void EnterTaskDescription(String TaskDesc) {
		Common.highLightElement(EditDescText);
		EditDescText.sendKeys(TaskDesc);
	}
	
	public void ClickOnSaveBtn() {
		Common.highLightElement(SaveBtn);
		SaveBtn.click();
	}
	
	public void ClickOnDeadLineBtn() throws InterruptedException {
		Thread.sleep(2000);
		Common.highLightElement(Deadlinebtn);
		Deadlinebtn.click();
	}
	
	public void SelectDeadLineDate() throws InterruptedException {
		Thread.sleep(2000);
		Common.highLightElement(DeadlineDate);
		DeadlineDate.click();
	}
	public void ClickOnTypeOfWork() {
		Common.highLightElement(TypeOfWork);
		TypeOfWork.click();
	}
	
	public void SelectTypeOfWork() {
		Common.highLightElement(SelectTypeOfWork);
		SelectTypeOfWork.click();
	}
	
	public void ClickOnCreateProject() {
		Common.highLightElement(CreateProjectBtn);
		CreateProjectBtn.click();
		
	}
	
}
