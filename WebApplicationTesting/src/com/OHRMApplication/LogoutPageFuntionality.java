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

public class LogoutPageFuntionality extends ValidatingHomePageOfOHRM {
	@Test(priority=4)
	public void logOut() throws IOException
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
		
		
		try 
		{

				
			//PROPERTY OF LOGOUT ELEMENT
				By logOutElement=By.linkText("Logout");
				WebElement logOutL=driver.findElement(logOutElement);
				logOutL.click();
				

	
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
