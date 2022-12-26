package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.NetworkUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LoginTest extends BaseTest
{
   @Parameters("Browser")
   
	@Test
	public void LoginTest(String browserName) throws MalformedURLException 
	{
	
		
		System.out.println("The Name Of The Browser is:- "+browserName);
		
		DesiredCapabilities cap=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else
			if(browserName.equalsIgnoreCase("opera"))
			{
				cap=DesiredCapabilities.opera();
				cap.setBrowserName("opera");
				cap.setPlatform(Platform.WINDOWS);
				
				
			}
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.138:7777/wd/hub"), cap);
		
		By userNameL=By.id("txtUsername");
		WebElement userNameelement=driver.findElement(userNameL);
		userNameelement.sendKeys("Bijjampoorna");
		
		By passwordL=By.id("txtPassword");
		WebElement passwordElement=driver.findElement(passwordL);
		passwordElement.sendKeys("Bijjampoorna12$");
		
		By loginL=By.id("btnLogin");
		WebElement loginElement=driver.findElement(loginL);
		loginElement.click();
	}
	
	
	
	
	
}
