package com.sgtesting.softassertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyCustomerScenarioDemo {
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

	private static void createCustomer()
	{
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			oB.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oB.findElement(By.id("customerLightBox_nameField")).sendKeys("sg testing");
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void modifyCustomer()
	{
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			oB.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Projext claa sunday at 10");
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void deleteCustomer()
	{
		String expected,actual;
		try
		{
			expected="Customers & Projects";
			oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			oB.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oB.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void logout()
	{
		String expected,actual;
		try
		{
			expected="Please identify yourself";
			oB.findElement(By.id("logoutLink")).click();
			Thread.sleep(1500);
			WebElement oEle=oB.findElement(By.xpath("//*[@id=\'headerContainer\']"));
			actual=oEle.getText();
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
@Test(priority=9)
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

