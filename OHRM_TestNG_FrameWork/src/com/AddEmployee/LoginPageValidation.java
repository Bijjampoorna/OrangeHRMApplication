package com.AddEmployee;

import java.io.FileInputStream;
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


import com.BaseTest.BaseTest;

public class LoginPageValidation extends BaseTest
{
	Logger log=Logger.getLogger(LoginPageValidation.class);
	@Test(priority=1)
	public void loginValidation() throws IOException
	{
		
		//LOGFILE
		String filePath="C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\Log4jFile\\OrangeHRMApplication_POM_LogFiles.properties";
		PropertyConfigurator.configure(filePath);

		//PROPERTY FILE
		FileInputStream propertyFilePath=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(propertyFilePath);
				
		//EXCEL FILE
		FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\AddEmployeeTestData.xlsx");
				
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		//System.out.println("The number of active rows in the sheet is-"+rowCount);
		log.info("The number of active rows in the sheet is-"+rowCount);
		
			Row sheetRow=sheet.getRow(1);
			
			//GETTING DATA FROM EXCEL
			Cell expected_LoginPageText=sheetRow.getCell(0);
			String expectedLoginPageText=expected_LoginPageText.getStringCellValue();
			System.out.println("The expected login page text is-"+expectedLoginPageText);
		
			By loginPageTextElement=By.id(pr.getProperty("LoginPanelElement"));
			WebElement loginPageTextL=driver.findElement(loginPageTextElement);
			
			String actualLoginPageText=loginPageTextL.getText();
			System.out.println("The actual login page text is:-"+actualLoginPageText);
			 
			Cell actual_LoginPageText=sheetRow.createCell(01);
			actual_LoginPageText.setCellValue(actualLoginPageText);
			
			if(actualLoginPageText.equals(expectedLoginPageText))
			{
				String testResult="Text is Matching";
				log.info(testResult);
				Cell textTestResult=sheetRow.createCell(02);
				textTestResult.setCellValue(testResult);
			}
			else
			{
				String testResult="Text is not Matching";
				log.info(testResult);
				Cell textTestResult=sheetRow.createCell(02);
				textTestResult.setCellValue(testResult);
			}
			
			Cell expected_LoginPageTitle=sheetRow.getCell(04);
			String expectedLoginPageTitle=expected_LoginPageTitle.getStringCellValue();
			System.out.println("The expected title of login page is-"+expectedLoginPageTitle);
			
			String actualLoginPageTitle=driver.getTitle();
			System.out.println("The actual title of login page is-"+actualLoginPageTitle);
			Cell actual_LoginPageTitle=sheetRow.createCell(03);
			actual_LoginPageTitle.setCellValue(actualLoginPageTitle);
			
			if(actualLoginPageTitle.equals(expectedLoginPageTitle))
			{
				String testResult="Text is Matching";
				log.info(testResult);
				Cell textTestResult=sheetRow.createCell(05);
				textTestResult.setCellValue(testResult);
			}
			else
			{
				String testResult="Text is not Matching";
				log.info(testResult);
				Cell textTestResult=sheetRow.createCell(05);
				textTestResult.setCellValue(testResult);
			}
			
			FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\AddEmployeeTestDataResults.xlsx");
			workbook.write(testResults);
		
	}
}
