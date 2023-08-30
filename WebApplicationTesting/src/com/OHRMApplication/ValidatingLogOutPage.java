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

public class ValidatingLogOutPage extends LoginPage
{
	@Test(priority=5)
	public void logoutPageValidation() throws IOException
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
				


//VALIDATING logOut PANEL TITLE
				
				//Finding the Login Panel property
				//<div id="logInPanelHeading">
				
				By logOutPanelElement=By.id("logInPanelHeading");
				WebElement logOutPanelL=driver.findElement(logOutPanelElement);
				
				Cell expected_logOutText= sheetRow.getCell(11);
				String expectedlogOutText=expected_logOutText.getStringCellValue();
				System.out.println("The Expected Name Of Login Test is :- "+expectedlogOutText);
				
				
				String actuallogOutText=logOutPanelL.getText();
				Cell actual_LoginText=sheetRow.createCell(12);
				actual_LoginText.setCellValue(actuallogOutText);
				
				if(actuallogOutText.equals(expectedlogOutText))
				{
					
					System.out.println("Landed at Login Page");
					Cell textTestResult=sheetRow.createCell(13);
					 textTestResult.setCellValue("Landed At Login Page-PASS");
					
				}
				else
				{
					System.out.println("Failed to Land At Login Page-FAIL");
					Cell TextTestResult=sheetRow.createCell(13);
					TextTestResult.setCellValue("Failed to Land At Login Page-FAIL");
			    }
		
	}
		FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/LogInTestResults2.xlsx");
		workbook.write(testResults);	
	
	}
	
	
}
