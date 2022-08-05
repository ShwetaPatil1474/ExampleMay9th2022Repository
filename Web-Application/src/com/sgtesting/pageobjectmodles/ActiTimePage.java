package com.sgtesting.pageobjectmodles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oB)
	{
		PageFactory.initElements(oB, this);
	}
	//webElement for username page text field
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	//webElement for login page password text field\
	private WebElement pwd;
	public WebElement getPwd() {
		return pwd;
	}
	
	//WEbElement for login page button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButtonContainer;
	public WebElement getLoginButtonContainer() {
		return loginButtonContainer;
	}
	
	//WebElement for home page Flyout Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getGettingStartedShortcutsPanelId() {
		return gettingStartedShortcutsPanelId;
	}
	
	
	
	//WebElement for home page logout
	private WebElement logoutLink;
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
	
}
