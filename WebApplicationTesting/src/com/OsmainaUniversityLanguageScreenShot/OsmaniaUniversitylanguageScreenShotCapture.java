package com.OsmainaUniversityLanguageScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmaniaUniversitylanguageScreenShotCapture {
	
public static void main(String[] args)throws IOException, InterruptedException {
		
		WebDriver driver;
	String urlApplicationAddress="https://www.osmania.ac.in/";
			
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(urlApplicationAddress);
		driver.manage().window().maximize();

		
		//<select onchange="doGTranslate(this);" class="notranslate" id="gtranslate_selector" aria-label="Website Language Selector" align="right" 
	    //Finding the properties of dropdown menu
		
		
          WebElement osmaniaUniversityDropdownelement=driver.findElement(By.id("gtranslate_selector"));
          List<WebElement>osmainaUniversityDropDown=osmaniaUniversityDropdownelement.findElements(By.tagName("option"));
          
          
          //getting the size of the elements
            int osmaniaUniversityDropdownelementCount=osmainaUniversityDropDown.size();
            
            
           System.out.println("The Size of the dropdown elements is:- "+osmaniaUniversityDropdownelementCount);
            
             for(int i=0;i<osmaniaUniversityDropdownelementCount;i++)
             {
            	  
            	 //getting the name of the elements
            	 
            	 String osmainaUniversityDropDownELementName=osmainaUniversityDropDown.get(i).getText();
            	 System.out.println("The languages Are:- " +osmainaUniversityDropDownELementName);
            	 
            	 //creation of the new selection
            	 
            	 Select dropDownSelection= new Select(osmaniaUniversityDropdownelement);
            	 
            	 dropDownSelection.selectByIndex(i);
            	 
            	 Thread.sleep(2000);
            	 
            	 //saving the file into a location
            	 File OsmaniaUniversityCurrentLanguageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            	 FileUtils.copyFile(OsmaniaUniversityCurrentLanguageScreenShot,new File(".\\OsmaniaUniversityLanguageScreenShots\\"+i+"-"+osmainaUniversityDropDownELementName+"LanguageScreenshot.png"));;
            	 
             }
             
             
		driver.quit();
		
   }
}
