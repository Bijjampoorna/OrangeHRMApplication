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

public class VallidatingLoginPage extends BaseTest {
	 @Test(priority=1)
	public void ValidatingLoginPage() throws IOException
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
				
				//going to a row ad=nd finding the number of Active cells
				int cellCount=sheetRow.getLastCellNum();
				System.out.println("The Active Cell in the rows of sheet are:- "+cellCount);
			
//VALIDATING LOGIN PANEL TITLE
				
				//Finding the Login Panel property
				//<div id="logInPanelHeading">
				
				By loginPanelElement=By.id("logInPanelHeading");
				WebElement loginPanelL=driver.findElement(loginPanelElement);
				
				Cell expected_LoginText= sheetRow.getCell(0);
				String expectedLoginText=expected_LoginText.getStringCellValue();
				System.out.println("The Expected Name Of Login Test is :- "+expectedLoginText);
				
				
				String actualLoginText=loginPanelL.getText();
				Cell actual_LoginText=sheetRow.createCell(1);
				actual_LoginText.setCellValue(actualLoginText);
				
				if(actualLoginText.equals(expectedLoginText))
				{
					
					System.out.println("Landed at Login Page");
					Cell textTestResult=sheetRow.createCell(2);
					 textTestResult.setCellValue("Landed At Login Page-PASS");
					
				}
				else
				{
					System.out.println("Failed to Land At Login Page-FAIL");
					Cell TextTestResult=sheetRow.createCell(2);
					TextTestResult.setCellValue("Failed to Land At Login Page-FAIL");
			    }
				
//VALIDATING LOGIN PAGE TITLE
				
				String expectedLoginPageTitle=driver.getTitle();
				Cell expected_LoginPageTitle=sheetRow.createCell(3);
				expected_LoginPageTitle.setCellValue(expectedLoginPageTitle);
				System.out.println("The Expected loginPage Title is:- "+expectedLoginPageTitle);
				
				Cell actual_LoginPageTitle=sheetRow.getCell(4);
				String actualLoginPageTitle=actual_LoginPageTitle.getStringCellValue();
				System.out.println("The Actual Login Page Title:- "+actualLoginPageTitle);
				
				if(actualLoginPageTitle.equalsIgnoreCase(expectedLoginPageTitle))
				{
					System.out.println("Titles Are Matching-PASS");
				    Cell titleTextResult=sheetRow.createCell(5);
				    titleTextResult.setCellValue("Titles Are Matching-PASS");
				}
				else
				{
					System.out.println("Titles Are Not Matching-FAIL");
					Cell titleTextResult=sheetRow.createCell(5);
					titleTextResult.setCellValue("Titles Are Not Matching-FAIL");
				}
				
		
		
		}
		
		FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/LogInTestResults2.xlsx");
		workbook.write(testResults);
	}
	

}
