package com.sgtesting.softassertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment5 {
public static WebDriver b=null;
	
	@Test(priority=1)
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Application\\Libaray\\drivers\\chromedriver.exe");
			b=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		SoftAssert soft = new SoftAssert();
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			b.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
			actual=b.getTitle();
			soft.assertSame(actual, expected);
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3,dataProvider="getUsercredentails")
	private static void login(String user,String pwd)
	{
		SoftAssert soft = new SoftAssert();
		try
		{
			String expected="Enter Time-Trace";
			b.findElement(By.name("username")).sendKeys(user);
			b.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(5000);
			b.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			WebElement oEle=b.findElement(By.xpath("/td[text()='Enter Time-Trace']"));
			soft.assertEquals(expected,oEle.getText());
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getUsercredentails()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		SoftAssert soft = new SoftAssert();
		String expected,actual;
		try
		{
			expected="Jul 25 - Jul 31, 2022";
			b.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
			WebElement oEle=b.findElement(By.xpath("/td[text()='Enter Time-Trace']"));
			actual=oEle.getText();
			soft.assertEquals(expected,actual);	
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5,dataProvider="getCustomercredentails")

	private static void createCustomer(String cname)
	{
		SoftAssert soft = new SoftAssert();
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			b.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_nameField")).sendKeys(cname);
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
			WebElement oEle=b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			soft.assertEquals(expected,actual);
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getCustomercredentails()
	{
		return new Object[][] {{"sg testing"}};
	}
	
	@Test(priority=6,dataProvider="getcreateProjectcredentails")
	private static void createProject(String pname)
	{
		SoftAssert soft = new SoftAssert();
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			b.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1500);
			b.findElement(By.id("projectPopup_projectNameField")).sendKeys(pname);
			b.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']")).click();
			Thread.sleep(2000);
			WebElement oEle=b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			soft.assertEquals(expected,actual);	
			soft.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider
	public Object[][] getcreateProjectcredentails()
	{
		return new Object[][] {{"sg testing"}};
	}
	@Test(priority=7)
	private static void deleteProject()
	{
		SoftAssert soft = new SoftAssert();
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1500);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1500);
			b.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
			WebElement oEle=b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);	
			soft.assertAll();
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
			b.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
