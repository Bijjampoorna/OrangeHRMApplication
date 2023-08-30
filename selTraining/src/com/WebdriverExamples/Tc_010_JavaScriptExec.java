package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_010_JavaScriptExec 
{
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void login()
	{
		By userNameElement=By.id("txtUsername");
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys("Bijjampoorna");
		
		By passwordElement=By.id("txtPassword");
		WebElement passwordL=driver.findElement(passwordElement);
		passwordL.sendKeys("Bijjampoorna12$");
		
		By loginBTNElement=By.id("btnLogin");
		WebElement loginBTNL=driver.findElement(loginBTNElement);
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",loginBTNL);
		
	}
	
	public void logout() throws InterruptedException
	{
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		Thread.sleep(1500);
		
		By logOutElement=By.linkText("Logout");
		WebElement logOutL=driver.findElement(logOutElement);
		//logOutL.click();
		JavascriptExecutor logoutexecutor=(JavascriptExecutor)driver;
		logoutexecutor.executeScript("arguments[0].click();",logOutL);
	}
	public void tearDown()
	{
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException
	{
		Tc_010_JavaScriptExec js=new Tc_010_JavaScriptExec();
		js.setUp();
		js.login();
		js.logout();
		js.tearDown();
	}
}
