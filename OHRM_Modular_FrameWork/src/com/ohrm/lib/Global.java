package com.ohrm.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global 
{

	//RULE-1--Test Data
	public WebDriver driver;

	public String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public String userName="Bijjampoorna";
	public String passWord="Bijjampoorna12$";
	public String firstName="Mary";
	public String middleName="Elizibeth";
	public String lastName="Winstead";
	
	
	
	//Expected Data
	public String expectedLoginPageText="LOGIN Panel";
	public String expectedHomePageText="Welcome Admin";
	public String expectedAddEmployeePageText="Add Employee";
	
	//RULE-2--Objects Info
	public String loginPanelElement="logInPanelHeading";
	public String userNameElement="txtUsername";
	public String passWordElement="txtPassword";
	public String loginBtnElement="btnLogin";
	public String welcomeAdminElement="welcome";
	public String logOutElement="Logout";
	public String pimElement="menu_pim_viewPimModule";
	public String addEmployeeElement="menu_pim_addEmployee";
	public String addEmployeeTextElement="head";
	public String firstNameElement="firstName";
	public String middleNameElement="middleName";
	public String lastNameElement="lastName";
	public String saveBtnElement="btnSave";
}
