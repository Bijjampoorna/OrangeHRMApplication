package com.WebdriverExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc_014_DropDownValues 
{
	WebDriver driver;
	String urlAddress="https://kitchen.applitools.com/ingredients/select";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void dropDown() 
	{
		
		By selectElement=By.id("spices-select-single");
		WebElement selectL=driver.findElement(selectElement);
		
		Select se=new Select(selectL);
		List<WebElement> dropDownValues=se.getOptions();
		for(WebElement values:dropDownValues)
		{
			System.out.println(values.getText());
		}
		
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	public static void main(String[] args) 
	{
		Tc_014_DropDownValues dv=new Tc_014_DropDownValues();
		dv.setUp();
		dv.dropDown();
		dv.tearDown();
		
		
	}

}