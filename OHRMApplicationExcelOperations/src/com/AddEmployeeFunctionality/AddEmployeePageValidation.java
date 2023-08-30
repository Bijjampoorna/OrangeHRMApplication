package com.AddEmployeeFunctionality;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployeePageValidation extends Login 
{

	@Test(priority=2)
	public void validatingAddEmployeePage() throws InterruptedException, IOException
	{
		
		
		
		
		//PROPERTYFILE	   
		   FileInputStream proFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
		   Properties pr=new Properties();
		   pr.load(proFile);
		   
	//EXCELFILE
		   FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");
		   
		   XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");
		   
	//GETTING ACTIVE NO. OF ROWS IN THE SHEET
		   
		   int rowCount=sheet.getLastRowNum();
		   System.out.println("The no. of active rows in the sheet is-"+rowCount);
		   log.info("The no. of active rows in the sheet is-"+rowCount);
		   
		  
			   
	//GETTING THE ROWS FROM THE SHEET
		   Row rowSheet=sheet.getRow(01);
			   
			   
	//FINDING THE ELEMENT TO GO TO ADD EMPLOYEE PAGE
			   
			   By pIMElement=By.id(pr.getProperty("PIMElement"));
			   WebElement pIMElementL=driver.findElement(pIMElement);
			   
			   Actions act=new Actions(driver);
			   act.moveToElement(pIMElementL).build().perform();
			   
			   Thread.sleep(1500);
			   
			   By addEmployeeElement=By.id(pr.getProperty("addEmployeeElement"));
			   WebElement addEmployeeL=driver.findElement(addEmployeeElement);
			   
			   addEmployeeL.click();
			   
	//GETTING EXPECTED INFO FROM EXCEL SHEETS
			   
			   Cell expected_AddEmployeePageText=rowSheet.getCell(11);
			   String expectedAddEmployeePageText=expected_AddEmployeePageText.getStringCellValue();
			   log.info("The Expected Add Employee Page Text is-"+expectedAddEmployeePageText);
			   
	//GETTING ACTUAL INFO FROM APPLICATION
			   
			   By addEmployeeTextElement=By.linkText(pr.getProperty("addEmployeeTitle"));
			   WebElement addEmpolyeeTextL=driver.findElement(addEmployeeTextElement);
			   String actualAddemployeePageText=addEmpolyeeTextL.getText();
			   log.info("The actual text of add employee page is-"+actualAddemployeePageText);
			   
			   Cell actual_AddemployeePageText=rowSheet.createCell(12);
			   actual_AddemployeePageText.setCellValue(actualAddemployeePageText);
			
	//VALIDATING ACTUAL TEXT AGAINIST EXPECTED TEXT		   
			   
			   if(actualAddemployeePageText.equals(expectedAddEmployeePageText))
			   {
				   String textResults="Text is Matching";
				   log.info(textResults);
				   Cell testResult=rowSheet.createCell(13);
				   testResult.setCellValue(textResults);  
			   }
			   else
			   {
				   String textResults="Text is not Matching";
				   log.info(textResults);
				   Cell testResult=rowSheet.createCell(13);
				   testResult.setCellValue(textResults);
				   
			   }
	
			   FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");	
				workbook.write(testResults);
	}
	
	
	
	
	
}