package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_005_Alerts
{
	 WebDriver driver;
	 String urlAddress="https://www.tsrtconline.in/oprs-web/";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(urlAddress);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	
	public void alerts()
	{
		By checkBtnElement=By.id("searchBtn");
		WebElement checkBtnL=driver.findElement(checkBtnElement);
		checkBtnL.click();
		//switching to alert 
		Alert alert=driver.switchTo().alert();
		String alertMsg=alert.getText();
		System.out.println("The alert message is-"+alertMsg);
		alert.accept();

	}
	
	public void tearDown()
	{
		driver.quit();
	}
	public static void main(String[] args)
	{
		Tc_005_Alerts al=new Tc_005_Alerts();
		al.setUp();
		al.alerts();
		al.tearDown();
		
	}
}
