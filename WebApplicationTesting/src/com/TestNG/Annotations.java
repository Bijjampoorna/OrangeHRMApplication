package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void applicationLaunch()
	{
		System.out.println("Application launch sucessfull");
	}
	@AfterMethod
	public void applicationClose()
	{
		System.out.println("Application Closed successfully");
	}
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("inbox Application Opened Successfully");
	}
	@Test(priority=3)
	public void Compose()
	{
		System.out.println(" compose Application Opened Successfully");
	}


}
