package com.abc.magento;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Script2 
{
	
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
	public void positiveCredential1()
	{
		System.out.println("positive credential1() executed");
	}
	
	@Test
	public void positiveCredential2()
	{
		System.out.println("positive credential2() executed");
	}
}
