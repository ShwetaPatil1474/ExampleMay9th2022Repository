package com.sgtesting.pageobjectmodleassignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createuser {
	public static WebDriver o;
	public static ActiTimePage p;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOut();
		createUser();
		logOut();
		closeApp();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Application\\Libaray\\drivers\\chromedriver.exe");
			o=new ChromeDriver();
			p=new ActiTimePage(o);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			o.navigate().to("http://localhost/login.do");
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			p.getUsername().sendKeys("admin");
			p.getPwd().sendKeys("manager");
			p.getLoginButton().click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOut()
	{
		try
		{
			p.getGettingStartedShortcutsPanelId().click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			p.getoUserLink().click();
			Thread.sleep(1500);
			p.getoAddUser().click();
			p.getFirstName().sendKeys("Shweta");
			p.getLastName().sendKeys("patil");
			p.getEmail().sendKeys("a@gmail.com");
			p.getUsername().sendKeys("user1");
			p.getPassword().sendKeys("asd");
			p.getPasswordCopy().sendKeys("asd");
			Thread.sleep(1500);
			p.getUserDataLightBox_commitBtn().click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	private static void logOut()
	{
		try
		{
			p.getLogoutLink().click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
