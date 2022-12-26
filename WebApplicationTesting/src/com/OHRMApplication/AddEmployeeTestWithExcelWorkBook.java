package com.OHRMApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddEmployeeTestWithExcelWorkBook extends LoginPage
{
	@Test(priority=2)
	public void addEmployee()
	{
		WebElement PIM_AddEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
		PIM_AddEmployeeElement.click();
		
		//Validating Add Employee First Name Element
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		  String expectedEmployee1FirstName="Mary";
		   System.out.println("The Expected First Name Of Employee1:-"+expectedEmployee1FirstName); 
		   
		WebElement employee1FirstNameElement=driver.findElement(By.id("firstName"));
		   employee1FirstNameElement.sendKeys(expectedEmployee1FirstName);
		  
		  //Validating Add Employee Middle Name Element
		  //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		   
		   String expectedEmployee1MiddleName="Elizabeth";
		   System.out.println("The Expected Middle Name Of Employee1:-"+expectedEmployee1MiddleName);
		   
		WebElement employee1MiddleNameElement=driver.findElement(By.id("middleName"));
		    employee1MiddleNameElement.sendKeys(expectedEmployee1MiddleName);
		
		    //Validating Add Employee Last Name Element
		    //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		    
		    String expectedEmployee1LastName="Winstead";
			   System.out.println("The Expected Last Name Of Employee1:-"+expectedEmployee1LastName);
		    
		WebElement employee1LastNameElement=driver.findElement(By.id("lastName"));
		      employee1LastNameElement.sendKeys(expectedEmployee1LastName);
		      
		      //Property of Empid
		      //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0024" id="employeeId">
		     WebElement employee1IdElement=driver.findElement(By.id("employeeId"));
		     String expectedEmployee1Id=employee1IdElement.getAttribute("value");
		     System.out.println("The Id of employee1 is:- "+expectedEmployee1Id);
		     
		  //Validating Save Button Element
		  //<input type="button" class="" id="btnSave" value="Save">
		     
	   WebElement addEmployeeSaveButtonElement=driver.findElement(By.id("btnSave"));
		    	addEmployeeSaveButtonElement.click();	  
		      
		    	
		 //Validating FName MName LName Add Employee Element
		 //<input value="Mary" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
   	
		    WebElement personalDetailsOfemployee1FirstName=driver.findElement(By.id("personal_txtEmpFirstName" ));
		    String actualEmployee1FirstName=personalDetailsOfemployee1FirstName.getAttribute("value");
		    	
		    	System.out.println("The Actual First Name of Employee1 Is:-" +actualEmployee1FirstName);
		    
		  //<input value="Elizabeth" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
  	
		    WebElement personalDetailsOfemployee1MiddleName=driver.findElement(By.id("personal_txtEmpMiddleName" ));	
		    String  actualEmployee1MiddleName=personalDetailsOfemployee1MiddleName.getAttribute("value");
		    	
		        System.out.println("The Actual Middle Name of Employee1 Is:-" +actualEmployee1MiddleName);
		        
		   //<input value="Winstead" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
            
		        WebElement personalDetailsOfemployee1LastName=driver.findElement(By.id("personal_txtEmpLastName" ));
		        String actualEmployee1LastName=personalDetailsOfemployee1LastName.getAttribute("value");
		        
		        System.out.println("The Actual Last Name of Employee1 Is:-" +actualEmployee1LastName);
		        
		      //Property of EmployeeID
		      //<input value="0024" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		        
		        WebElement personalDetailsOfEmployee1Id=driver.findElement(By.id("personal_txtEmployeeId"));
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
		        
		       WebElement personalDetailsFullNameOfEmployee1=driver.findElement(By.id("profile-pic"));
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
		    	 
		
		
		
	}

}
