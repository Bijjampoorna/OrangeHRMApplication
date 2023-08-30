package com.LoginFunctionalityOfGmailApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login 
{
	
	WebDriver driver;
	String LoginURL="https://accounts.google.com/v3/signin/identifier?dsh=S-2012718515%3A1669194574120315&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAs47yyatoglZwZ5ABGPRcf16XZc118QNFlK1PyKkABHLkFeDbKNNP5fZJmJge3wAy9K2Ijb";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(LoginURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(07, TimeUnit.SECONDS);
	}
	
	@Test
	public void Gmaillogin() 
	{

	//Testing Username Functionality
	//<input type="email" class="whsOnd zHQkBf" jsname="YPqjbf" autocomplete="username"  name="identifier"  id="identifierId" 	
		
		//relative xPath
		//input[@autocomplete='username']
		
		
		//By EmailOrPhoneL=By.id("identifierId");
		By EmailOrPhoneL=By.xpath("//input[@autocomplete='username']");
		WebElement emailOrPhone=driver.findElement(EmailOrPhoneL);
        emailOrPhone.sendKeys("bijjampoorna");
		
	//Testing Next Functionality
	//<div jscontroller="Xq93uf" jsaction="click:cOuCgd;JIbuQc:JIbuQc;" jsname="Njthtb" class="FliLIb FmFZVc" id="identifierNext">
       //<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span> 
        
        //Relative Xpath
        //span[text()='Next'
        
		//By nextButtonElementL=By.id("identifierNext");
        By nextButtonElementL=By.xpath("//span[text()='Next']");
		WebElement nextButtonElement=driver.findElement(nextButtonElementL);
             nextButtonElement.click();
             
             
            
	}
	@AfterTest
	public void tearDown()
	{
		
		
		//driver.quit();
		
		
	}


}
