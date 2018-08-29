package com.abc.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script3 {

	@BeforeTest
	public void Beforetest()
	{
		System.out.println("before test exe");
	}
	@AfterTest
	public void Aftertest()
	{
		System.out.println("after test exe");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method exe");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method exe");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class exe");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class exe");
	}
	@Test
	public void positiveCredential1()
	{
		System.out.println("inside positive credential1");
	}
	@Test
	public void positiveCredential2()
	{
		System.out.println("inside positive credential2");
	}

}
