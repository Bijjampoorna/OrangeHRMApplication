package com.MonsterIndiaDropDownTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonsterIndiaCurrentLocationDropDownTesting {

	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		String urlApplicationAddress="https://my.monsterindia.com/sponsered_popup.html";
				
			System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(urlApplicationAddress);
		
		//getting the properties of Current Location
			
		
	}
	
	
}
