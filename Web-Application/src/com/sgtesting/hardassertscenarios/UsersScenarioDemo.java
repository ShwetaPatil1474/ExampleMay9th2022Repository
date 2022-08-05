package com.sgtesting.hardassertscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersScenarioDemo {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Application\\Libaray\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void navigate()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(4000);
			actual=oBrowser.getTitle();
			Assert.assertSame(actual, expected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void login()
	{
		try
		{
			String expected="Enter Time-Track";
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
			Thread.sleep(4000);
			WebElement oEle=oBrowser.findElement(By.xpath("/td[text()='Enter Time-Trace']"));
			Assert.assertEquals(expected,oEle.getText());
			//Assert.assertTrue(oEle.isDisplayed());
			//Assert.assertNotNull(oEle);
			System.out.println("All the assertion Steps have passed!!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
