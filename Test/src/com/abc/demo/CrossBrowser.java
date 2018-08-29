package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser
{
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void cross(String browser)
	{
		System.out.println(browser);
		if (browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public void magento()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url="https://www.magento.com";
		driver.get(url);
		driver.findElement(By.xpath("//*[text()='Account']/ancestor::a")).click();
		driver.findElement(By.id("email")).sendKeys("sucheendra.abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}
}
