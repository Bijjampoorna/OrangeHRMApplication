package com.CapturingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingUrlBingHomePage {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://bing.com");
		
		String expected_BingHomePageTitle = "bing";
		
		System.out.println("the Expected Title of BingHomePage is:-" +expected_BingHomePageTitle);
		
	    String actual_BingHomePageTitle = driver.getTitle();
	    
	    System.out.println("the Actual Title of BingHomePage is:-" +actual_BingHomePageTitle);
	    
	    if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
	    {
	    	System.out.println("The Title Of Bing HomePage Matched-Pass");
	    
	    }
	    else
	    {
	    	System.out.println("The Title Of Bing HomePage Not Matched-Fail");
	    }
	   
	    
	    
	    driver.close();
	    
	  
	
	
			
		
		
		
		
		
	}
}
