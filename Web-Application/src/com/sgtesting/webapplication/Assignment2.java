package com.sgtesting.webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oB=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		delete();
		logout();
		closeApplication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Application\\Libaray\\drivers\\chromedriver.exe");
			oB=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oB.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oB.findElement(By.name("username")).sendKeys("admin");
			oB.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oB.findElement(By.id("loginButton")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oB.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oB.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			oB.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			oB.findElement(By.name("firstName")).sendKeys("user1");
			oB.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("patil");
			oB.findElement(By.id("userDataLightBox_emailField")).sendKeys("shwetha@gmail.com");
			oB.findElement(By.id("userDataLightBox_usernameField")).sendKeys("appu");
			oB.findElement(By.id("userDataLightBox_passwordField")).sendKeys("appu123");
			oB.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("appu123");
			oB.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void delete()
	{
		try
		{
			oB.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
			Thread.sleep(5000);
			Alert oAlert=oB.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oB.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oB.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
