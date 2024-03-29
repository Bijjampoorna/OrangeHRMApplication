package com.LoginwithMultipleData;

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

public class ValidatingLogOutPage extends LoginFunctionality
{
	@Test(priority=3)
	public void logoutPageValidation() throws IOException, InterruptedException
	{
		//PROPERTY FILE
		FileInputStream Profile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplication\\src\\com\\PropertyFile\\OrangeHRM_DDT_PropertyFile.properties");
		 Properties pr=new Properties();
		 pr.load(Profile);
		
		//Getting The Data from The ExcelWorkbook
		//Identifying The File
				 String excelPath="C:\\\\Users\\\\bijja\\\\Desktop\\\\OrangeHRMApplication\\\\OHRMApplication\\\\src\\\\com\\\\OHRMExcelWorkBooks\\\\LogInTestResults.xlsx";
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

		//VALIDATING LOGIN PANEL TITLE
						
						//Finding the Login Panel property
						//<div id="logInPanelHeading">
						
						By loginPanelElement=By.id(pr.getProperty("loginPanelElement"));
						WebElement loginPanelL=driver.findElement(loginPanelElement);
						
						Cell expected_LoginText= sheetRow.getCell(11);
						String expectedLoginText=expected_LoginText.getStringCellValue();
						//System.out.println("The Expected Name Of Login Test is :- "+expectedLoginText);
						log.info("The Expected Name Of Login Test is :- "+expectedLoginText);
						
						String actualLoginText=loginPanelL.getText();
						Cell actual_LoginText=sheetRow.createCell(12);
						actual_LoginText.setCellValue(actualLoginText);
						
						if(actualLoginText.equals(expectedLoginText))
						{
							
							//System.out.println("Landed at Login Page");
							log.info("Landed at Login Page");
							Cell textTestResult=sheetRow.createCell(13);
							textTestResult.setCellValue("Landed At Login Page-PASS");
							
						}
						else
						{
							//System.out.println("Failed to Land At Login Page-FAIL");
							log.error("Failed to Land At Login Page-FAIL");
							Cell TextTestResult=sheetRow.createCell(13);
							TextTestResult.setCellValue("Failed to Land At Login Page-FAIL");
					    }
						
					}		
						
						FileOutputStream testResults= new FileOutputStream("C:\\\\Users\\\\bijja\\\\Desktop\\\\OrangeHRMApplication\\\\OHRMApplication\\\\src\\\\com\\\\OHRMExcelWorkBooks\\\\LogInTestResults.xlsx");
						workbook.write(testResults);
	
	}
	
	
}
