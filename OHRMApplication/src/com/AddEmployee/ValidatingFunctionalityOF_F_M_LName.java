package com.AddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogMF;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ValidatingFunctionalityOF_F_M_LName extends ValidatingAddEmployeePage {
	
	@Test(priority=5)
	public void ValidatingFunctionalityOfAddEmployeeName() throws IOException
	{
		
//PROPERTY FILE
		FileInputStream Profile=new FileInputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\PropertyFile\\OrangeHRM_DDT_PropertyFile.properties");
		 Properties pr=new Properties();
		 pr.load(Profile);
		
//Getting The Data from The ExcelWorkbook
//Identifying The File
		 String excelPath="C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx";
		 FileInputStream testData=new FileInputStream(excelPath);
						
//Identifying the Workbook
		 XSSFWorkbook workbook=new XSSFWorkbook(testData);
						 
//IDentifying the Sheet in the WorkBook
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
//Identifying the Active rows in the Sheet
	    int rowsCount=sheet.getLastRowNum();
		System.out.println("The Active Rows In The Sheet Are:-"+rowsCount);
			
		for(int row=1;row<=rowsCount;row++)
		{
				//going to all the active Rows
				Row sheetRow=sheet.getRow(row);
		
//PROPERTY FIRST NAME
				
			By employeeFirstNameL=By.id(pr.getProperty("employeeFirstNameL"));
			WebElement employee1FirstNameElement=driver.findElement(employeeFirstNameL);
			
			Cell expected_FirstName=sheetRow.getCell(14);
			String expectedFirstName=expected_FirstName.getStringCellValue();
			System.out.println("The First Name Of Employee is :- "+expectedFirstName);
			
			
			employee1FirstNameElement.sendKeys(expectedFirstName);

//PROPERTY MIDDLE NAME
			
			By employeeMiddleNameL=By.id(pr.getProperty("employeeMiddleNameL"));
			WebElement employee1MiddleNameElement=driver.findElement(employeeMiddleNameL);
			 
			Cell expected_MiddleName=sheetRow.getCell(15);
			String expectedMiddleName=expected_MiddleName.getStringCellValue();
			System.out.println("The Middle Name Of Employee is :- "+expectedMiddleName);
			employee1MiddleNameElement.sendKeys(expectedMiddleName);
			
//PROPERTY LAST NAME
			
			By employeeLastNameL=By.id(pr.getProperty("employeeLastNameL"));
			WebElement employee1LastNameElement=driver.findElement(employeeLastNameL);
			
			Cell expected_LastName=sheetRow.getCell(16);
			String expectedLastName=expected_LastName.getStringCellValue();
			System.out.println("The Middle Name Of Employee is :- "+expectedLastName);
			employee1LastNameElement.sendKeys(expectedLastName);
			
//PROPERTY OF EMPLOYEE ID
			
			By empIdL=By.id(pr.getProperty("empIdL"));
 			WebElement empIdElement=driver.findElement(empIdL);
			String expectedEmpId=empIdElement.getAttribute("value");
			Cell expected_EmpId=sheetRow.createCell(17);
			expected_EmpId.setCellValue(expectedEmpId);
			System.out.println("The Expected Employee ID:- "+expectedEmpId);		
			
//PROPERTY SAVE BUTTON
			
			By addEmployeeSaveButtonL=By.id(pr.getProperty("addEmployeeSaveButtonL"));		
			 WebElement addEmployeeSaveButtonElement=driver.findElement(addEmployeeSaveButtonL);
		    addEmployeeSaveButtonElement.click();
		    
//VALIDATING EMPLOYEE ID
		     //   <input value="0167"  id="personal_txtEmployeeId" 
		       
		        By actualEmpIdL=By.id(pr.getProperty("actualEmpId"));
		        WebElement actualEmpIdElement=driver.findElement(actualEmpIdL);
		        String actualEmpId=actualEmpIdElement.getAttribute("value");
		        Cell Actual_Employee_ID=sheetRow.createCell(18);
		        Actual_Employee_ID.setCellValue(actualEmpId);
		        System.out.println("The Actual Employee ID:- "+actualEmpId);
		        
		        if(actualEmpId.equals(expectedEmpId))
		        {
		        	String TestResult="Both Id's Are Matching-PASS";
		        	//System.out.println(TestResult);
		        	log.info(TestResult);
		        	Cell empIdTestResult=sheetRow.createCell(19);
		        	empIdTestResult.setCellValue(TestResult);
		        }
		        else
		        {
		        	String TestResult="Both Id's Are Not Matching-FAIL";
		        	//System.out.println(TestResult);
		        	log.error(TestResult);
		        	Cell empIdTestResult=sheetRow.createCell(19);
		        	empIdTestResult.setCellValue(TestResult);
		        }
		    
//VALIDATING PERSONAL DETAILS PAGE		    
		    
		    Cell expected_PersoanalDetailsPageText=sheetRow.getCell(20);
		    String expectedPersonalDetailsPage=expected_PersoanalDetailsPageText.getStringCellValue();
		    System.out.println("The Expected Title of Personal Details Page is :-"+expectedPersonalDetailsPage);
		    
		   
		    By personalDetailsPageL=By.xpath(pr.getProperty("personalDetailsPageL"));
		    WebElement personalDetailsPageElement=driver.findElement(personalDetailsPageL);
		    String actualPersonalDetailsPage=personalDetailsPageElement.getText();
		    System.out.println("The Actual Title of Personal Details Page is :- "+actualPersonalDetailsPage);
		    
		    Cell actual_PersoanalDetailsPageText=sheetRow.createCell(21);
		    actual_PersoanalDetailsPageText.setCellValue(actualPersonalDetailsPage);
		    
		    if(actualPersonalDetailsPage.equals(expectedPersonalDetailsPage))
		    {
		    	String personalPagetestResult="Titles are Matching-PASS";
		    	//System.out.println(personalPagetestResult);
		    	log.info(personalPagetestResult);
		    	Cell personalDetailsTestResult=sheetRow.createCell(22);
		    	personalDetailsTestResult.setCellValue(personalPagetestResult);
		    }
		    else
		    {
		    	String personalPagetestResult="Titles are Not Matching-FAIL";
		    	System.out.println(personalPagetestResult);
		    	log.error(personalPagetestResult);
		    	Cell personalDetailsTestResult=sheetRow.createCell(22);
		    	personalDetailsTestResult.setCellValue(personalPagetestResult);
		    }
	
		      
//VALIDATING FIRST NAME
		    By actualFirstNameL=By.id(pr.getProperty("actualFirstNameL"));
		    WebElement actualFirstNameElemnt=driver.findElement(actualFirstNameL);
		    String actualFirstName=actualFirstNameElemnt.getAttribute("value");
		    System.out.println("The Actual First Name of Employee1 Is:-" +actualFirstName);
		    Cell actual_FirstName=sheetRow.createCell(23);
		    actual_FirstName.setCellValue(actualFirstName);
		    
		    if(actualFirstName.equals(expectedFirstName))
		    {
		        String FirstNameTestResult="First Names Are Matching-PASS";
		    	//System.out.println(FirstNameTestResult);
		    	log.info(FirstNameTestResult);
		    	Cell firstName_TestResult=sheetRow.createCell(24);
		    	firstName_TestResult.setCellValue(FirstNameTestResult);		    	
		    	
		    }
		    else
		    {
		    	String FirstNameTestResult="First Names Are Not Matching-PASS";
		    	//System.out.println(FirstNameTestResult);
		    	log.error(FirstNameTestResult);
		    	Cell firstName_TestResult=sheetRow.createCell(24);
		    	firstName_TestResult.setCellValue(FirstNameTestResult);
		    	
		    }

//VALIDATING MIDDLE NAME		    
		    By actualMiddleNameL=By.id(pr.getProperty("actualMiddleNameL"));
		    WebElement actualMiddleNameElement=driver.findElement(actualMiddleNameL);	
		    String  actualMiddleName=actualMiddleNameElement.getAttribute("value");
		    System.out.println("The Actual Middle Name of Employee Is:-" +actualMiddleName);
		    Cell actual_MiddleName=sheetRow.createCell(25);
		    actual_MiddleName.setCellValue(actualMiddleName);
		    

		    if(actualMiddleName.equals(expectedMiddleName))

		    {
		    	String MiddleNameTestResult="Middle Names Are Matching-PASS";
			    //System.out.println(MiddleNameTestResult);
			    log.info(MiddleNameTestResult);
			    Cell middleName_TestResult=sheetRow.createCell(26);
			    middleName_TestResult.setCellValue(MiddleNameTestResult);		
		    	
		    }
		    else
		    {
		    	String MiddleNameTestResult="Middle Names Are Not Matching-Fail";
		    	log.error(MiddleNameTestResult);
			    //System.out.println(MiddleNameTestResult);
			    Cell middleName_TestResult=sheetRow.createCell(26);
			    middleName_TestResult.setCellValue(MiddleNameTestResult);
		    	
		    }
		    	    
//VALIDATING LAST NAME
		    By actualLastNameL=By.id(pr.getProperty("actualLastNameL"));
		    WebElement actualLastNameElement=driver.findElement(actualLastNameL);
	        String actualLastName=actualLastNameElement.getAttribute("value");
	        System.out.println("The Actual Last Name of Employee Is:-" +actualLastName);
	        Cell actual_LastName=sheetRow.createCell(27);
	        actual_LastName.setCellValue(actualLastName);
	        
	        if(actualLastName.equals(expectedLastName)) 
	        {
	        	
	        	String LastNameTestResult="Last Names Are Matching-PASS";
			    //System.out.println(LastNameTestResult);
	        	log.info(LastNameTestResult);
			    Cell lastName_TestResult=sheetRow.createCell(28);
			    lastName_TestResult.setCellValue(LastNameTestResult);		
	        	
	        	
	        }
	        else
	        {
	        	String LastNameTestResult="Last Names Are Not Matching-PASS";
			    System.out.println(LastNameTestResult);
			    log.error(LastNameTestResult);
			    Cell lastName_TestResult=sheetRow.createCell(28);
			    lastName_TestResult.setCellValue(LastNameTestResult);		
	        }
	        
	      
	        

//VALIDATING PIM ELEMENT PROPERTY TO PERFORM MULTIPLE DATA ENTRY
			
			By pIMElementL=By.id(pr.getProperty("pIMElementL"));
			WebElement menuPIM_Element=driver.findElement(pIMElementL);
			
			Actions act=new Actions(driver);
			act.moveToElement(menuPIM_Element).build().perform();
			
	//VALIDATING ADD EMPLOYEE PROPERTY
			
	        By addEmployeeL=By.id(pr.getProperty("addEmployeeL"));
			WebElement PIM_AddEmployeeElement=driver.findElement(addEmployeeL);
			PIM_AddEmployeeElement.click();
	
		}
		
		FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx");
		workbook.write(testResults);	

		
	}
	
	

}
