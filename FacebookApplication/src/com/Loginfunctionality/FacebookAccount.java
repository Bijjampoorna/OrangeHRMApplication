package com.Loginfunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hpsf.Property;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookAccount extends BaseTest {
	Logger log=Logger.getLogger(FacebookAccount.class);
	
	@Test
	public void accountCreation() throws IOException, InterruptedException
	{
	    PropertyConfigurator.configure("FacebookLog4jPropertiesFile.properties");
	    
		
		
		FileInputStream proFile = new FileInputStream("./src/com/FaceBookPropertyFile/FacebookElements.properties");
		
		Properties pr=new Properties();
		pr.load(proFile);
		
		By createAccountL=By.xpath(pr.getProperty("createAccountProperty"));
		WebElement createAccountElement=driver.findElement(createAccountL);
		createAccountElement.click();
		
		
		
		////input[starts-with(@id,'u_2_b_']
		
		By firstNameL=By.xpath(pr.getProperty("firstNameProperty"));
		WebElement firstNameElement=driver.findElement(firstNameL);
		firstNameElement.sendKeys("Poorna");
		log.info("The First Name is:-Poorna");
		
		By surNameL=By.xpath(pr.getProperty("surNameProperty"));
		WebElement surNamelement=driver.findElement(surNameL);
		surNamelement.sendKeys("Bijjam");
		log.info("The Sur Name is:Bijjam");
		
		By mobileOrEmailL=By.xpath(pr.getProperty("mobileOremailProperty"));
		WebElement mobileOrEmailElement=driver.findElement(mobileOrEmailL);
		mobileOrEmailElement.sendKeys("bijjampoorna97@gmail.com");
		Thread.sleep(5000);
		
		//re-enter email address
		////input[starts-with(@id,'u_2_j_']
		By reEnteremailL=By.xpath(pr.getProperty("reEnteremailAddressProperty"));
		WebElement reEnterEmailElement=driver.findElement(reEnteremailL);
		reEnterEmailElement.sendKeys("bijjampoorna97@gmail.com");
		
		//Password
		////input[@id='password_step_input']
		By passwordL=By.xpath(pr.getProperty("passwordProperty"));
		WebElement passwordElement=driver.findElement(passwordL);
		passwordElement.sendKeys("Bijjampoorna12$");
		
		
		 //select day
	    ////select[@id='day']
		By selectDayL=By.xpath(pr.getProperty("selectDayProperty"));
		WebElement selectDayElement=driver.findElement(selectDayL);
		
		Select dropDownday= new Select(selectDayElement);
		dropDownday.selectByValue("1");
		
		
		
		
		//select month
		//select[@id='month']
		By selectMonthL=By.xpath(pr.getProperty("selectMonthProperty"));
		WebElement selectMonthElement=driver.findElement(selectMonthL);
		Select dropdownMonth=new Select(selectMonthElement);
		dropdownMonth.selectByValue("10");
		
		
		//select year
		////select[@id='year']
		By selectYearL=By.xpath(pr.getProperty("selectYearProperty"));
		WebElement selectYearElement=driver.findElement(selectYearL);
		Select dropdownYear=new Select(selectYearElement);
		dropdownYear.selectByValue("1997");
		
		//radioButton
		////input[starts-with(@id,'u_2_5_')]
		
		
		By genderL=By.xpath(pr.getProperty("genderProperty"));
		WebElement genderElement=driver.findElement(genderL);
		genderElement.click();
		
		//signupButton
		////button[starts-with(@id,'u_2_s_')]
		
		By signUpL=By.xpath(pr.getProperty("signUpProperty"));
		WebElement signUpElement=driver.findElement(signUpL);
		signUpElement.click();
		Thread.sleep(4500);
		
	
		
		
	}

}
