package com.LoginFunctionality;

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

public class LogOutValidation extends LoginFunctionality
{
	@Test(priority=3)
	public void logOutValidationOfOHRM() throws IOException 
	{
		
//PROPERTIES FILE	
		FileInputStream prFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(prFile);

		
		//EXCEL FILE		
		String loginDataPath="C:\\\\Users\\\\bijja\\\\Desktop\\\\OrangeHRMApplication\\\\OHRMApplicationExcelOperations\\\\src\\\\com\\\\ExcelWorkBooks\\\\LogInTestResults.xlsx";
		FileInputStream loginData=new FileInputStream(loginDataPath);

 //Identifying the Workbook
		XSSFWorkbook workbook=new XSSFWorkbook(loginData);
 
 //IDentifying the Sheet in the WorkBook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
 

 //Identifying the Active rows in the Sheet
		int rowsCount=sheet.getLastRowNum();
		System.out.println("The Active Rows In The Sheet Are:-"+rowsCount);
	
		for(int row=1;row<=rowsCount;row++)
		{
		
		//GETTING THE ACTIVE ROWS FROM SHEET
		Row sheetrow=sheet.getRow(row);
		
//VALIDATING LOGOUT FUNCTIONALITY

		
		
		
		
		//identifying the login panel elements
		By loginpanelElement=By.id(pr.getProperty("LoginPanelElement"));
		WebElement loginPanelL=driver.findElement(loginpanelElement);
		
		
		//getting expected test data from excel
		Cell expected_LoginText=sheetrow.getCell(11);
		String expectedLoginText=expected_LoginText.getStringCellValue();
		System.out.println("The expected text of Login Text is -"+expectedLoginText);
		
		//finding the actual test data to match with expected test data
		
		String actualLoginText=loginPanelL.getText();
		System.out.println("The actual text of login text is -"+actualLoginText);
		Cell actual_LoginText=sheetrow.createCell(12);
		actual_LoginText.setCellValue(actualLoginText);
		
		if(actualLoginText.equals(expectedLoginText))
		{
			
			log.info("Landed At Login Page");
			Cell TestTextResult=sheetrow.createCell(13);
			TestTextResult.setCellValue("Landed At Login Page");
		}
		else
		{
			log.info("Failed To Land At Login Page-FAIL");
			Cell TestTextResult=sheetrow.createCell(13);
			TestTextResult.setCellValue("Failed to Land At Login Page");
			
		}
		
	}
	
		String testResultsPath="C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\LogInTestResults.xlsx";
		FileOutputStream testResults=new FileOutputStream(testResultsPath);
	workbook.write(testResults);
		
	
	}
}