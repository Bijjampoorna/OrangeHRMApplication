package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		ChromeDriver chrome= new ChromeDriver();
		
		//chrome.get("https://youtube.com/");
		//chrome.get("https://facebook.com");
		chrome.get("https://login.salesforce.com");
		
		//ChromeDriver chrome1=new ChromeDriver();
		//chrome1.get("https://google.com");
		chrome.close();
		
		
		System.setProperty("webdriver.edge.driver",".\\browserDriverFiles\\msedgedriver.exe");
		
		//EdgeDriver edge=new EdgeDriver();
		
		//edge.get("https://Artstation.com");
		
		//chrome1.close();
		
		//edge.close();
		
		System.setProperty("webdriver.opera.driver",".//browserDriverFiles\\operadriver.exe");
		
		OperaDriver opera=new OperaDriver();
		
		opera.get("https://gmail.com");		
		
	}
}
