package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_008_SelectOperation 
{
	WebDriver driver;
	String urlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void selection() throws InterruptedException
	{

		By dayElement=By.xpath("//select[starts-with(@name,'DOB_D')]");
		WebElement dayL=driver.findElement(dayElement);
		dayL.click();
		
		Select daySelect=new Select(dayL);	
		daySelect.selectByValue("01");
		//daySelect.selectByIndex(05);
		//daySelect.selectByVisibleText("10");
		Thread.sleep(1500);
		By monthElement=By.xpath("//select[starts-with(@name,'DOB_Month')]");
		WebElement monthL=driver.findElement(monthElement);
		monthL.click();
		
		Select monthSelect=new Select(monthL);
		monthSelect.selectByIndex(10);
		Thread.sleep(1500);
		
		By yearElement=By.xpath("//select[starts-with(@name,'DOB_Year')]");
		WebElement yearL=driver.findElement(yearElement);
		yearL.click();
		
		Select yearSelect=new Select(yearL);
		yearSelect.selectByVisibleText("1997");
		
		Thread.sleep(5000);
	}
	
	public void tearDown()
	{
		driver.quit();
		
	}
	public static void main(String[] args) throws InterruptedException
	{
	
		Tc_008_SelectOperation se=new Tc_008_SelectOperation();
		se.setUp();
		se.selection();
		se.tearDown();
	}
}

