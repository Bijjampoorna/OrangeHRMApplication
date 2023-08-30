package com.WindowBasedOperations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ChoosingPicsFromWindow extends BaseTest
{
@Test
public void ChoosingPic() throws InterruptedException, IOException
{
	

	
	//Validating the OrangeHRM Application Login Page
	
	String expected_OrangeHRMLoginPage_Title="OrangeHRM";
	System.out.println("the expected title of OrangeHRM Login Page is:-" +expected_OrangeHRMLoginPage_Title);
	
	String actual_OrangeHRMLoginPage_Title=driver.getTitle();
	System.out.println("the actual title of Orange HRM Application Login Page is:-"+actual_OrangeHRMLoginPage_Title);
	
	if(actual_OrangeHRMLoginPage_Title.equals(expected_OrangeHRMLoginPage_Title))
	{
		System.out.println("Landed Sucessfully at Orange HRM Application LoginPage-Pass");
	}
	else
	{
		System.out.println("Failed to land at Orange HRM LoginPage-Fail");
	}
	
   //Expected text of LoginPage Element
	
    String expectedTextOfLoginPage="LOGIN Panel";
    System.out.println("the expected text of Orange HRM LoginPage is:- "+expectedTextOfLoginPage);
    
  //<div id="logInPanelHeading">LOGIN Panel</div>
	WebElement TextOfLoginpage=driver.findElement(By.id("logInPanelHeading"));
	String actualTextOfLoginPage=TextOfLoginpage.getText();
	
	System.out.println("the actual text of Orange HRM Loginpage is:- "+actualTextOfLoginPage);
	
	if(actualTextOfLoginPage.equals(expectedTextOfLoginPage))
	{
		System.out.println("the Text Of Orange HRM Login Page is Matching-Pass");
	}
	else
	{
		System.out.println("the Text of Orange HRM Login page is Not Matching-Fail");
	}
	

	//testing the Username Functionality
	//<input name="txtUsername" id="txtUsername" type="text">
	
	WebElement UsernameElement=driver.findElement(By.id("txtUsername"));
	UsernameElement.sendKeys("Bijjampoorna");
	
	//Testing Password Functionality
    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	
	WebElement PasswordElement=driver.findElement(By.id("txtPassword"));
	PasswordElement.sendKeys("Bijjampoorna12$");
	
	//Testing Login Button Functionality
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	WebElement Login=driver.findElement(By.id("btnLogin"));
	Login.click();
	
	
	//Validating the Orange Application HRM Home Page Element
	
	String expected_OrangeHRMHomePage_Title="orangeHRM";
	System.out.println("the expected OrangeHRM HomePage Title:- "+expected_OrangeHRMHomePage_Title);
	
	
    String actual_OrangeHRMHomePage_Title=driver.getTitle();
	System.out.println("the actual OrangeHRM HomePage Title:- "+actual_OrangeHRMHomePage_Title);
	
	if(actual_OrangeHRMHomePage_Title.equalsIgnoreCase(expected_OrangeHRMHomePage_Title))
	{
		System.out.println("The Orange HRM Application HomePage Titles Matched-Pass");	
	}
	else
	{
		System.out.println("The Orange HRM Application Homepage Title Not Matched-Fail");
		
		
	}
	
	
	
	//Expected URL Address
	
	String expectedURLAddress="orangehrm";
	System.out.println("The Expected URL Address of Orange HRM HomePage is:- "+expectedURLAddress);
	
	String actualURLAddress=driver.getCurrentUrl();
	System.out.println("The Actual URL Address of Orange HRM HomePage is:- "+actualURLAddress);
	
	if(actualURLAddress.contains(expectedURLAddress))
	{
		System.out.println("the URl Address of Orange HRM HomePage Is Matching-Pass");
	}
	else
	{
		System.out.println("the URl Address of Orange HRM HomePage Is Not Matching-Fail");
	}
	

	// Validating Welcome Admin Element
	//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	
	
	
	WebElement welcomeAdminElement=driver.findElement(By.id("welcome"));
	welcomeAdminElement.getText();
	//welcomeAdminElement.click();
	
	//Expected Text of Admin
	String expectedTextOfHomePage="Admin";
	System.out.println("The Expected Text Of Orange HRM HomePage is:- "+expectedTextOfHomePage);
	
	String actualTextOfHomePage=welcomeAdminElement.getText();
	System.out.println("The Actual Text Of Orange HRM Homepage is:- "+actualTextOfHomePage);
	
	if(actualTextOfHomePage.contains(expectedTextOfHomePage))
	{
		System.out.println("The Text Of Orange HRM HomePage is Matching-Pass");
	}
	else
	{
		System.out.println("The Text Of Orange HRM Homepage is Not Matching-Fail");
	}
	
	
	//validating PIM Element
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	
	WebElement menuPIM_Element=driver.findElement(By.id("menu_pim_viewPimModule"));
	
	Actions act=new Actions(driver);
	act.moveToElement(menuPIM_Element).build().perform();
	
	//Validating Add Employee Element
	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	
	WebElement PIM_AddEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
	PIM_AddEmployeeElement.click();
	
	//Validating Add Employee First Name Element
	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	
	  String ExpectedEmployee1FirstName="Mary";
	   System.out.println("The Expected First Name Of Employee1:-"+ExpectedEmployee1FirstName); 
	   
	WebElement employee1FirstNameElement=driver.findElement(By.id("firstName"));
	   employee1FirstNameElement.sendKeys(ExpectedEmployee1FirstName);
	  
	  //Validating Add Employee Middle Name Element
	  //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	   
	   String ExpectedEmployee1MiddleName="Elizabeth";
	   System.out.println("The Expected Middle Name Of Employee1:-"+ExpectedEmployee1MiddleName);
	   
	WebElement employee1MiddleNameElement=driver.findElement(By.id("middleName"));
	    employee1MiddleNameElement.sendKeys(ExpectedEmployee1MiddleName);
	
	    //Validating Add Employee Last Name Element
	    //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	    
	    String ExpectedEmployee1LastName="Winstead";
		   System.out.println("The Expected Last Name Of Employee1:-"+ExpectedEmployee1LastName);
	    
	WebElement employee1LastNameElement=driver.findElement(By.id("lastName"));
	      employee1LastNameElement.sendKeys(ExpectedEmployee1LastName);
	      
	      //Shifts to Employee Id
	      act.sendKeys(Keys.TAB).build().perform();
	      
	      /*
	      //Validating PhotoGraph
	      //<input class="duplexBox" type="file" name="photofile" id="photofile">
	      ///html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input
	      By photoGraphL=By.xpath("/html/body/div[1]/div[3]/div/div[2]/form/fieldset/ol/li[3]/input");
	      WebElement photoGraphElement=driver.findElement(photoGraphL);
	      photoGraphElement.click();
	*/
	 act.sendKeys(Keys.TAB).build().perform();
	 
	 
	 //performing Enter Operation
	 act.sendKeys(Keys.ENTER).build().perform();
	 Thread.sleep(5000);
	 //Performing AuotIt
	 //String autoITScriptPath="C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\OHRMAutoITScripts\\PhotoGraphScript.exe";
	 String autoITScriptPath="./OHRMAutoITScripts/MultiplePhotoGraphScript.exe";
	 java.lang.Runtime.getRuntime().exec(autoITScriptPath);
	 Thread.sleep(5000);
	 
	 By addEmployeeSaveButtonL=By.id("btnSave");		
	 WebElement addEmployeeSaveButtonElement=driver.findElement(addEmployeeSaveButtonL);
    addEmployeeSaveButtonElement.click();
	 
	
	
	
}
	
	
	
	
	

}
