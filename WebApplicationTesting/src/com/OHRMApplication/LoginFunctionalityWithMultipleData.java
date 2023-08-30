package com.OHRMApplication;

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

public class LoginFunctionalityWithMultipleData extends BaseTest
{
       String excelPath="./src/com/OHRMExcelWorkBooks/LogInTest1.xlsx";
     @Test
	public void oHRMLogin() throws IOException, InterruptedException
	{
		//Getting The Property File Of OHRM Application
    	FileInputStream oHRMProFile= new FileInputStream("./src/com/OHRMPropertyFile/OHRMApplicationLocators.Properties"); 
    	 Properties proFile=new Properties();
    	 proFile.load(oHRMProFile);
    	 

		 //Getting The Data from The ExcelWorkbook
		 //Identifying The File
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
				
				//going to a row ad=nd finding the number of Active cells
				int cellCount=sheetRow.getLastCellNum();
				System.out.println("The Active Cell in the rows of sheet are:- "+cellCount);
			
//VALIDATING LOGIN PANEL TITLE

				//Expected text of LoginPage Element
				Cell expectedLoginPageText=sheetRow.getCell(0);
			    String expectedTextOfLoginPage=expectedLoginPageText.getStringCellValue();
			    System.out.println("the expected text of Orange HRM LoginPage is:- "+expectedTextOfLoginPage);
			    
			    //<div id="logInPanelHeading">LOGIN Panel</div>
				WebElement TextOfLoginpage=driver.findElement(By.id("logInPanelHeading"));
				String actualTextOfLoginPage=TextOfLoginpage.getText();
				
				System.out.println("The Actual Text Of LoginPage is:- "+actualTextOfLoginPage);
				Cell actual_LogInPageText=sheetRow.createCell(1);
				
				
				if(actualTextOfLoginPage.equals(expectedTextOfLoginPage))
				{
					
					System.out.println("Landed at LoginPage Sucessfully");
					actual_LogInPageText.setCellValue(actualTextOfLoginPage);
					Cell testResult=sheetRow.createCell(2);
					
					testResult.setCellValue("Passed");	
				}
//VALIDATING LOGIN PAGE TITLE
				
				Cell actualLogInPageTitle=sheetRow.getCell(6);
				String actualLoginPageText=actualLogInPageTitle.getStringCellValue();
				System.out.println("The Actual Title OF Login Page is:- "+actualLoginPageText);
				
				String expectedLoginPageTitle=driver.getTitle();
				System.out.println("The Expected Title of Login Page id:-"+expectedLoginPageTitle);
				Cell Expected_LogInPageTitle=sheetRow.createCell(5);
				Expected_LogInPageTitle.setCellValue(expectedLoginPageTitle);;
				
				
				if(actualLoginPageText.equalsIgnoreCase(expectedLoginPageTitle))
				{
					
					System.out.println("PASS");
					Cell testResult1=sheetRow.createCell(7);
					testResult1.setCellValue("PASSED");
					
//GETTING THE USERNAME AND PASSWORD FROM EXCEL WORKBOOK
					
					//USERNAME
					Cell userName=sheetRow.getCell(3);
					String expectedUsernameTestData=userName.getStringCellValue();
					//PASSWORD
					Cell password=sheetRow.getCell(4);
					String expectedPasswordData=password.getStringCellValue();
				
//VALIDATING FUNCTIONALITY OF USERNAME,PASSWORD,LOGIN
			
					
					//finding the property of UserName element
					WebElement userNameL=driver.findElement(By.id("txtUsername"));	
					System.out.println("The Username is:- "+expectedUsernameTestData);
					userNameL.sendKeys(expectedUsernameTestData);
					
					//Finding The Property of Password Element
					
					WebElement passwordl=driver.findElement(By.id("txtPassword"));
					System.out.println("The PassWord Is:- "+expectedPasswordData);
					passwordl.sendKeys(expectedPasswordData);
					
					//Finding the Property of Login Button Element
					WebElement loginButton=driver.findElement(By.id("btnLogin"));
					loginButton.click();
					Thread.sleep(2000);
					
					
//VALIDATING WELCOME ADMIN
					
				String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			    System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
		           
				String actualOHRMHomePage_URL=driver.getCurrentUrl();
				System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
			if(actualOHRMHomePage_URL.equals(expectedOHRMHomePage_URl))
			{
				 WebElement welcomeAdminElement=driver.findElement(By.id("welcome"));
				 welcomeAdminElement.getText();
				 welcomeAdminElement.click();
				Thread.sleep(2000);
				
				//Expected Text of Admin
				Cell adminExpectedText=sheetRow.getCell(8);
				String expectedTextOfHomePage=adminExpectedText.getStringCellValue();
				System.out.println("The Expected Text Of Orange HRM HomePage is:- "+expectedTextOfHomePage);
				
				String actualTextOfHomePage=welcomeAdminElement.getText();
				System.out.println("The Actual Text Of Orange HRM Homepage is:- "+actualTextOfHomePage);
				Cell adminActualText=sheetRow.createCell(9);
				adminActualText.setCellValue(actualTextOfHomePage);
								
//VALIDATING LOGOUT
			if(actualTextOfHomePage.equals(expectedTextOfHomePage))
			{
				WebElement logOutElement=driver.findElement(By.linkText("Logout"));
				logOutElement.click();
				
					System.out.println("Landed Sucessfully at OHRM HomePage-PASS");
					Cell testResult3=sheetRow.createCell(10);
					testResult3.setCellValue("PASS");
					Thread.sleep(5000);
					
				/*	
//VALIDATING LOGIN PANEL TITLE AFTER LOGGING OUT

					//Expected text of LoginPage Element
					Cell logOutLoginPageText=sheetRow.getCell(11);
				    String logOutLoginPage=expectedLoginPageText.getStringCellValue();
				    System.out.println("the expected text of Orange HRM LoginPage is:- "+expectedTextOfLoginPage);
				    
				    //<div id="logInPanelHeading">LOGIN Panel</div>
					WebElement logOutTextOfLoginpage=driver.findElement(By.id("logInPanelHeading"));
					String logOuttactualTextOfLoginPage=TextOfLoginpage.getText();
					
					System.out.println("The Actual Text Of LoginPage is:- "+actualTextOfLoginPage);
					
					Cell actual_logOutLogInPageText=sheetRow.createCell(12);
					
					*/
			}
				
				 
			   
			
				else
		 		{
					
					//TAKING SCREENSHOTS
					File file_OHRM_Login_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(file_OHRM_Login_ScreenShot,new File(".\\OHRM_TestResults_ScreenShot\\"+"userName-"+expectedUsernameTestData+".png"));
						System.out.println("Failed To Login Into OHRM Application-FAIL");
						
						//LOGIN PANEL FAILED RESULT
						System.out.println("Failed to land At LoginPage");
						Cell loginPanelTesttestResult=sheetRow.createCell(2);
						loginPanelTesttestResult.setCellValue("Failed");
						
						//LOGIN PAGE FAILED RESULT
						System.out.println("FAILED");
						Cell loginPageTitleTestResult1=sheetRow.createCell(7);
						loginPageTitleTestResult1.setCellValue("FAILED");
						
						//WELCOME ADMIN FAILED RESULT
						Cell failedTestResult=sheetRow.createCell(10);
						failedTestResult.setCellValue("Failed To Login Into OHRM Application-FAIL");	
						
						//LOGIN PANEL FAILED RESULT AFTER LOGGING OUT
						System.out.println("Failed to land At LoginPage");
						Cell logOutloginPanelTestResult=sheetRow.createCell(2);
						logOutloginPanelTestResult.setCellValue("Failed");	
						
				}
			

	   }	
    }
			
	        }
			
			FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/LogInTestResults2.xlsx");
			workbook.write(testResults);
	}

   	
}
	
   
     

