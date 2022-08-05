package com.sgtesting.webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static WebDriver oB=null;
	public static void main(String[] args) {
		launch();
		navigate();
		webHandling();
	}
	private static void launch()
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
			oB.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void webHandling()
	{
		try
		{
			oB.switchTo().frame(0);
			oB.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			oB.switchTo().defaultContent();
			Thread.sleep(2000);
			oB.switchTo().frame("PackageFrame");
			oB.findElement(By.xpath("")).click();
			oB.switchTo().defaultContent();
			Thread.sleep(2000);
			WebElement oFrame=oB.findElement(By.className("rightIframe"));
			oB.switchTo().frame(oFrame);
			String content=oB.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li")).getText();
			System.out.println(content);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
