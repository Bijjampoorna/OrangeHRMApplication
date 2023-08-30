package com.LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginFunctionality extends LoginPageValidation
{

	@Test(priority=2)
	public void LoginFunctionalityOfOrangeHRM() throws IOException
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
				
//VALIDATING LOGIN FUNCTIONALITY
				
				
				
				Cell user_name=sheetrow.getCell(6);
				String username=user_name.getStringCellValue();
				System.out.println("The Username is "+username);
				
				Cell pass_word=sheetrow.getCell(7);
				String password=pass_word.getStringCellValue();
				System.out.println("The Password is -"+password);
				
				try
				{
					By userNameElement=By.id(pr.getProperty("UserNameElement"));
					WebElement userNameL=driver.findElement(userNameElement);
					userNameL.sendKeys(username);
					
					
					By passWordElement=By.id(pr.getProperty("PasswordElement"));
					WebElement passWordL=driver.findElement(passWordElement);
					passWordL.sendKeys(password);
					
					By loginBTNElement=By.id(pr.getProperty("LoginBTNElement"));
					WebElement LoginBTNL=driver.findElement(loginBTNElement);
					LoginBTNL.click();
					
//IDENTIFYING HOMEPAGE 
					
					Cell expected_HomePage=sheetrow.getCell(8);
					String expectedHomePage=expected_HomePage.getStringCellValue();
					System.out.println("The expected text of homepage is -"+expectedHomePage);
					
					By welcomeAdminElement=By.id(pr.getProperty("WelcomeAdminElement"));
					WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
					String actualHomePageText=welcomeAdminL.getText();
					System.out.println("The Actual text of homepage is-"+actualHomePageText);
					
					Cell actual_HomePageText=sheetrow.createCell(9);
					actual_HomePageText.setCellValue(actualHomePageText);
					
					if(actualHomePageText.contains(expectedHomePage))
					{
						log.info("Landed At HomePage-PASS");
						String testTextResult="Text is Matching";
						Cell test_TextResult=sheetrow.createCell(10);
						test_TextResult.setCellValue(testTextResult);
						
						welcomeAdminL.click();
						Thread.sleep(2000);
						
						By logOutElement=By.linkText(pr.getProperty("logOutElement"));
						WebElement logOutL=driver.findElement(logOutElement);
						logOutL.click();
						
					}

				}
				catch (Exception errorcode) 
				{
					log.info("Failed To Landed At HomePage-FAIL");
					String testTextResult="Text is Not Matching";
					Cell test_TextResult=sheetrow.createCell(10);
					test_TextResult.setCellValue(testTextResult);
					
					System.out.println(errorcode);
					
				}
				
			}
			
			String testResultsPath="C:\\\\Users\\\\bijja\\\\Desktop\\\\OrangeHRMApplication\\\\OHRMApplicationExcelOperations\\\\src\\\\com\\\\ExcelWorkBooks\\\\LogInTestResults.xlsx";
			FileOutputStream testResults=new FileOutputStream(testResultsPath);
			workbook.write(testResults);
  }

	
}
