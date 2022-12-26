package com.Loginfunctionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest

{ 
	
	WebDriver driver;
   String applicationURLAddress="https://www.facebook.com/";
@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
	}
	
@AfterTest
public void tearDown()
{

	//driver.close();
	
}
	
	
	
	
	
}
