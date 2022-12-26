package com.OrangeHRMApplicationTestCases_PagesTest;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationHomePage;
import com.OrangeHRMApplicationPages.OrangeHRMApplicationLoginPage;
import com.Utility.Log;

public class OrangeHRMApplicationHomePageTest extends BaseTest 
{

	OrangeHRMApplicationHomePage OAHPT;
	
	@Test(priority=1)
	public void oHRMHomePageImageValidationTest()
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMHomePageImageValidation("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM HomePage Image Validation Tested Sucessfully");
		
	}
	@Test(priority=2)
	public void oHRMHomePageTextValidationTest()
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMHomePageTextValidation("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM HomePage Image Text Validation Tested Sucessfully");
		
	}
	@Test(priority=3)
	public void oHRMAddemployeeFunctionalityTest() throws InterruptedException
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMAddemployeeFunctionality("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM Add Employee Functionality Tested Sucessfully");
	
	}
	@Test(priority=4)
	public void oHRMEmployeeListFunctionalityTest() throws InterruptedException
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMEmployeeListFunctionality("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM Employee List Functionality Tested Sucessfully");
		
	}
	@Test(priority=5)
	public void oHRMCandidateFunctionalityTest() throws InterruptedException
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMCandidateFunctionality("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM Candidates Functionality Tested Sucessfully");
			
	}
	@Test(priority=6)
	public void oHRMPerformanceFunctionalityTest() throws InterruptedException
	{
		OAHPT=new OrangeHRMApplicationHomePage();
		OAHPT.oHRMPerformanceFunctionality("Bijjampoorna","Bijjampoorna12$");
		Log.info("Orange HRM Performance Functionality Tested Sucessfully");
		
		
	}




}

