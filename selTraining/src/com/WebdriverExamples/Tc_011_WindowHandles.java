package com.WebdriverExamples;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_011_WindowHandles 
{

	WebDriver driver;
	String urlAddress="https://the-internet.herokuapp.com/windows";
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void windowHandles() throws InterruptedException
	{
		By clickHereElement=By.linkText("Click Here");
		WebElement clickHereL=driver.findElement(clickHereElement);
		clickHereL.click();
		
		ArrayList<String> windowsInfo=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsInfo.get(0));
		driver.switchTo().window(windowsInfo.get(1));
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
	}

	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Tc_011_WindowHandles wh=new Tc_011_WindowHandles();
		wh.setup();
		wh.windowHandles();
		wh.tearDown();
	}
}
