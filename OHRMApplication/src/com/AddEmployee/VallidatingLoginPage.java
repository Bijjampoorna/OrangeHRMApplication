package com.AddEmployee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.LoginwithMultipleData.BaseTest;

public class VallidatingLoginPage extends  com.AddEmployee.BaseTest {
	public static Logger log=Logger.getLogger(VallidatingLoginPage.class);
	
	 @Test(priority=1)
	public void ValidatingLoginPage() throws IOException
	{
		 PropertyConfigurator.configure("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\OrangeHRMApplication_DDT_LogFiles.properties");
		 
//PROPERTY FILE		 
		FileInputStream Profile=new FileInputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\PropertyFile\\OrangeHRM_DDT_PropertyFile.properties");
		 Properties pr=new Properties();
		 pr.load(Profile);
		 
		 
//Getting The Data from The ExcelWorkbook
//Identifying The File
		 String excelPath="C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestData1.xlsx";
		 FileInputStream testData=new FileInputStream(excelPath);
		
//Identifying the Workbook
		 XSSFWorkbook workbook=new XSSFWorkbook(testData);
		 
//IDentifying the Sheet in the WorkBook
		 XSSFSheet sheet=workbook.getSheet("Sheet1");

		

		 //Identifying the Active rows in the Sheet
			int rowsCount=sheet.getLastRowNum();
			System.out.println("The Active Rows In The Sheet Are:-"+rowsCount);
			
		
		
					Row sheetRow=sheet.getRow(01);

			
//VALIDATING LOGIN PANEL TITLE
				
				//Finding the Login Panel property
				//<div id="logInPanelHeading">
				
				By loginPanelElement=By.id(pr.getProperty("loginPanelElement"));
				WebElement loginPanelL=driver.findElement(loginPanelElement);
				
				Cell expected_LoginText= sheetRow.getCell(0);
				String expectedLoginText=expected_LoginText.getStringCellValue();
				//System.out.println("The Expected Name Of Login Test is :- "+expectedLoginText);
				log.info("The Expected Name Of Login Test is :- "+expectedLoginText);
				
				String actualLoginText=loginPanelL.getText();
				Cell actual_LoginText=sheetRow.createCell(1);
				actual_LoginText.setCellValue(actualLoginText);
				log.info("The Actual Name Of Login Test is :- "+actualLoginText);
				if(actualLoginText.equals(expectedLoginText))
				{
					
					//System.out.println("Landed at Login Page");
					log.info("Landed at Login Page");
					Cell textTestResult=sheetRow.createCell(2);
					 textTestResult.setCellValue("Landed At Login Page-PASS");
					
				}
				else
				{
					System.out.println("Failed to Land At Login Page-FAIL");
					log.error("Failed to Land At Login Page-FAIL");
					Cell TextTestResult=sheetRow.createCell(2);
					TextTestResult.setCellValue("Failed to Land At Login Page-FAIL");
			    }
				
//VALIDATING LOGIN PAGE TITLE
				
				String expectedLoginPageTitle=driver.getTitle();
				Cell expected_LoginPageTitle=sheetRow.createCell(3);
				expected_LoginPageTitle.setCellValue(expectedLoginPageTitle);
				//System.out.println("The Expected loginPage Title is:- "+expectedLoginPageTitle);
				log.info("The Expected loginPage Title is:- "+expectedLoginPageTitle);
				
				Cell actual_LoginPageTitle=sheetRow.getCell(4);
				String actualLoginPageTitle=actual_LoginPageTitle.getStringCellValue();
				//System.out.println("The Actual Login Page Title:- "+actualLoginPageTitle);
				log.info("The Actual Login Page Title:- "+actualLoginPageTitle);
				
				if(actualLoginPageTitle.equalsIgnoreCase(expectedLoginPageTitle))
				{
					//System.out.println("Titles Are Matching-PASS");
					log.info("Titles Are Matching-PASS");
				    Cell titleTextResult=sheetRow.createCell(5);
				    titleTextResult.setCellValue("Titles Are Matching-PASS");
				}
				else
				{
					//System.out.println("Titles Are Not Matching-FAIL");
					log.error("Titles Are Not Matching-FAIL");
					Cell titleTextResult=sheetRow.createCell(5);
					titleTextResult.setCellValue("Titles Are Not Matching-FAIL");
				}
				
		FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx");
		workbook.write(testResults);
	}
	

}
