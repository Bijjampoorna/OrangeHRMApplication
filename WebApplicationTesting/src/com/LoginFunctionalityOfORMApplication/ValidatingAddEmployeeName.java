package com.LoginFunctionalityOfORMApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidatingAddEmployeeName {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String ORMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";      
		
		driver.get(ORMApplicationURLAddress);
		
		//Validating the OrangeHRM Application Login Page
		
		String expected_orangeHRMLoginPage_Title="OrangeHRM";
		System.out.println("the expected title of OrangeHRM Login Page is:-" +expected_orangeHRMLoginPage_Title);
		
		String actual_orangeHRMLoginPage_Title=driver.getTitle();
		System.out.println("the actual title of Orange HRM Application Login Page is:-"+actual_orangeHRMLoginPage_Title);
		
		if(actual_orangeHRMLoginPage_Title.equals(expected_orangeHRMLoginPage_Title))
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
		WebElement textOfLoginpage=driver.findElementById("logInPanelHeading");
		String actualTextOfLoginPage=textOfLoginpage.getText();
		
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
		
		WebElement usernameElement=driver.findElementById("txtUsername");
		usernameElement.sendKeys("Bijjampoorna");
		
		//Testing Password Functionality
	    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement passwordElement=driver.findElementById("txtPassword");
		passwordElement.sendKeys("Bijjampoorna12$");
		
		//Testing Login Button Functionality
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		WebElement logIn=driver.findElementById("btnLogin");
		logIn.click();
		
		
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
		
		
		
		WebElement welcomeAdminElement=driver.findElementById("welcome");
		welcomeAdminElement.getText();
		
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
		
		WebElement menuPIM_Element=driver.findElementById("menu_pim_viewPimModule");
		
		Actions act=new Actions(driver);
		act.moveToElement(menuPIM_Element).build().perform();
		
		//Validating Add Employee Element
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		
		WebElement PIM_AddEmployeeElement=driver.findElementById("menu_pim_addEmployee");
		PIM_AddEmployeeElement.click();
		
		//Validating Add Employee First Name Element
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		  String expectedEmployee1FirstName="Mary";
		   System.out.println("The Expected First Name Of Employee1:-"+expectedEmployee1FirstName); 
		   
		WebElement employee1FirstNameElement=driver.findElementById("firstName");
		   employee1FirstNameElement.sendKeys(expectedEmployee1FirstName);
		  
		  //Validating Add Employee Middle Name Element
		  //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		   
		   String expectedEmployee1MiddleName="Elizabeth";
		   System.out.println("The Expected Middle Name Of Employee1:-"+expectedEmployee1MiddleName);
		   
		WebElement employee1MiddleNameElement=driver.findElementById("middleName");
		    employee1MiddleNameElement.sendKeys(expectedEmployee1MiddleName);
		
		    //Validating Add Employee Last Name Element
		    //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		    
		    String expectedEmployee1LastName="Winstead";
			   System.out.println("The Expected Last Name Of Employee1:-"+expectedEmployee1LastName);
		    
		WebElement employee1LastNameElement=driver.findElementById("lastName");
		      employee1LastNameElement.sendKeys(expectedEmployee1LastName);
		      
		      //Property of Empid
		      //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0024" id="employeeId">
		     WebElement employee1IdElement=driver.findElementById("employeeId");
		     String expectedEmployee1Id=employee1IdElement.getAttribute("value");
		     System.out.println("The Id of employee1 is:- "+expectedEmployee1Id);
		     
		  //Validating Save Button Element
		  //<input type="button" class="" id="btnSave" value="Save">
		     
	   WebElement addEmployeeSaveButtonElement=driver.findElementById("btnSave");
		    	addEmployeeSaveButtonElement.click();	  
		      
		    	
		 //Validating FName MName LName Add Employee Element
		 //<input value="Mary" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
   	
		    WebElement personalDetailsOfemployee1FirstName=driver.findElementById("personal_txtEmpFirstName" );
		    String actualEmployee1FirstName=personalDetailsOfemployee1FirstName.getAttribute("value");
		    	
		    	System.out.println("The Actual First Name of Employee1 Is:-" +actualEmployee1FirstName);
		    
		  //<input value="Elizabeth" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
  	
		    WebElement personalDetailsOfemployee1MiddleName=driver.findElementById("personal_txtEmpMiddleName" );	
		    String  actualEmployee1MiddleName=personalDetailsOfemployee1MiddleName.getAttribute("value");
		    	
		        System.out.println("The Actual Middle Name of Employee1 Is:-" +actualEmployee1MiddleName);
		        
		   //<input value="Winstead" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
            
		        WebElement personalDetailsOfemployee1LastName=driver.findElementById("personal_txtEmpLastName" );
		        String actualEmployee1LastName=personalDetailsOfemployee1LastName.getAttribute("value");
		        
		        System.out.println("The Actual Last Name of Employee1 Is:-" +actualEmployee1LastName);
		        
		      //Property of EmployeeID
		      //<input value="0024" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		        
		        WebElement personalDetailsOfEmployee1Id=driver.findElementById("personal_txtEmployeeId");
		        String actualEmployee1Id=personalDetailsOfEmployee1Id.getAttribute("value");
		        
		        System.out.println("The Actual Id of Employee1 Is:- "+actualEmployee1Id);
		        
		        
		    //Validating FirstName MiddleName LastName EmpID FullName Of Employee1
		        
		        if(actualEmployee1FirstName.equals(expectedEmployee1FirstName))
		        {
		        	System.out.println("The Employee1 First Name is Matched-PASS");
		        }
		        else
		        {
		        	System.out.println("The Employee1 First Name Does Not Match-FAIL");
		        }
		        
		        if(actualEmployee1MiddleName.equals(expectedEmployee1MiddleName))
		        {
		        	System.out.println("The Employee1 Middle Name Is Matched-PASS");
		        }
		        else
		        {
		        	System.out.println("The Employee1 Middle Name Does Not Match-FAIL");
		        }
		        
		        if(actualEmployee1LastName.equals(expectedEmployee1LastName))
		        {
		        	System.out.println("The Employee1 Last Name Is Matched-PASS");
		        }
		        else
		        {
		        	System.out.println("The Employee1 Last Name Does Not Match-FAIL");
		        }
		        
		        if(actualEmployee1Id.equals(expectedEmployee1Id))
		        {
		        	System.out.println("The Employee1 Id Is Matched-PASS");
		        }
		        else
		        {
		        	System.out.println("The Employee1 Id Is Not Macthed-FAIL");
		        }
		        
		        
		        //Validating Full Name With FirstName MiddleName LastName Of Employee1
		        //<h1>Mary Elizabeth Winstead</h1>
		        //<div id="profile-pic">
		        
		       WebElement personalDetailsFullNameOfEmployee1=driver.findElementById("profile-pic");
		       String fullNameOfemployee1=personalDetailsFullNameOfEmployee1.getText();
		        
		      System.out.println("The Full Name:- "+fullNameOfemployee1);
		    		   
		      String expectedFullNameofEmployee1=expectedEmployee1FirstName+" " +expectedEmployee1MiddleName+" " +expectedEmployee1LastName;
		          System.out.println("The Expected Full Name of Employee1:- "+expectedFullNameofEmployee1);
		    		   
		    		 if(fullNameOfemployee1.equals(expectedFullNameofEmployee1)) {
		    			 System.out.println("Both Names Are MAtching-PASS");
		    		 }
		    		 else
		    		 {
		    			 System.out.println("Boyh Names are Not Matching-FAIL");
		    		 }
		    	/*   
		        if(fullNameOfemployee1.contains(expectedEmployee1FirstName))
		        {
		        	System.out.println("The Full Name Has The FirstName Of Employee1-PASS");
		        }
		        else
		        {
		           System.out.println("The Full Name Does Not Have The FirstName Of Employee1-FAIL");
		        }
		        
		        if(fullNameOfemployee1.contains(expectedEmployee1MiddleName))
		        {
		        	System.out.println("The Full Name Has The MiddleName Of Employee1-PASS");
		        }
		        else
		        {
		        	System.out.println("The Full Name Does Not Have The MiddleName Of Employee1-FAIL");
		        }
		        
		        if(fullNameOfemployee1.contains(expectedEmployee1LastName))
		        {
		        	System.out.println("The Full Name Has The LastName Of Employee1-PASS");
		        }
		        else
		        {
		        	System.out.println("The Full Name Does Not Have The LastName Of Employee1-FAIL");
		        }
		          */
		        
		        WebElement welcomeAdminElement1=driver.findElementById("welcome");
				welcomeAdminElement1.click();
		    	
		//Validating LogOut Button Element
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		
		Thread.sleep(2000);
		
	    WebElement logOutElement=driver.findElementByLinkText("Logout");
		logOutElement.click();
			
		driver.close();
        
	
	}

}
