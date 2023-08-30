package com.CapturingUrlAddress;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingUrlGoogleHomePage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://google.com");
		
		String expected_googlehomepagetitle="Google";
		System.out.println("the expected title of google HomePage is:-" +expected_googlehomepagetitle);

		String actual_googlehomepagetitle=driver.getTitle();
		System.out.println("the actual title of google HomePage is:-" +actual_googlehomepagetitle);
		
		if(actual_googlehomepagetitle.equalsIgnoreCase(expected_googlehomepagetitle))
		{
			System.out.println("the title of google HomePage is matched-Pass");
		}
		else
		{
			System.out.println("the title of google HomePage is not matched-Fail");
		}
		
		String expectedGoogleHomepage_URL_Address="google.com";
		System.out.println("the expected google Homepage URL Address is:" +expectedGoogleHomepage_URL_Address);
        
		String actualGoogleHomePage_URL_Address=driver.getCurrentUrl();
		System.out.println("the actual google HomePage URL Address is:" +actualGoogleHomePage_URL_Address);
		
		if(actualGoogleHomePage_URL_Address.contains(expectedGoogleHomepage_URL_Address))
		{
			System.out.println("google Homepage URL address is google.com-Pass");
		}
		else
		{
			System.out.println("google Homepage URL address does not contain google.com-Fail");
		}
		
		
	  driver.quit();
		
	
		
	}

}
