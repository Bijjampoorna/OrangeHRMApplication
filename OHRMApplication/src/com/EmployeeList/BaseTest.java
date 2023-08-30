package com.EmployeeList;


	import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	
	public class BaseTest {
		

		
		WebDriver driver;
		String ORMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login"; 
		
		
	   @BeforeTest
		public void applicationLaunch()
		
		{
			System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
			 driver=new ChromeDriver();
			 
			     
			driver.get(ORMApplicationURLAddress);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get(ORMApplicationURLAddress);	
			
		}
		
		@AfterTest
		public void applicationClose()
		{
			
			driver.quit();
		}
		
		

	}



