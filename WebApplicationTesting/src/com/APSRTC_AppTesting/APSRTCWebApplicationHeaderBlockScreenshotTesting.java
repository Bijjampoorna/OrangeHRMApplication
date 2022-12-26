package com.APSRTC_AppTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTCWebApplicationHeaderBlockScreenshotTesting {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
	
	
	WebDriver driver;
	String urlApplicationAddress="https://www.apsrtconline.in/oprs-web/";
			
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(urlApplicationAddress);
		driver.manage().window().maximize();
		
		
		//Identifying Properties Of APSRTC Header Elements
		//Looking For Common Elements
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Ticket Status">Ticket Status</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Ticket">Cancel Ticket</a>
		//<div class="menu-wrap">
		//<div class="menu">
		
		
		WebElement aPSRTCWebApplicationHeaderLinksId=driver.findElement(By.className("menu-wrap"));
		List<WebElement>aPSRTCWebApplicationHeaderLinks=aPSRTCWebApplicationHeaderLinksId.findElements(By.tagName("a"));
		
		String aPSRTCWebApplicationHeaderLinksElements=aPSRTCWebApplicationHeaderLinksId.getAttribute("href");
		
		System.out.println("the Names Of the links Are:-"+aPSRTCWebApplicationHeaderLinksElements);
		int aPSRTCWebApplicationHeaderLinksIdSize=aPSRTCWebApplicationHeaderLinks.size();
		System.out.println(aPSRTCWebApplicationHeaderLinksIdSize);
		
	
		
		for(int i=0;i<aPSRTCWebApplicationHeaderLinksIdSize;i++)
		{
			
			//Getting The Expected Titles of TSRTC Web Application LoginPage	
			String expectedWebPageTitle=driver.getTitle();
			System.out.println("The Expected Title of Current WebPage:- "+expectedWebPageTitle);
			
			
			//Getting The Expected URl Address of TSRTC Web Application LoginPage		
			String expectedApplicationPageCurrentURl=aPSRTCWebApplicationHeaderLinks.get(i).getAttribute("href");
			System.out.println("The Expected URL Address Of Current Page is:- "+expectedApplicationPageCurrentURl);
			
			// String aPSRTCWebApplicationHeaderLinksName=aPSRTCWebApplicationHeaderLinks.get(i).getText();
			
			// String aPSRTCWebApplicationHeaderLinksName=aPSRTCWebApplicationHeaderLinks.get(i).getText();
			 
			// System.out.println(i+"-"+aPSRTCWebApplicationHeaderLinksName);
		 
			 
			 //Validating The Header Link Elements Through Click Method
			 
			 aPSRTCWebApplicationHeaderLinks.get(i).click();
			 
				//Getting The Actual WebPage Title
			 
			String actualWebPageTitle=driver.getTitle();
			System.out.println("The Actual Title of Current WebPage:- "+actualWebPageTitle);
			
			//Getting The Actual Application Page Current URL
			
			String actualApplicationPageCurrentURl=driver.getCurrentUrl();
			System.out.println("The Actual URL Address Of Current Page is:- "+actualApplicationPageCurrentURl);
			
			Thread.sleep(2000);
			
			//Capturing ScreenShots
			
			File aPSRTCCurrentPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(aPSRTCCurrentPageScreenShot,new File(".\\ApplicationScreenShots\\"+i+"aPSRTCCurrentPageScreenShot.png"));
			
			
			
			 driver.get(urlApplicationAddress);
			 
			//IDentifying The HeaderElements And Storing Them in The Array List
			 aPSRTCWebApplicationHeaderLinksId=driver.findElement(By.className("menu-wrap"));
			 aPSRTCWebApplicationHeaderLinks=aPSRTCWebApplicationHeaderLinksId.findElements(By.tagName("a"));
			 
			 //Validating The actual URl Address Of The Application Page with Expected URL Address
			 
			 if(actualApplicationPageCurrentURl.equals(expectedApplicationPageCurrentURl))
			 {
				 System.out.println("THE APPLICATION URL ADDRESS ARE MATCHING-PASS");
			 }
			 else
			 {
				 System.out.println("HE APPLICATION URL ADDRESS ARE NOT MATCHING-FAIL");
			 }
			 System.out.println();
			 
			
			
		}
		
		   
		driver.quit();
		
	
	
}
	
	
	
	
}
