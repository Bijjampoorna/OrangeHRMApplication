package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{

	public static WebDriver driver;
	String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get(urlAddress);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
	
}
