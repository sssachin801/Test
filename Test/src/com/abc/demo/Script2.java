package com.abc.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Script2 
{
	WebDriver driver;
	@DataProvider(name="authentication")
	public Object[][] credentials()
	{
		Object temp[][]=new Object[2][2];
		temp[0][0]="sucheendra.abc@gmail.com";
		temp[0][1]="Welcome123";
		temp[1][0]="subramanyaraj87@gmail.com";
		temp[1][1]="Welcome123";
		return temp;
	}
	@Test(dataProvider="authentication")
	public void positiveCredentials1(String un,String pw)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		driver.findElement(By.xpath("//*[text()='Account']/ancestor::a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pw);
		driver.findElement(By.xpath("//*[@id='send2']")).click();
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
	}
	
}
