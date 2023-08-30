package com.AddEmployee;

import java.io.FileInputStream;
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

public class HomepageValidation extends LoginPageValidation
{

	@Test(priority=2)
	public void homeValidation() throws IOException
	{

		//PROPERTY FILE
		FileInputStream propertyFilePath=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(propertyFilePath);
		
		//EXCEL FILE
		FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\AddEmployeeTestDataResults.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		//System.out.println("The number of active rows in the sheet is-"+rowCount);
		log.info("The number of active rows in the sheet is-"+rowCount);
		
		Row sheetRow=sheet.getRow(01);
		//username
		Cell userNameData=sheetRow.getCell(06);
		String userName=userNameData.getStringCellValue();
		log.info("The UserName is-"+userName);
		
		//password
		Cell passwordData=sheetRow.getCell(07);
		String password=passwordData.getStringCellValue();
		log.info("The password is-"+password);
		
		By userNameElement=By.id(pr.getProperty("UserNameElement"));
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys(userName);
		
		By passwordElement=By.id(pr.getProperty("PasswordElement"));
		WebElement passwordL=driver.findElement(passwordElement);
		passwordL.sendKeys(password);
		
		By loginBtnElement=By.id(pr.getProperty("LoginBTNElement"));
		WebElement loginBtnL=driver.findElement(loginBtnElement);
		loginBtnL.click();
		
		Cell expected_HomePageText=sheetRow.getCell(8);
		String expectedHomePageText=expected_HomePageText.getStringCellValue();
		System.out.println("The expected Home Page Text is-"+expectedHomePageText);
		
		
		By welcomeAdminElement=By.id(pr.getProperty("WelcomeAdminElement"));
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		String actualHomePageText=welcomeAdminL.getText();
		System.out.println("The actual HomePage Text is-"+actualHomePageText);
		
		Cell actual_HomePageText=sheetRow.createCell(9);
		actual_HomePageText.setCellValue(actualHomePageText);
		
		
		if(actualHomePageText.contains(expectedHomePageText))
		{
			String testResult="Text is Matching";
			log.info("Landed at HomePage");
			Cell textTestResult=sheetRow.createCell(10);
			textTestResult.setCellValue(testResult);
			
		}
		else
		{
			String testResult="Text is not Matching";
			log.info("Fail to Land at HomePage");
			Cell textTestResult=sheetRow.createCell(10);
			textTestResult.setCellValue(testResult);
		}
		
	
		FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\AddEmployeeTestDataResults.xlsx");
		workbook.write(testResults);
	}
	
	
}