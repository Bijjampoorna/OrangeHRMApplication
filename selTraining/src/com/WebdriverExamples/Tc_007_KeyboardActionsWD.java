package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_007_KeyboardActionsWD 
{
	WebDriver driver;
	String urlAddress="https://www.google.co.in/";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void keyboardAction() throws InterruptedException
	{
		By searchElement=By.name("q");
		WebElement searchL=driver.findElement(searchElement);
		searchL.sendKeys("selenium");
		Thread.sleep(5000);
		searchL.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		searchL.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		searchL.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
	}
	
	public void tearDown()
	{
	driver.quit();	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Tc_007_KeyboardActionsWD ka=new Tc_007_KeyboardActionsWD();
		ka.setUp();
		ka.keyboardAction();
		ka.tearDown();
		
	}
	
}
