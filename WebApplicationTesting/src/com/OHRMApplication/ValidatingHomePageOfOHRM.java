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

public class ValidatingHomePageOfOHRM extends LoginFunctionality {
	
	@Test(priority=3)
	public void OHRM_Homepage() throws IOException
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
		
				try {
					
//VALIDATING ORANGE HRM HOMEPAGE
					 
						
					String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
				    System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
				           
					String actualOHRMHomePage_URL=driver.getCurrentUrl();
					System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
					
//PROPERTY OF WELCOME ADMIN ELEMENT
					
					Cell expected_HomePageText=sheetRow.getCell(8);
					String expectedHomePageText=expected_HomePageText.getStringCellValue();
					System.out.println("The Expected HomePage Title:- "+expectedHomePageText);
					
					By welcomeAdminElement=By.id("welcome");
					WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
					String actualHomePageText=welcomeAdminL.getText();
					Cell actual_HomepageText=sheetRow.createCell(9);
					actual_HomepageText.setCellValue(actualHomePageText);
					System.out.println("The Actual HomePage Title:- "+actualHomePageText);
					
				
						System.out.println("HomePage Titles Are Matching-PASS");
						Cell homepageTitleResult=sheetRow.createCell(10);
						homepageTitleResult.setCellValue("HomePage Titles Are Matching-PASS");
						
						welcomeAdminL.click();
						Thread.sleep(2000);
					
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
