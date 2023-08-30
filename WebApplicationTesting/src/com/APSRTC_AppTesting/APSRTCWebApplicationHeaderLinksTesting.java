package com.APSRTC_AppTesting;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class APSRTCWebApplicationHeaderLinksTesting {



	public static void main(String[] args) {
		
		WebDriver driver;
	String urlApplicationAddress="https://www.apsrtconline.in/oprs-web/";
			
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(urlApplicationAddress);
		
		//Identifying Properties Of APSRTC Header Elements
		//Looking For Common Elements
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Ticket Status">Ticket Status</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Ticket">Cancel Ticket</a>
		//<div class="menu-wrap">
		//<div class="menu">
		
		
		WebElement aPSRTCWebApplicationHeaderLinksId=driver.findElement(By.className("menu-wrap"));
		List<WebElement>aPSRTCWebApplicationHeaderLinks=aPSRTCWebApplicationHeaderLinksId.findElements(By.tagName("a"));
		int aPSRTCWebApplicationHeaderLinksIdSize=aPSRTCWebApplicationHeaderLinks.size();
		System.out.println(aPSRTCWebApplicationHeaderLinksIdSize);
	
		
		for(int i=0;i<aPSRTCWebApplicationHeaderLinksIdSize;i++)
		{
			
			
			 String aPSRTCWebApplicationHeaderLinksNames=aPSRTCWebApplicationHeaderLinks.get(i).getText();
			 
			 System.out.println(i+"-"+aPSRTCWebApplicationHeaderLinksNames);
			
			
		}
		  
		   
		driver.quit();
		
	} 
		
	}
	
	
	
	

