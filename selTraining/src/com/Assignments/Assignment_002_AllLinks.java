package com.Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_002_AllLinks
{
	WebDriver driver;
	String urlAddress="https://www.google.com/";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void allLinks()
	{
		List<WebElement>linksL=driver.findElements(By.tagName("a"));
		int linksCount=linksL.size();
		System.out.println("The Size of The links is-"+linksCount);
		for(WebElement allLinks:linksL)
		{
			System.out.println(allLinks.getText());
		}
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args)
	{
		Assignment_002_AllLinks al=new Assignment_002_AllLinks();
		al.setUp();
		al.allLinks();
		al.tearDown();
	}
	

}