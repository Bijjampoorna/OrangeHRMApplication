package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_009_FileUpload
{

	WebDriver driver;
	String urlAddress="https://the-internet.herokuapp.com/upload";
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	public void fileUpload() throws InterruptedException
	{
		By fileUploadElement=By.id("file-upload");
		WebElement fileUploadL=driver.findElement(fileUploadElement);
		Thread.sleep(3000);
		fileUploadL.sendKeys("C:\\Users\\bijja\\Desktop\\spidey.jpg");
		
		By fileSubmitElement=By.id("file-submit");
		WebElement fileSubmitL=driver.findElement(fileSubmitElement);
		String pageSource=driver.getPageSource();
		fileSubmitL.click();
		Thread.sleep(1500);
		if(pageSource.contains("File Uploaded!"))
		{
			System.out.println("File Uploaded");
			
		}
		else
		{
			System.out.println("File not uploaded");
		}
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Tc_009_FileUpload fu=new Tc_009_FileUpload();
		fu.setup();
		fu.fileUpload();
		fu.tearDown();
	}
}
