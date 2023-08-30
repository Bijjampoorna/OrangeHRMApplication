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

public class LoginFunctionality extends VallidatingLoginPage {
	
	 @Test(priority=2)
	public void loginFunctionalityOfOHRM() throws IOException
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

//GETTING THE USERNAME AND PASSWORD FROM EXCEL WORKBOOK
						
						//USERNAME
			            Cell userName=sheetRow.getCell(06);
			            String userNameData=userName.getStringCellValue();
						//System.out.println("The UserName is :- "+userNameData);
						log.info("The UserName is :- "+userNameData);
						
						//PASSWORD
						Cell passWord=sheetRow.getCell(07);
						String passWordData=passWord.getStringCellValue();
						//System.out.println("The PassWord is :- "+passWordData);
						log.info("The PassWord is :- "+passWordData);
						
//VALIDATING FUNCTIONALITY OF USERNAME,PASSWORD,LOGIN
//PROPERTY OF USERNAME ELEMENT
						By usernameElement=By.id(pr.getProperty("usernameElement"));
						WebElement userNameL=driver.findElement(usernameElement);
						userNameL.sendKeys(userNameData);
						
//PROPERTY OF PASSWORD ELEMENT
						By passwordElement=By.id(pr.getProperty("passwordElement"));
						WebElement passwordL=driver.findElement(passwordElement);
						 passwordL.sendKeys(passWordData); 
		                				 
//PROPERTY OF LOGIN BUTTON ELEMENT
						
						 By loginButtonElemnt=By.id(pr.getProperty("loginButtonElemnt"));
						 WebElement loginButtonL=driver.findElement(loginButtonElemnt);
						 loginButtonL.click();
			
			
		
		FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\EmployeeListTestResults.xlsx");
		workbook.write(testResults);
		
		
	}
}
