package com.OHRMApplication;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
		 //Getting The Data from The ExcelWorkbook
		 //Identifying The File
		 String excelPath="./src/com/OHRMExcelWorkBooks/LogInTest.xlsx";
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

		//GETTING THE USERNAME AND PASSWORD FROM EXCEL WORKBOOK
						
						//USERNAME
			            Cell userName=sheetRow.getCell(06);
			            String userNameData=userName.getStringCellValue();
						System.out.println("The UserName is :- "+userNameData);
						
						//PASSWORD
						Cell passWord=sheetRow.getCell(07);
						String passWordData=passWord.getStringCellValue();
						System.out.println("The PassWord is :- "+passWordData);
						
		//VALIDATING FUNCTIONALITY OF USERNAME,PASSWORD,LOGIN
				try {
						//PROPERTY OF USERNAM ELEMENT
						By usernameElement=By.id("txtUsername");
						WebElement userNameL=driver.findElement(usernameElement);
						userNameL.sendKeys(userNameData);
						
						//PROPERTY OF PASSWORD ELEMENT
						By passwordElement=By.id("txtPassword");
						WebElement passwordL=driver.findElement(passwordElement);
						 passwordL.sendKeys(passWordData); 
		                				 
						//PROPERTY OF LOGIN BUTTON ELEMENT
						 Thread.sleep(2000);
						 By loginButtonElemnt=By.id("btnLogin");
						 WebElement loginButtonL=driver.findElement(loginButtonElemnt);
						 loginButtonL.click();
			
		//VALIDATING ORANGE HRM HOMEPAGE
						 
							
						String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
					    System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
					           
						String actualOHRMHomePage_URL=driver.getCurrentUrl();
						System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
						
				
						Cell expected_HomePageText=sheetRow.getCell(8);
						String expectedHomePageText=expected_HomePageText.getStringCellValue();
						System.out.println("The Expected HomePage Title:- "+expectedHomePageText);
						
				}
				catch(Exception errorcode)
				{
					System.out.println("Failed To Login-FAIL");	
					Cell failedHomepageTitleResult=sheetRow.createCell(10);
					failedHomepageTitleResult.setCellValue("Failed To Login-FAIL");
					
					System.out.println(errorcode);
					
				}
		
		
		}
		
		FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/LogInTestResults2.xlsx");
		workbook.write(testResults);
		
		
	}
}
