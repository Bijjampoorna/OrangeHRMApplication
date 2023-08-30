package com.AddEmployeeFunctionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.helpers.RowShifter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee extends AddEmployeePageValidation
{
	@Test(priority=3)
	public void addingEmployee() throws IOException, InterruptedException
	{
		
		//PROPERTYFILE	   
		   FileInputStream proFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
		   Properties pr=new Properties();
		   pr.load(proFile);
		   
	//EXCELFILE
		   FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");
		   
		   XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");
		   
	//GETTING ACTIVE NO. OF ROWS IN THE SHEET
		   
		   int rowCount=sheet.getLastRowNum();
		   System.out.println("The no. of active rows in the sheet is-"+rowCount);
		   log.info("The no. of active rows in the sheet is-"+rowCount);
		   
		   for(int row=1;row<=rowCount;row++)
		   {
			   
	//GETTING THE ROWS FROM THE SHEET
			   Row rowSheet=sheet.getRow(row);
			   
	
			   
	//ADDING EXPECTED FIRST,MIDDLE,LAST NAME OF EMPLOYEE
			   
		 //PROPERTY OF FIRST NAME
			Cell expected_FirstName=rowSheet.getCell(14);
			String expectedFirstName=expected_FirstName.getStringCellValue();
			log.info("The expected first name of employee is -"+expectedFirstName);
			
			By firstNameElement=By.id(pr.getProperty("firstNameElement"));
			WebElement firstNameL=driver.findElement(firstNameElement);
			firstNameL.sendKeys(expectedFirstName);
		
			
		//PROPERTY OF MIDDLE NAME	
			Cell expected_MiddleName=rowSheet.getCell(15);
			String expectedMiddleName=expected_MiddleName.getStringCellValue();
			log.info("The expected Middle name of employee is"+expectedMiddleName);
			
			By middleNameElement=By.id(pr.getProperty("middleNameElement"));
			WebElement middleNameL=driver.findElement(middleNameElement);
			middleNameL.sendKeys(expectedMiddleName);
		
		//PROPERTY OF LAST NAME	
			
			Cell expected_LastName=rowSheet.getCell(16);
			String expectedLastName=expected_LastName.getStringCellValue();
			log.info("The Expected Last Name Of Employee is -"+expectedLastName);
			
			By lastNameElement=By.id(pr.getProperty("lastNameElement"));
			WebElement lastNameL=driver.findElement(lastNameElement);
			lastNameL.sendKeys(expectedLastName);
			/*
		//PROPERTY OF EMPID	
			
			By employeeIdElement=By.id(pr.getProperty("employeeIdElement"));
			WebElement employeeIdL=driver.findElement(employeeIdElement);
			String expectedEmployeeId=employeeIdL.getAttribute("value");
			
			log.info("The expected employee Id is"+expectedEmployeeId);
			Cell expected_EmployeeId=rowSheet.createCell(17);
			expected_EmployeeId.setCellValue(expectedEmployeeId);
			*/
			/*
			By empIdElement=By.id(pr.getProperty("employeeIdElement"));
			WebElement empIdL=driver.findElement(empIdElement);
			String expectedEmployeeId=empIdL.getAttribute("value");
			log.info("The expected employee Id is-"+expectedEmployeeId);
			Cell expected_EmployeeId=rowSheet.createCell(17);
			expected_EmployeeId.setCellValue(expectedEmployeeId);
			*/

//SAVE
			By saveBtnElement=By.id(pr.getProperty("saveBtnElement"));
			WebElement saveBtnL=driver.findElement(saveBtnElement);
			saveBtnL.click();
			
			
//VALIDATING PERSONAL DETAILS PAGE
			
			Cell expected_PersonalDetailsPageText=rowSheet.getCell(20);
			String expectedPersonalDetailsPageText=expected_PersonalDetailsPageText.getStringCellValue();
			log.info("The expected personal details text is -"+expectedPersonalDetailsPageText);
			
			By personalDetailsPageElement=By.linkText(pr.getProperty("personalDetailsElement"));
			WebElement personalDetailsPageL=driver.findElement(personalDetailsPageElement);
			String actualPersonalDetailsPageText=personalDetailsPageL.getText();
			log.info("The actual Personal details Text is -"+actualPersonalDetailsPageText);
			
			Cell actual_PersonalDetailsPageText=rowSheet.createCell(21);
			actual_PersonalDetailsPageText.setCellValue(actualPersonalDetailsPageText);
			
			if(actualPersonalDetailsPageText.equals(expectedPersonalDetailsPageText))
			{
				String textResults="Text is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(22);
				testResult.setCellValue(textResults);				
				
				
			}
			else
			{
				String textResults="Text is not Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(22);
				testResult.setCellValue(textResults);				
				
				
			}
			
			
	//FINDING ACTUAL FIRST.MIDDLE,LAST NAMES OF EMPLOYEE				
			//ACTUAL FIRST NAME
			By personalFirstNameELement=By.id(pr.getProperty("employeeFirstNameElement"));
			WebElement personalFirstNameL=driver.findElement(personalFirstNameELement);
			String actualFirstName=personalFirstNameL.getAttribute("value");
			log.info("The actual First Name Of employee is -"+actualFirstName);
			Cell actual_FirstName=rowSheet.createCell(23);
			actual_FirstName.setCellValue(actualFirstName);
			
			if(actualFirstName.equals(expectedFirstName))
			{
				String textResults="First Name is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(24);
				testResult.setCellValue(textResults);	
			}
			else
			{
				String textResults="First Name Not is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(24);
				testResult.setCellValue(textResults);
			}
			
			//ACTUAL MIDDLE NAME
			By personalMiddleNameELement=By.id(pr.getProperty("employeeMiddleNameElement"));
			WebElement personalMiddleNameL=driver.findElement(personalMiddleNameELement);
			String actualMiddleName=personalMiddleNameL.getAttribute("value");
			log.info("The actual Middle Name Of employee is -"+actualMiddleName);
			Cell actual_MiddleName=rowSheet.createCell(25);
			actual_MiddleName.setCellValue(actualMiddleName);
			
			if(actualMiddleName.equals(expectedMiddleName))
			{
				String textResults="Middle Name is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(26);
				testResult.setCellValue(textResults);					
			}
			else
			{
				String textResults="Middle Name is not Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(26);
				testResult.setCellValue(textResults);
			}
			
			//ACTUAL LAST NAME
			By personalLastNameELement=By.id(pr.getProperty("employeeLastNameElement"));
			WebElement personalLastNameL=driver.findElement(personalLastNameELement);
			String actualLastName=personalLastNameL.getAttribute("value");
			log.info("The actual Last Name Of employee is -"+actualLastName);
			Cell actual_LastName=rowSheet.createCell(27);
			actual_LastName.setCellValue(actualLastName);
			
			if(actualLastName.equals(expectedLastName)) 
			{
				String textResults="Last Name is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(28);
				testResult.setCellValue(textResults);	
			}
			else
			{
				String textResults="Last Name not is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(28);
				testResult.setCellValue(textResults);
			}
			
			//ACTUAL ID
			/*
			By PersonalEmpIdElement=By.id(pr.getProperty("employeeIdElement"));
			WebElement PersonalEmpIdL=driver.findElement(PersonalEmpIdElement);
			String actualEmployeeId=PersonalEmpIdL.getAttribute("value");
			log.info("The actual Employee id is-"+actualEmployeeId);
			Cell actual_EmployeeId=rowSheet.createCell(18);
			actual_EmployeeId.setCellValue(actualEmployeeId);
			if(actual_EmployeeId.equals(expectedEmployeeId))
			{
				String textResults="Id is Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(19);
				testResult.setCellValue(textResults);
			}
			else
			{
				String textResults="Id is not Matching";
				log.info(textResults);
				Cell testResult=rowSheet.createCell(19);
				testResult.setCellValue(textResults);
			}
			*/
			
	//FINDING THE ADD EMPLOYEE PAGE ELEMENTS AGAIN FOR THE LOOP
			
			By pIMElement=By.id(pr.getProperty("PIMElement"));
			WebElement pIMElementL=driver.findElement(pIMElement);
			   
			 Actions act=new Actions(driver);
			 act.moveToElement(pIMElementL).build().perform();
			   
			 Thread.sleep(1500);
			   
			 By addEmployeeElement=By.id(pr.getProperty("addEmployeeElement"));
			 WebElement addEmployeeL=driver.findElement(addEmployeeElement);
			   
			 addEmployeeL.click();
			
			
			
		   }

		   FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\AddEmployeeTestResults.xlsx");	
			workbook.write(testResults);
	}
		
}
