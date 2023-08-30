package com.WebdriverExamples;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_012_ScreenShot
{
	WebDriver driver;
	String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	String username="BijjamPoorna";
	String password="bijjampoorna12";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void screenshotTest() throws IOException
	{
		try
		{
		
		By userNameElement=By.id("txtUsername");
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys(username);
		
		
		By passWordElement=By.id("txtPassword");
		WebElement passwordL=driver.findElement(passWordElement);
		passwordL.sendKeys(password);
		
		By loginBtnElement=By.id("btnLogin");
		WebElement loginBtnL=driver.findElement(loginBtnElement);
		loginBtnL.click();

		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		
		}
		catch (Exception e) 
		{
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\Screenshot\\"+username+"-"+password+"InvalidData.png"));
			
			System.out.println(e);
		}

	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws IOException
	{
		Tc_012_ScreenShot ss=new Tc_012_ScreenShot();
		
		ss.setUp();
		ss.screenshotTest();
		ss.tearDown();
	}
	
}
