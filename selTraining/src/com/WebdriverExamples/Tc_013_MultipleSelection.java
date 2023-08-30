package com.WebdriverExamples;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_013_MultipleSelection
{
	WebDriver driver;
	String urlAddress="https://www.osmania.ac.in/";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		
	}
	
	public void mutilplescreenshot() throws IOException, InterruptedException
	{
		By languageMenuElement=By.id("gtranslate_selector");
		WebElement languagemenuL=driver.findElement(languageMenuElement);
		
		//for getting all the texts present in the above element
		Select sc=new Select(languagemenuL);
		List<WebElement> languageL=sc.getOptions();
		for(WebElement dropdownValues:languageL)
		{
			System.out.println(dropdownValues.getText());
		}
		
		
		//List<WebElement> languageL=languagemenuL.findElements(By.tagName("option"));
		
		
		int languageCount=languageL.size();
		System.out.println("The count of total languages is-"+languageCount);
		
		for(int i=0;i<languageCount;i++)
		{
			String languageName=languageL.get(i).getText();
			System.out.println("The language name is-"+languageName);
			
			Select languageSelect=new Select(languagemenuL);
			languageSelect.selectByIndex(i);
			Thread.sleep(1000);
			
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\Screenshot\\"+i+"-"+languageName+"-"+"Language.png"));
			
		}
		
	}
	public void tearDown()
	{
		driver.quit();
	}
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		Tc_013_MultipleSelection ms=new Tc_013_MultipleSelection();
		ms.setUp();
		ms.mutilplescreenshot();
		ms.tearDown();
		
		
	}
	
}
