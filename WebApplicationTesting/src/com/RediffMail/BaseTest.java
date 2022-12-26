package com.RediffMail;

import java.util.concurrent.TimeUnit;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationURLAddress="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
	}
 
	@AfterTest
	public void tearDown()
	{
		
		
		//driver.quit();
		
		
	}
}
