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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddEmployee_V_F extends HomepageValidation 
{

	@Test(priority=3)
	public void addEmployee() throws IOException, InterruptedException
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
		
		Row sheetRow1=sheet.getRow(01);
		By pimElement=By.id(pr.getProperty("PIMElement"));
		WebElement pimL=driver.findElement(pimElement);
		Actions act=new Actions(driver);
		act.moveToElement(pimL).build().perform();
		
		By addEmployeeElement=By.id(pr.getProperty("addEmployeeElement"));
		WebElement addEmployeeL=driver.findElement(addEmployeeElement);
		addEmployeeL.click();
		
		Cell expected_AddEmployeeText=sheetRow1.getCell(11);
		String expectedAddEmployeeText=expected_AddEmployeeText.getStringCellValue();
		System.out.println("The expected text of add Employee page is-"+expectedAddEmployeeText);
		
		By addEmployeeTextElement=By.linkText(pr.getProperty("addEmployeeTitle"));
		WebElement addEmployeeTextL=driver.findElement(addEmployeeTextElement);
		String actualAddEmployeeText=addEmployeeTextL.getText();
		System.out.println("The actual text of add employee is-"+actualAddEmployeeText);
		
		Cell actual_AddEmployeeText=sheetRow1.createCell(12);
		actual_AddEmployeeText.setCellValue(actualAddEmployeeText);
		
		if(actualAddEmployeeText.equals(expectedAddEmployeeText))
		{
			String testResult="Text is Matching";
			log.info("Landed at Add Employee Page");
			Cell textTestResult=sheetRow1.createCell(13);
			textTestResult.setCellValue(testResult);
		}
		else
		{
			String testResult="Text is not Matching";
			log.info("Failed to Land at Add Employee Page");
			Cell textTestResult=sheetRow1.createCell(13);
			textTestResult.setCellValue(testResult);

		}

		for(int row=1;row<=rowCount;row++)
		{
			Row sheetRow=sheet.getRow(row);
			System.out.println("The row is-"+row);
			
		//FIRSTNAME-EXPECTED
			Cell expected_FirstName=sheetRow.getCell(14);
			String expectedFirstName=expected_FirstName.getStringCellValue();
			System.out.println("the expected first name of employee is-"+expectedFirstName);
			
			By firstNameElement=By.id(pr.getProperty("firstNameElement"));
			WebElement firstNameL=driver.findElement(firstNameElement);
			firstNameL.sendKeys(expectedFirstName);
			
		//MIDDLE NAME-EXPECTED
			Cell expected_MiddleName=sheetRow.getCell(15);
			String expectedMiddleName=expected_MiddleName.getStringCellValue();
			System.out.println("The expected middle name of employee is-"+expectedMiddleName);
			
			By middleNameElement=By.id(pr.getProperty("middleNameElement"));
			WebElement middleNameL=driver.findElement(middleNameElement);
			middleNameL.sendKeys(expectedMiddleName);
			
		//LASTNAME-EXPECTED
			Cell expected_LastName=sheetRow.getCell(16);
			String expectedLastName=expected_LastName.getStringCellValue();
			System.out.println("the expected last name of employee is-"+expectedLastName);
			
			By lastNameElement=By.id(pr.getProperty("lastNameElement"));
			WebElement lastNameL=driver.findElement(lastNameElement);
			lastNameL.sendKeys(expectedLastName);
			
			/*
		//EMPID-EXPECTED
			By empIdElement=By.id(pr.getProperty("employeeIdElement"));
			WebElement empIdL=driver.findElement(empIdElement);
			String expectedEmpId=empIdL.getAttribute("value");
			System.out.println("The id of the employee is-"+expectedEmpId);
			Cell expected_EmpId=sheetRow.createCell(17);
			expected_EmpId.setCellValue(expectedEmpId);
			*/
			
		//SAVE BUTTON
			By saveBtnElement=By.id(pr.getProperty("saveBtnElement"));
			WebElement saveBtnL=driver.findElement(saveBtnElement);
			saveBtnL.click();
			
		//PERSONAL PAGE VALIDATION
			Cell expected_PersonalDetailsText=sheetRow.getCell(20);
			String expectedPersonalDetailsText=expected_PersonalDetailsText.getStringCellValue();
			System.out.println("the expected text of personal page is-"+expectedPersonalDetailsText);
			
			By personalDetailsTextElement=By.linkText(pr.getProperty("personalDetailsElement"));
			WebElement personalDetailsTextL=driver.findElement(personalDetailsTextElement);
			String actualPersonalDetailsText=personalDetailsTextL.getText();
			System.out.println("the actual text pf personal page is-"+actualPersonalDetailsText);
			
			Cell actual_PersonalDetailsText=sheetRow.createCell(21);
			actual_PersonalDetailsText.setCellValue(actualPersonalDetailsText);
			
			if(actualPersonalDetailsText.equals(expectedPersonalDetailsText))
			{
				String testResult="Text is Matching";
				log.info("Landed at Personal Details Page");
				Cell textTestResult=sheetRow.createCell(22);
				textTestResult.setCellValue(testResult);
			}
			else
			{
				String testResult="Text is not Matching";
				log.info("Failed to Land at Personal Details Page");
				Cell textTestResult=sheetRow.createCell(22);
				textTestResult.setCellValue(testResult);
			}
			
		//VALIDATION OF NAMES AGAINST THE EXPECTED NAMES WITH ACTUAL NAMES FROM THE APPLICATION
			
		//ACTUAL FIRST NAME
			By employeeFirstNameElement=By.id(pr.getProperty("employeeFirstNameElement"));
			WebElement employeeFirstNameL=driver.findElement(employeeFirstNameElement);
			String actualFirstName=employeeFirstNameL.getAttribute("value");
			System.out.println("The actual first name of employee is-"+actualFirstName);
			Cell actual_FirstName=sheetRow.createCell(23);
			actual_FirstName.setCellValue(actualFirstName);
			
			if(actualFirstName.equals(expectedFirstName))
			{
				String testResult="First Name is Matching";
				log.info("First Name is Matching");
				Cell textTestResult=sheetRow.createCell(24);
				textTestResult.setCellValue(testResult);
			}
			else
			{
				String testResult="First Name not is Matching";
				log.info("First Name is not Matching");
				Cell textTestResult=sheetRow.createCell(24);
				textTestResult.setCellValue(testResult);
			}
		//ACTUAL MIDDLE NAME
			
			By employeeMiddleNameElement=By.id(pr.getProperty("employeeMiddleNameElement"));
			WebElement employeeMiddleNameL=driver.findElement(employeeMiddleNameElement);
			String actualMiddleName=employeeMiddleNameL.getAttribute("value");
			System.out.println("The actual middle employee name is-"+actualMiddleName);
			Cell actual_MiddleName=sheetRow.createCell(25);
			actual_MiddleName.setCellValue(actualMiddleName);
			
			if(actualMiddleName.equals(expectedMiddleName))
			{
				String testResult="Middle Name is Matching";
				log.info("Middle Name is Matching");
				Cell textTestResult=sheetRow.createCell(26);
				textTestResult.setCellValue(testResult);	
			}
			else
			{
				String testResult="Middle Name not is Matching";
				log.info("Middle Name not is Matching");
				Cell textTestResult=sheetRow.createCell(26);
				textTestResult.setCellValue(testResult);
			}
			
		//ACTUAL LAST NAME
			By employeeLastNameElement=By.id(pr.getProperty("employeeLastNameElement"));
			WebElement employeeLastNameL=driver.findElement(employeeLastNameElement);
			String actualLastName=employeeLastNameL.getAttribute("value");
			System.out.println("The actual last name of employee is-"+actualLastName);
			Cell actual_LastName=sheetRow.createCell(27);
			actual_LastName.setCellValue(actualLastName);
			
			if(actualLastName.equals(expectedLastName))
			{
				String testResult="Last Name is Matching";
				log.info("Last Name is Matching");
				Cell textTestResult=sheetRow.createCell(28);
				textTestResult.setCellValue(testResult);
			}
			else
			{
				String testResult="Last Name is not Matching";
				log.info("Last Name is not Matching");
				Cell textTestResult=sheetRow.createCell(28);
				textTestResult.setCellValue(testResult);
			}
			
			//driver.navigate().back();
			pimElement=By.id(pr.getProperty("PIMElement"));
			pimL=driver.findElement(pimElement);
			
			act.moveToElement(pimL).build().perform();
			
			addEmployeeElement=By.id(pr.getProperty("addEmployeeElement"));
			addEmployeeL=driver.findElement(addEmployeeElement);
			addEmployeeL.click();
		}
		
		
		FileOutputStream testResults=new FileOutputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\AddEmployeeTestDataResults.xlsx");
		workbook.write(testResults);
	}
	
}
