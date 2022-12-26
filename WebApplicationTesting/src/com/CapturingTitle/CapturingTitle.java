package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
public class CapturingTitle {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		String googletitle = driver.getTitle();
		
	System.out.println("the title of google homepage is:-" +driver.getTitle());
	
	driver.close();
	
		
		
	}

}
