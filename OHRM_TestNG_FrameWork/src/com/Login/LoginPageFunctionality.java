package com.Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPageFunctionality extends LoginPageValidation
{
	@Test(priority=2)
	public void loginFunctionality() throws IOException
	{
		
		//PROPERTY FILE
		FileInputStream propertyFilePath=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(propertyFilePath);
		
		//EXCEL FILE
		FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\LogInTestDataResults.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		//System.out.println("The number of active rows in the sheet is-"+rowCount);
		log.info("The number of active rows in the sheet is-"+rowCount);
	
		for(int row=1;row<=rowCount;row++)
		{
			Row sheetRow=sheet.getRow(row);
			//username
			Cell userNameData=sheetRow.getCell(06);
			String userName=userNameData.getStringCellValue();
			log.info("The UserName is-"+userName);
			
			//password
			Cell passwordData=sheetRow.getCell(07);
			String password=passwordData.getStringCellValue();
			log.info("The password is-"+password);
			
			try
			{
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
				log.info(testResult);
				Cell textTestResult=sheetRow.createCell(10);
				textTestResult.setCellValue(testResult);
				
	
			}
			
			welcomeAdminL.click();
			Thread.sleep(1500);

			By logOutElement=By.linkText(pr.getProperty("logOutElement"));
			WebElement logOutL=driver.findElement(logOutElement);
			logOutL.click();
			}
			catch (Exception error)
			{
				String testResult="Text is not Matching";
				log.info("Failed to land At Home Page");
				Cell textTestResult=sheetRow.createCell(10);
				textTestResult.setCellValue(testResult);
				
				System.out.println("Reason-"+error);
				File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot,new File("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\ScreenShots\\"+row+"-"+userName+"-"+password+".png"));
			}

		}

	FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\LogInTestDataResults.xlsx");
	workbook.write(testResults);
	
	}

}