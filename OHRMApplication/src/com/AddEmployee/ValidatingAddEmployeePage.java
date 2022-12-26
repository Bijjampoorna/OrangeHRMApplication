package com.AddEmployee;

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

public class ValidatingAddEmployeePage extends ValidatingHomePageOfOHRM {
	
	@Test(priority=4)
	public void addEmployeePageText() throws IOException
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


					//going to all the active Rows
							Row sheetRow=sheet.getRow(01);
//VALIDATING ADD EMPLOYEE PAGE TEXT		
					
				Cell expected_AddEmployeePageText=sheetRow.getCell(11);
				String expectedAddEmployeePageText=expected_AddEmployeePageText.getStringCellValue();
                //System.out.println("The Expected Text of Add Employee Page Is :- "+expectedAddEmployeePageText);
                log.info("The Expected Text of Add Employee Page Is :- "+expectedAddEmployeePageText);
                
                By addEmployeePageL=By.xpath(pr.getProperty("addEmployeePageL"));
                WebElement addEmployeePageElement=driver.findElement(addEmployeePageL);
                String actualAddEmployeePageText=addEmployeePageElement.getText();
                
                Cell actual_AddEmployeePageText=sheetRow.createCell(12);
                actual_AddEmployeePageText.setCellValue(actualAddEmployeePageText);
                //System.out.println("The Actual Text of Add Employee Page Is:- "+actual_AddEmployeePageText);
                log.info("The Actual Text of Add Employee Page Is:- "+actual_AddEmployeePageText);
                
                
			if(actualAddEmployeePageText.equals(expectedAddEmployeePageText))
			{
				Cell addEmployeePageTestResult=sheetRow.createCell(13);
				String testResult="At Add employee Page-PASS";
				addEmployeePageTestResult.setCellValue(testResult);
				//System.out.println(testResult);
				log.info(testResult);
			}
			else
			{
               Cell addEmployeePageTestResult=sheetRow.createCell(13);
	           String testResult="Not At Add employee Page-FAIL";
	           addEmployeePageTestResult.setCellValue(testResult);
	           //System.out.println(testResult);
	           log.error(testResult);
			}
				
                FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx");
        		workbook.write(testResults);	
	
	}
	

}
