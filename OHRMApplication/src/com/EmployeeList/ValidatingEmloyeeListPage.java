package com.EmployeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ValidatingEmloyeeListPage  extends ValidatingHomePageOfOHRM
{
	@Test(priority=4)
   public void ValidatingEmloyeeList() throws IOException, InterruptedException
   {
	   
//PROPERTY FILE
		FileInputStream Profile=new FileInputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\PropertyFile\\OrangeHRM_DDT_PropertyFile.properties");
		 Properties pr=new Properties();
		 pr.load(Profile);
		
		//Getting The Data from The ExcelWorkbook
		 //Identifying The File
 	 String excelPath="C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\EmployeeListTestResults.xlsx";
		 FileInputStream testData=new FileInputStream(excelPath);
		
		 //Identifying the Workbook
		 XSSFWorkbook workbook=new XSSFWorkbook(testData);
		 
		 //IDentifying the Sheet in the WorkBook
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		
			//going to all the active Rows
	     	Row sheetRow=sheet.getRow(01);
	     	
//IDENTIFYING THE EMPLOYEE LIST ELEMENT
	     	
	     	Cell expected_EmployeeListPageText=sheetRow.getCell(11);
	     	String expectedEmployeeListName=expected_EmployeeListPageText.getStringCellValue();
	     	System.out.println("The expected Employee List Name is:- "+expectedEmployeeListName);
	     	
	     	///html/body/div[1]/div[3]/div[1]/div[1]/h1
	     
	       By employeeListTextL =By.xpath(pr.getProperty("employeeListTextL"));
	      WebElement employeeListElement=driver.findElement(employeeListTextL);
	      Thread.sleep(2000);
	      String actualEmployeeListName=employeeListElement.getText();
	      System.out.println("The Actual employeeList is:-"+actualEmployeeListName);
	      Cell actual_EmployeeListPageText=sheetRow.createCell(12);
	       actual_EmployeeListPageText.setCellValue(actualEmployeeListName);
	       
	       if(actualEmployeeListName.equals(expectedEmployeeListName))
	       {
	    	   String employeeListTestResult="Both Names Are Matching-PASS";
	    	   log.info(employeeListTestResult);
	    	   System.out.println(employeeListTestResult);
	    	   Cell eLTestResult=sheetRow.createCell(13);
	    	   eLTestResult.setCellValue(employeeListTestResult);
	    	   
	    	   
	    	   
	       }
	       else
	       {
	    	   String employeeListTestResult="Both Names Are Not Matching-FAIL";
	    	   log.error(employeeListTestResult);
	    	   System.out.println(employeeListTestResult);
	    	   Cell eLTestResult=sheetRow.createCell(13);
	    	   eLTestResult.setCellValue(employeeListTestResult);
	    	   
	       }
	    	   
	       
	       
	       
	   
	       FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\EmployeeListTestResults.xlsx");
		  workbook.write(testResults);
   }
	
	
	
}
