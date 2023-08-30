package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_004_Frames
{
	public static WebDriver driver;
	public static String urlAddress="https://jqueryui.com/droppable/";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void frames()
	{
		By frameElement=By.className("demo-frame");
		WebElement frameL=driver.findElement(frameElement);
		
		//Switching to frames to identify the elements
		driver.switchTo().frame(frameL);
		
		By dragElement=By.id("draggable");
		WebElement dragL=driver.findElement(dragElement);
		String dragText=dragL.getText();
		System.out.println("The text of Drag element is-"+dragText);
		
		By dropElement=By.id("droppable");
		WebElement dropL=driver.findElement(dropElement);
		String dropText=dropL.getText();
		System.out.println("The text of Drop element is-"+dropText);
		
		//introducing actions class to perform drag and drop
		
		Actions act=new Actions(driver);
		act.dragAndDrop(dragL, dropL).build().perform();
		
		String afterDropText=dropL.getText();
		System.out.println("The Text after performing Drag and drop is-"+afterDropText);
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	public static void main(String[] args)
	{
		Tc_004_Frames fr=new Tc_004_Frames();
		fr.setUp();
		fr.frames();
		fr.tearDown();
		
	}
}