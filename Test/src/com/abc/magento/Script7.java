package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Script7 
{
	WebDriver driver;
	
	@Test
	@Parameters({"url","email","password"})
	public void positiveCredential1(String url,String email,String pwd)
	{
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//*[text()='Account']/ancestor::a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id='send2']")).click();
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
	}
	
}
