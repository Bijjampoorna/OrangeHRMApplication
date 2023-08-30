package com.TSRTCWebApplicationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTCWebApplicationLinksTesting {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//Finding Properties of TSRTC HomepageLinks
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		
		//<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');
		
         List<WebElement> tSRTCHomePageLinks=driver.findElements(By.tagName("a"));
         
         int tSRTCHomePageLinksSize=tSRTCHomePageLinks.size();
		 System.out.println("the Total Links in TSRTC HomePage Are:- "+tSRTCHomePageLinksSize);
		 
		 for(int i = 0;i<tSRTCHomePageLinksSize;i++)
		 {
			 String tSRTCHomePageLinksNames=tSRTCHomePageLinks.get(i).getText();
					  
			 System.out.println("The Names of the links are:-"+i+" "+tSRTCHomePageLinksNames );
			 
			 
			 
		 }
		 
		
		
		
	}

}
