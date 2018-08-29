package com.abc.magento;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Script6
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after executed");
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
	@Test
	public void positiveCredentials1()
	{
		System.out.println("PositiveCredential1 executed");
	}
	@Test
	public void positiveCredentials2()
	{
		System.out.println("PositiveCredential2 executed");
	}
}
