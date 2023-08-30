package com.AddEmployee;

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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ValidatingHomePageOfOHRM extends LoginFunctionality {
	
	@Test(priority=3)
	public void OHRM_Homepage() throws IOException, InterruptedException
	{
		
//PROPERTY FILE
		FileInputStream Profile=new FileInputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\PropertyFile\\OrangeHRM_DDT_PropertyFile.properties");
		 Properties pr=new Properties();
		 pr.load(Profile);
		
		
		//Getting The Data from The ExcelWorkbook
		 //Identifying The File
   	 String excelPath="C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx";
		 FileInputStream testData=new FileInputStream(excelPath);
		
		 //Identifying the Workbook
		 XSSFWorkbook workbook=new XSSFWorkbook(testData);
		 
		 //IDentifying the Sheet in the WorkBook
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		
					//going to all the active Rows
					Row sheetRow=sheet.getRow(01);
					
//VALIDATING ORANGE HRM HOMEPAGE
					 
						Thread.sleep(5000);
					String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
				    System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
				           
					String actualOHRMHomePage_URL=driver.getCurrentUrl();
					System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
					
					if(actualOHRMHomePage_URL.equals(expectedOHRMHomePage_URl))
					{
						
//PROPERTY OF WELCOME ADMIN ELEMENT
					
					Cell expected_HomePageText=sheetRow.getCell(8);
					String expectedHomePageText=expected_HomePageText.getStringCellValue();
					//System.out.println("The Expected HomePage Title:- "+expectedHomePageText);
					log.info("The Expected HomePage Title:- "+expectedHomePageText);
					
					By welcomeAdminElement=By.id(pr.getProperty("welcomeAdminElement"));
					WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
					String actualHomePageText=welcomeAdminL.getText();
					Cell actual_HomepageText=sheetRow.createCell(9);
					actual_HomepageText.setCellValue(actualHomePageText);
					//System.out.println("The Actual HomePage Title:- "+actualHomePageText);
					log.info("The Actual HomePage Title:- "+actualHomePageText);
					
					if(actualHomePageText.contains(expectedHomePageText))
					{
						//System.out.println("HomePage Titles Are Matching-PASS");
						log.info("HomePage Titles Are Matching-PASS");
						Cell homepageTitleResult=sheetRow.createCell(10);
						homepageTitleResult.setCellValue("HomePage Titles Are Matching-PASS");
						
					
						
					}
					
			
				else
			{
				System.out.println("Failed To Login-FAIL");	
				log.error("Failed To Login-FAIL");
				Cell failedHomepageTitleResult=sheetRow.createCell(10);
				failedHomepageTitleResult.setCellValue("Failed To Login-FAIL");
				
			
				
			}
				
				}	
//VALIDATING PIM ELEMENT PROPERTY
		
		By pIMElementL=By.id(pr.getProperty("pIMElementL"));
		WebElement menuPIM_Element=driver.findElement(pIMElementL);
		
		Actions act=new Actions(driver);
		act.moveToElement(menuPIM_Element).build().perform();
		
//VALIDATING ADD EMPLOYEE PROPERTY
		
        By addEmployeeL=By.id(pr.getProperty("addEmployeeL"));
		WebElement PIM_AddEmployeeElement=driver.findElement(addEmployeeL);
		PIM_AddEmployeeElement.click();
		
	
		FileOutputStream testResults= new FileOutputStream("C:\\Users\\Bijjam Poorna\\OneDrive\\Desktop\\Automation Testing\\OHRMApplication\\src\\com\\OHRMExcelWorkBooks\\AddEmployeeTestResults1.xlsx");
		workbook.write(testResults);	
		
	}

}
