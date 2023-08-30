package com.AddEmployeeFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogOut extends AddEmployee
{
	@Test(priority=4)
	public void logOutFunctionality() throws IOException, InterruptedException
	{
		
	//PROPERTY FILE	
		FileInputStream proFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(proFile);
		
	//EXCEL FILE
		FileInputStream excelFile=new FileInputStream("C:\\\\Users\\\\bijja\\\\Desktop\\\\OrangeHRMApplication\\\\OHRMApplicationExcelOperations\\\\src\\\\com\\\\ExcelWorkBooks\\\\AddEmployeeTestResults.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		Row rowSheet=sheet.getRow(01);
		
	//FINDING PROPERTIES OF lOGOUT FUNCTIONALITY
		
		By welcomeAdminElement=By.id(pr.getProperty("WelcomeAdminElement"));
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		Thread.sleep(2000);
		
		By logOutElement=By.linkText(pr.getProperty("logOutElement"));
		WebElement logOutL=driver.findElement(logOutElement);
		logOutL.click();
		
	//VALIDATING LOGOUT PAGE
		
		//loginpanel expected data
		Cell expected_LoginPanelText=rowSheet.getCell(29);
		String expectedLoginPanelText=expected_LoginPanelText.getStringCellValue();
		log.info("the expected text of login panel is-"+expectedLoginPanelText);
		
		
		By loginpanelElement=By.id(pr.getProperty("LoginPanelElement"));
		WebElement loginPanelL=driver.findElement(loginpanelElement);
		String actualLoginPanelText=loginPanelL.getText();
		log.info("the actual text of login panel is-"+actualLoginPanelText);
		Cell actual_LoginPanelText=rowSheet.createCell(30);
		actual_LoginPanelText.setCellValue(actualLoginPanelText);
		
		
		if(actualLoginPanelText.equals(expectedLoginPanelText))
		{
			String textResults="Text is Matching";
			log.info(textResults);
			Cell testResult=rowSheet.createCell(31);
			testResult.setCellValue(textResults);
			
		}
		else
		{
			String textResults="Text is Not Matching";
			log.info(textResults);
			Cell testResult=rowSheet.createCell(31);
			testResult.setCellValue(textResults);
		}
		
		FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");	
		workbook.write(testResults);
		
	}
	
	
}
