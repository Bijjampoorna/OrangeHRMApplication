package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	String applicationURLAddress="https://www.timeanddate.com/worldclock/";

	
	@BeforeTest
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(applicationURLAddress);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(02,TimeUnit.SECONDS);
			
	}
	
	@AfterTest
	public void applicationClose()
	{
		driver.close();
	}

}
