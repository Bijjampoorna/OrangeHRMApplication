package com.ohrm.testscripts;
import com.ohrm.lib.General;
public class Tc_001_Login_LogOut 
{

	public static void main(String[] args) throws InterruptedException 
	{
		General obj=new General();
		obj.setUp();
		obj.loginPageValidation();
		obj.login();
		obj.homepageValidation();
		obj.logOut();
		obj.tearDown();
		
		
	}
}
