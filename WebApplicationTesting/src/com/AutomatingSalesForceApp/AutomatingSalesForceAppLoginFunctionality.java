package com.AutomatingSalesForceApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSalesForceAppLoginFunctionality {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver;
		String urlApplicationAddress="https://login.salesforce.com/";
				
			System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get(urlApplicationAddress);
			driver.manage().window().maximize();
			
			// id="username" aria-describedby="error" style="display: block;">
		
			WebElement salesForceUserName=driver.findElement(By.id("username"));
			salesForceUserName.sendKeys("bijjampoorna@gmail.com");
			
			// id="password" name="pw" onkeypress="checkCaps(event)" autocomplete="off">
			
			WebElement salesForcePassword=driver.findElement(By.id("password"));
			   salesForcePassword.sendKeys("Ravitheja12$");
			   
		 //<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
			   WebElement salesForceLoginButton=driver.findElement(By.id("Login"));
			   
			   salesForceLoginButton.click();
			   
			   //<div class="slds-icon-waffle" data-aura-rendered-by="441:85;a"><div class="slds-r1" data-aura-rendered-by="442:85;a">
			   Thread.sleep(2000);
			   WebElement salesForceWaffleElement=driver.findElement(By.className("458:85;a"));
			   salesForceWaffleElement.click();
			   
			   
			   
			   
			   
	}
	
}
