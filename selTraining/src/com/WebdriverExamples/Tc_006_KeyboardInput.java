package com.WebdriverExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_006_KeyboardInput 
{
	WebDriver driver;
	String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void keyboardInput() throws AWTException, InterruptedException
	{
		By userNameElement=By.id("txtUsername");
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys("Bijjampoorna");
		
		By passwordElement=By.id("txtPassword");
		WebElement passwordL=driver.findElement(passwordElement);
		passwordL.sendKeys("Bijjampoorna12$");
		
		System.out.println("Initiating Keyboard input");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		/*
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		*/
		System.out.println("giving enter input ");
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Logged in ");
	}
	
	public void logout() throws InterruptedException
	{
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		Thread.sleep(1500);
		
		By logOutElement=By.linkText("Logout");
		WebElement logOutL=driver.findElement(logOutElement);
		logOutL.click();
	}
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		Tc_006_KeyboardInput ki=new Tc_006_KeyboardInput();
		ki.setUp();
		ki.keyboardInput();
		ki.logout();
		ki.tearDown();
		
		
		
	}
	
}