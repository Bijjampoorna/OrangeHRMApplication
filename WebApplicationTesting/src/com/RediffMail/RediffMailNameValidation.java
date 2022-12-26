package com.RediffMail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RediffMailNameValidation extends BaseTest {
	
	
	@Test
	public void ReddifMailName()
	{
		
		///html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
		//<input type="text" onblur="fieldTrack(this);" name="name79f00670" value="" style="width:185px;" maxlength="61" xpath="1">
		//<input type="text" onblur="fieldTrack(this);" name="namefac04bfb" value="" style="width:185px;" maxlength="61">
		
		//input[@name='namefac04bfb']
		
		//input[starts-with(@name,'name')]
		
		 //String xPathExpression="/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input";
		String xPathExpression="//input[starts-with(@name,'name')]";
		By fullNameL=By.xpath(xPathExpression);
		WebElement fullNameElement=driver.findElement(fullNameL);
		
		String fullName="Bijjam Poorna";
		fullNameElement.sendKeys(fullName);
		
		//PAssword element
		
		//<input type="password" name="passwdfac04bfb" value="" style="width:calc(100% - 40px); float:left;" onblur="fieldTrack(this);" id="newpasswd" xpath="1">
		//<input type="password" name="passwd7ea5e024" value="" style="width:calc(100% - 40px); float:left;" onblur="fieldTrack(this);" id="newpasswd" xpath="1">
		
		//input[starts-with(@name,passwd)]
		//String passwordXpathExpression="//input[starts-with(@name,passwd)]";
		String passwordXpathExpression="//input[@id='newpasswd']";
		By passwordL=By.xpath(passwordXpathExpression);
		WebElement passwordElemnet=driver.findElement(passwordL);
		String password="BijjamPoorna12$";
		passwordElemnet.sendKeys(password);
		
		
		
	}

}
