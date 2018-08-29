package com.abc.magento;

import org.testng.annotations.Test;

public class Script4 {
	
	@Test
	public void a_test()
	{
		System.out.println("inside a_test()");
	}
	@Test(priority=8)
	public void e_test()
	{
		System.out.println("inside e_test()");
	}
	@Test
	public void c_test()
	{
		System.out.println("inside c_test()");
	}
	@Test(priority=1)
	public void b_test()
	{
		System.out.println("inside b_test()");
	}
	@Test(priority=76)
	public void d_test()
	{
		System.out.println("inside d_test()");
	} 
}
