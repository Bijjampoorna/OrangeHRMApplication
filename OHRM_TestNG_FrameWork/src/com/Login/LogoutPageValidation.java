package com.Login;
//com.Login.LogoutPageValidation
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

public class LogoutPageValidation extends LoginPageFunctionality
{
	@Test(priority=3)
	public void logoutValidation() throws IOException
	{
		
		//PROPERTY FILE
				FileInputStream propertyFilePath=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\OHRMPropertyFile.properties");
				Properties pr=new Properties();
				pr.load(propertyFilePath);
				
				//EXCEL FILE
				FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\LogInTestDataResults.xlsx");
				
				XSSFWorkbook workbook=new XSSFWorkbook(excelFile);		
				XSSFSheet sheet=workbook.getSheet("Sheet1");
				
				Row sheetRow=sheet.getRow(1);
				
				//GETTING DATA FROM EXCEL
				Cell expected_LoginPageText=sheetRow.getCell(11);
				String expectedLoginPageText=expected_LoginPageText.getStringCellValue();
				System.out.println("The expected login page text is-"+expectedLoginPageText);
			
				By loginPageTextElement=By.id(pr.getProperty("LoginPanelElement"));
				WebElement loginPageTextL=driver.findElement(loginPageTextElement);
				
				String actualLoginPageText=loginPageTextL.getText();
				System.out.println("The actual login page text is:-"+actualLoginPageText);
				 
				Cell actual_LoginPageText=sheetRow.createCell(12);
				actual_LoginPageText.setCellValue(actualLoginPageText);
				
				if(actualLoginPageText.equals(expectedLoginPageText))
				{
					String testResult="Text is Matching";
					log.info(testResult);
					Cell textTestResult=sheetRow.createCell(13);
					textTestResult.setCellValue(testResult);
				}
				else
				{
					String testResult="Text is not Matching";
					log.info(testResult);
					Cell textTestResult=sheetRow.createCell(13);
					textTestResult.setCellValue(testResult);
				}
				
			FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\LogInTestDataResults.xlsx");
			workbook.write(testResults);
		
	}
	
}
