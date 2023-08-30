package com.OrangeHRMApplicationPages;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class OrangeHRMApplicationLoginPage extends BaseTest
{
   public OrangeHRMApplicationLoginPage()
   {
	   PageFactory.initElements(driver, this);
	   
   }
   //Object Repository
   
  
   
   @FindBy(xpath="//div[@id='divLogo']//img")
   WebElement oHRM_LoginPageImageL;
   
   @FindBy(id="logInPanelHeading")
   WebElement oHRM_LoginPageTextL;
   
   @FindBy(id="txtUsername")
   WebElement userNameL;
   
   @FindBy(id="txtPassword")
   WebElement passwordL;
   
   @FindBy(id="btnLogin")
   WebElement loginButtonL;
   
   
   public void oHRMLoginPageImageValidation()
   {
	   boolean flag=oHRM_LoginPageImageL.isDisplayed();
	   Assert.assertTrue(flag, "OrangeHRM Login Page Image Not found");
	   Log.info("oHRM LoginPage Image Validation Sucessfull");
	   
   }
   
   public void oHRMLoginPageTextValidation()
   {
	   String expectedOHRMApplicationLoginPageText="LOGIN Panel";
	   String actualOHRMApplicationLoginPageText=oHRM_LoginPageTextL.getText();
	   Assert.assertEquals(actualOHRMApplicationLoginPageText, expectedOHRMApplicationLoginPageText, "OrangeHRM Login Page Text Not Matching");
	   Log.info("oHRM LoginPage TextValidation Sucessfull");
	   
   }
   
   public void OHRMLoginPageLoginFunctionality(String userName,String password)
   {
	   userNameL.sendKeys(userName);
	   passwordL.sendKeys(password);
	   loginButtonL.click();
	   Log.info("OHRM LoginPage Login Functionality Sucessfull");
	   
	   
   }
	
}
