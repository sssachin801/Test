package com.abc.magento;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Script3 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class method executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class method executed");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method executed");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method executed");
	}
	@Test(priority=1)
	public void positiveCredential1()
	{
		System.out.println("Inside positive credential1");
	}
	@Test
	public void positiveCredential2()
	{
		System.out.println("Inside positive credential2");
	}	
}
