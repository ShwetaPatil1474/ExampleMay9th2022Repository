package com.sgtesting.hardassertscenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerScenarios {
	public static WebDriver oB=null;
	
	@Test(priority=1)
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
	
	@Test(priority=2)
	private static void navigate()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oB.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
			actual=oB.getTitle();
			Assert.assertSame(actual, expected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	private static void login()
	{
		try
		{
			String expected="Enter Time-Trace";
			oB.findElement(By.name("username")).sendKeys("admin");
			oB.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oB.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("/td[text()='Enter Time-Trace']"));
			Assert.assertEquals(expected,oEle.getText());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		String expected,actual;
		try
		{
			expected="Jul 25 - Jul 31, 2022";
			oB.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			WebElement oEle=oB.findElement(By.xpath("/td[text()='Enter Time-Trace']"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void createUser()
	{
		try
		{
			String expected="User List";
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
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'pageBody\']/tbody/tr[1]/td[1]/div/span"));
			String actual=oEle.getText();
			Assert.assertEquals(expected,actual);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void delete()
	{
		String expected,actual;
		try
		{
			expected="User List";
			oB.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
			Thread.sleep(5000);
			Alert oAlert=oB.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'pageBody\']/tbody/tr[1]/td[1]/div/span"));
			actual=oEle.getText();
			Assert.assertEquals(actual, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void logout()
	{
		try
		{
			String expected="Please identify yourself";
			oB.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\\'headerContainer\\']"));
			String actual=oEle.getText();
				Assert.assertEquals(actual, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
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
