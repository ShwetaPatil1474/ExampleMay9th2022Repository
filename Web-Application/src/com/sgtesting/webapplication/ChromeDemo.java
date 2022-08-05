package com.sgtesting.webapplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		closeApplication();
	}
	private static void LaunchBrowser()
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
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
