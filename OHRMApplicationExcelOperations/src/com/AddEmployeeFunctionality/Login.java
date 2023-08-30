package com.AddEmployeeFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sound.midi.MidiDevice.Info;

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

public class Login extends BaseTest
{

	Logger log=Logger.getLogger(Login.class);
	@Test(priority=1)
   public void LoginPageValidation() throws IOException
   {
	   
//LOG4J FILE
	  FileInputStream logFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\Log4jFile\\OrangeHRMApplication_POM_LogFiles.properties");
	   PropertyConfigurator.configure(logFile);
	   
	   
//PROPERTYFILE	   
	   FileInputStream proFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
	   Properties pr=new Properties();
	   pr.load(proFile);
	   
//EXCELFILE
	   FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestData.xlsx");
	   
	   XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
	   
	   XSSFSheet sheet=workbook.getSheet("Sheet1");
	   
//GETTING ACTIVE NO. OF ROWS IN THE SHEET
	   
	   int rowCount=sheet.getLastRowNum();
	   System.out.println("The no. of active rows in the sheet is-"+rowCount);
	   log.info("The no. of active rows in the sheet is-"+rowCount);
	   
	   
		   //Getting the rows from sheet
		   
		   Row rowSheet=sheet.getRow(01);
		   
		 //identifying the login panel elements
			By loginpanelElement=By.id(pr.getProperty("LoginPanelElement"));
			WebElement loginPanelL=driver.findElement(loginpanelElement);
			
			
		//getting expected info from excel
			
			Cell expected_LoginText=rowSheet.getCell(0);
			String expectedLoginText=expected_LoginText.getStringCellValue();
			log.info("The Expected Text of Login Page is-"+expectedLoginText);
			
		//Finding actual info to match with expected info
			
			String actualLoginText=loginPanelL.getText();
			log.info("The actual Text of login Page is-"+actualLoginText);
			Cell actual_LoginText=rowSheet.createCell(1);
			actual_LoginText.setCellValue(actualLoginText);
			
		//validating actual info against expected info	
			
			if(actualLoginText.equals(expectedLoginText))
			{
				String text_Result="Text is matching-PASS";
				log.info(text_Result);
				Cell textResult=rowSheet.createCell(2);
				textResult.setCellValue(text_Result);
				
			}
			else
			{
				String text_Result="Text is not matching-FAIL";
				log.info(text_Result);
				Cell textResult=rowSheet.createCell(2);
				textResult.setCellValue(text_Result);
				
			}
			
// IDENTIFYING LOGIN PAGE TEXT			
			Cell actual_LoginPageTitle=rowSheet.getCell(4);
			String actualLoginPageTitle=actual_LoginPageTitle.getStringCellValue();
			log.info("The actual title of login page is-"+actualLoginPageTitle);
			
			String expectedLoginPageTitle=driver.getTitle();
			log.info("The expected title of login page is-"+expectedLoginPageTitle);
			Cell expected_LoginPageTitle=rowSheet.createCell(3);
			expected_LoginPageTitle.setCellValue(expectedLoginPageTitle);	
			if(actualLoginPageTitle.equals(expectedLoginPageTitle))
			{
				String text_Result="Text Is Matching-PASS";
				log.info(text_Result);
				Cell TestTextResult=rowSheet.createCell(5);
				TestTextResult.setCellValue(text_Result);
			}
			else
			{
				String text_Result="Text Is Not Matching";
				log.info(text_Result);
				Cell TestTextResult=rowSheet.createCell(5);
				TestTextResult.setCellValue(text_Result);
				
			}
			
//LOGGING INTO ORANGEHRM PAGE
			
			Cell user_name=rowSheet.getCell(6);
			String username=user_name.getStringCellValue();
			System.out.println("The Username is "+username);
			
			Cell pass_word=rowSheet.getCell(7);
			String password=pass_word.getStringCellValue();
			System.out.println("The Password is -"+password);
			
			
			By userNameElement=By.id(pr.getProperty("UserNameElement"));
			WebElement userNameL=driver.findElement(userNameElement);
			userNameL.sendKeys(username);
			
			
			By passWordElement=By.id(pr.getProperty("PasswordElement"));
			WebElement passWordL=driver.findElement(passWordElement);
			passWordL.sendKeys(password);
			
			By loginBTNElement=By.id(pr.getProperty("LoginBTNElement"));
			WebElement LoginBTNL=driver.findElement(loginBTNElement);
			LoginBTNL.click();
			
			
			Cell expected_HomePage=rowSheet.getCell(8);
			String expectedHomePageText=expected_HomePage.getStringCellValue();
			log.info("The expected text of homepage is -"+expectedHomePageText);
			
			By welcomeAdminElement=By.id(pr.getProperty("WelcomeAdminElement"));
			WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
			String actualHomePageText=welcomeAdminL.getText();
			log.info("The Actual text of homepage is-"+actualHomePageText);
			
			Cell actual_HomePageText=rowSheet.createCell(9);
			actual_HomePageText.setCellValue(actualHomePageText);
			
			if(actualHomePageText.contains(expectedHomePageText))
			{
					
				String text_Result="Text Is Matching-PASS";
				log.info(text_Result);
				Cell TestTextResult=rowSheet.createCell(10);
				TestTextResult.setCellValue(text_Result);
					
			}
			else
			{
				String text_Result="Text Is Not Matching";
				log.info(text_Result);
				Cell TestTextResult=rowSheet.createCell(10);
				TestTextResult.setCellValue(text_Result);
				
			}
		   
		   
			
			
		FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");	
		workbook.write(testResults);	
	   }

	
}
