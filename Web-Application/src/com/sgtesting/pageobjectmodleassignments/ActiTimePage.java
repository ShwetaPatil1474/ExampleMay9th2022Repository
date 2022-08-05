package com.sgtesting.pageobjectmodleassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements( oBrowser,this);
	}
	 //login page user name
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	//login page password
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}
	
	//login page login button
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}

	//WEb home page Flyout minimize
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}
	
	//Web  create user home page
	@FindBy(xpath="//a[@class='content users']")
	private WebElement oUserLink;
	public WebElement getoUserLink() {
		return oUserLink;
	}
	
	//Web Add user in User home page
	@FindBy(xpath="//div[@class='addUserButton beigeButton useNativeActive']")
	private WebElement oAddUser;
	public WebElement getoAddUser() {
		return oAddUser;
	}
	
	//Add user First Name
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	
	//Add User Last Name
	private WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	
	//Add user Email address
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}

	//Add user user name
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserDataLightBox_usernameField() {
		return userDataLightBox_usernameField;
	}
	
	//add user pwd
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	//Add user retype pwd
	private WebElement passwordCopy;
	public WebElement getPasswordCopy() {
		return passwordCopy;
	}

	// WebElement for Create user button
	private WebElement userDataLightBox_commitBtn;
	public WebElement getUserDataLightBox_commitBtn() {
		return userDataLightBox_commitBtn;
	}
	
	//WebElement for navigating to tasks
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement oTasks;
	public WebElement getoTasks() {
		return oTasks;
	}
	
	//WebElement for Tasks Add new Button
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewButton1;
	public WebElement getAddNewButton1() {
		return addNewButton1;
	}
	
	//WebElement for tasks add Customer
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement oNewCustomer;
	public WebElement getoNewCustomer() {
		return oNewCustomer;
	}
	
	//WebElement for tasks  to add customerName 
	private WebElement customerLightBox_nameField;
	public WebElement getCustomerLightBox_nameField() {
		return customerLightBox_nameField;
	}
	
	//WebElement for tasks CreateCustomer button
	private WebElement customerLightBox_commitBtn;
	public WebElement getCustomerLightBox_commitBtn() {
		return customerLightBox_commitBtn;
	}
	
	//WebElement for clicking view created customer
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement settingc;
	public WebElement getSettingc() {
		return settingc;
	}
	
	//WebElement for Tasks Customer modification button
	@FindBy(xpath="//textarea[@placeholder='Enter customer description...']")
	private WebElement msgCustomer;
	public WebElement getMsgCustomer() {
		return msgCustomer;
	}		
	
	//WebElement for Adding tasks button for  Projects 
	@FindBy(xpath="//div[@class='addNewButton']")
	private WebElement addNewButton2;
	public WebElement getAddNewButton2() {
		return addNewButton2;
	}
	
	//WebElement for Adding tasks button for Creating  Projects for customer
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement oNewProject;
	public WebElement getoNewProject() {
		return oNewProject;
	}
	
	//WebElement for adding projectName for project in customer
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectPopup_projectNameField() {
		return projectPopup_projectNameField;
	}
	
	//WebElement for clicking create project'
	private WebElement projectPopup_commitBtn;
	public WebElement getProjectPopup_commitBtn() {
		return projectPopup_commitBtn;
	}
	
	//WebElement for clicking to view created project of customer
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement settingp;
	public WebElement getSettingp() {
		return settingp;
	}
	
	//WebElement for modifying the project of customer.
	@FindBy(xpath="//textarea[@placeholder='Enter project description...']")
	private WebElement msgProject;
	public WebElement getMsgProject() {
		return msgProject;
	}
	
	//WebElement for ActiTime logout button
	private WebElement logoutLink;
	public WebElement getLogoutLink() {
		return logoutLink;
	}	
}

	

	

	
	

	

	

	

	

	
	

	

	
	

