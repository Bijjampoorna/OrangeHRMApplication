package com.ohrm.testscripts;

import com.ohrm.lib.General;

public class Tc_002_AddEmployee
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		General ad=new General();
		ad.setUp();
		ad.loginPageValidation();
		ad.login();
		ad.homepageValidation();
		ad.addEmployeepageValidation();
		ad.employeeName();
		ad.logOut();
		ad.tearDown();
	}
}
