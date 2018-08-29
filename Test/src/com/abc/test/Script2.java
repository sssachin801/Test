package com.abc.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script2 
{
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("inside beforeMethod");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("inside afterMethod");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("inside beforeClass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("inside afterClass");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("inside beforeTest");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("inside afterTest");
	}
	@Test
	public void positiveCredential1()
	{
		System.out.println("inside credential1");
	}

	@Test
	public void positiveCredential2()
	{
		System.out.println("inside credential2 ");
	}
}
