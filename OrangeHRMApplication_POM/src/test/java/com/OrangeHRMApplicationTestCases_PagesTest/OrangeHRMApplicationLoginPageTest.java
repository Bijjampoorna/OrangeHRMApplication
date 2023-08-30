package com.OrangeHRMApplicationTestCases_PagesTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationLoginPage;
import com.Utility.Log;

public class OrangeHRMApplicationLoginPageTest extends BaseTest 
{

	OrangeHRMApplicationLoginPage OALIP;
	@Test(priority=1)
	public void OHRMLoginPageImageValidationTest()
	{
		
		OALIP=new OrangeHRMApplicationLoginPage();
		OALIP.oHRMLoginPageImageValidation();
		Log.info("OHRM LoginPage Image Validation Test Sucessfull");
	
		
	}
	@Test(priority=2)
	public void OHRMLoginPagetextValidationTest()
	{
		OALIP=new OrangeHRMApplicationLoginPage();
		OALIP.oHRMLoginPageTextValidation();
		Log.info("OHRM LoginPage text Validation Test Sucessfull");
	}
	@Test(priority=3)
	public void OHRMLoginFuctionalityTest()
	{
		OALIP=new OrangeHRMApplicationLoginPage();
		OALIP.OHRMLoginPageLoginFunctionality("Bijjampoorna","Bijjampoorna12$");
		Log.info("OHRM Login Functionality Test Sucessfull");
	}
	
	
	
	
}
