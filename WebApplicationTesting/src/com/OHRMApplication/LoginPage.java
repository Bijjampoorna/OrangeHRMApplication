package com.OHRMApplication;

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

public class LoginPage extends BaseTest
{
    @Test(priority=1)
	public void oHRMLogin() throws IOException, InterruptedException
	{
		//Getting The Property File Of OHRM Application
    	FileInputStream oHRMProFile= new FileInputStream("./src/com/OHRMPropertyFile/OHRMApplicationLocators.properties"); 
    	 Properties proFile=new Properties();
    	 proFile.load(oHRMProFile);
    	 

		 //Getting The Data from The ExcelWorkbook
		 //Identifying The File
    	 String excelPath="./src/com/OHRMExcelWorkBooks/LogInTest.xlsx";
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
				
				//Finding the Login Panel property
				//<div id="logInPanelHeading">
				
				By loginPanelElement=By.id("logInPanelHeading");
				WebElement loginPanelL=driver.findElement(loginPanelElement);
				
				Cell expected_LoginText= sheetRow.getCell(0);
				String expectedLoginText=expected_LoginText.getStringCellValue();
				System.out.println("The Expected Name Of Login Test is :- "+expectedLoginText);
				
				
				String actualLoginText=loginPanelL.getText();
				Cell actual_LoginText=sheetRow.createCell(1);
				actual_LoginText.setCellValue(actualLoginText);
				
				if(actualLoginText.equals(expectedLoginText))
				{
					
					System.out.println("Landed at Login Page");
					Cell textTestResult=sheetRow.createCell(2);
					 textTestResult.setCellValue("Landed At Login Page-PASS");
					
				}
				else
				{
					System.out.println("Failed to Land At Login Page-FAIL");
					Cell TextTestResult=sheetRow.createCell(2);
					TextTestResult.setCellValue("Failed to Land At Login Page-FAIL");
			    }
				
//VALIDATING LOGIN PAGE TITLE
				
				String expectedLoginPageTitle=driver.getTitle();
				Cell expected_LoginPageTitle=sheetRow.createCell(3);
				expected_LoginPageTitle.setCellValue(expectedLoginPageTitle);
				System.out.println("The Expected loginPage Title is:- "+expectedLoginPageTitle);
				
				Cell actual_LoginPageTitle=sheetRow.getCell(4);
				String actualLoginPageTitle=actual_LoginPageTitle.getStringCellValue();
				System.out.println("The Actual Login Page Title:- "+actualLoginPageTitle);
				
				if(actualLoginPageTitle.equalsIgnoreCase(expectedLoginPageTitle))
				{
					System.out.println("Titles Are Matching-PASS");
				    Cell titleTextResult=sheetRow.createCell(5);
				    titleTextResult.setCellValue("Titles Are Matching-PASS");
				}
				else
				{
					System.out.println("Titles Are Not Matching-FAIL");
					Cell titleTextResult=sheetRow.createCell(5);
					titleTextResult.setCellValue("Titles Are Not Matching-FAIL");
				}
				
//GETTING THE USERNAME AND PASSWORD FROM EXCEL WORKBOOK
				
				//USERNAME
	            Cell userName=sheetRow.getCell(06);
	            String userNameData=userName.getStringCellValue();
				System.out.println("The UserName is :- "+userNameData);
				
				//PASSWORD
				Cell passWord=sheetRow.getCell(07);
				String passWordData=passWord.getStringCellValue();
				System.out.println("The PassWord is :- "+passWordData);
				
//VALIDATING FUNCTIONALITY OF USERNAME,PASSWORD,LOGIN
		try {
				//PROPERTY OF USERNAM ELEMENT
				By usernameElement=By.id("txtUsername");
				WebElement userNameL=driver.findElement(usernameElement);
				userNameL.sendKeys(userNameData);
				
				//PROPERTY OF PASSWORD ELEMENT
				By passwordElement=By.id("txtPassword");
				WebElement passwordL=driver.findElement(passwordElement);
				 passwordL.sendKeys(passWordData); 
                				 
				//PROPERTY OF LOGIN BUTTON ELEMENT
				 Thread.sleep(2000);
				 By loginButtonElemnt=By.id("btnLogin");
				 WebElement loginButtonL=driver.findElement(loginButtonElemnt);
				 loginButtonL.click();
	
//VALIDATING ORANGE HRM HOMEPAGE
				 
					
				String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			    System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
			           
				String actualOHRMHomePage_URL=driver.getCurrentUrl();
				System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
				
		
				Cell expected_HomePageText=sheetRow.getCell(8);
				String expectedHomePageText=expected_HomePageText.getStringCellValue();
				System.out.println("The Expected HomePage Title:- "+expectedHomePageText);
				
				//PROPERTY OF WELCOME ADMIN ELEMENT
				
				By welcomeAdminElement=By.id("welcome");
				WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
				String actualHomePageText=welcomeAdminL.getText();
				Cell actual_HomepageText=sheetRow.createCell(9);
				actual_HomepageText.setCellValue(actualHomePageText);
				System.out.println("The Actual HomePage Title:- "+actualHomePageText);
				
			
					System.out.println("HomePage Titles Are Matching-PASS");
					Cell homepageTitleResult=sheetRow.createCell(10);
					homepageTitleResult.setCellValue("HomePage Titles Are Matching-PASS");
					
					welcomeAdminL.click();
					Thread.sleep(2000);
					
				//PROPERTY OF LOGOUT ELEMENT
					By logOutElement=By.linkText("Logout");
				   WebElement logOutL=driver.findElement(logOutElement);
					logOutL.click();
					
//VALIDATING LOGOUT PANEL TITLE AFTER LOGGING OUT
                 /*    
					//Expected text of LogoutPage Element
					Cell expected_logOutPageText=sheetRow.getCell(11);
				    String logOutLoginPage=expected_logOutPageText.getStringCellValue();
				    System.out.println("the expected text of Orange HRM LoginPage is:- "+expected_logOutPageText);

				    By logOutElementA=By.id("logInPanelHeading");
					WebElement logOutA=driver.findElement(logOutElement);
					
					String logOuttactualTextOfLoginPage=logOutA.getText();
					System.out.println("The Actual Text Of LoginPage is:- "+logOuttactualTextOfLoginPage);
					
					Cell actual_logOutLogInPageText=sheetRow.createCell(12);
				*/
					
					
					
	
		
			}
			catch(Exception errorcode)
			{
				System.out.println("Failed To Login-FAIL");	
				Cell failedHomepageTitleResult=sheetRow.createCell(10);
				failedHomepageTitleResult.setCellValue("Failed To Login-FAIL");
				
				System.out.println(errorcode);
				
			}
			
			
			
			
		}
			FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/LogInTestResults1.xlsx");
			workbook.write(testResults);
			
	}
}  

	
   
     

