package com.OHRMApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ValidatingAddEmployeePageText extends  LoginFunctionality
{
	@Test
public void AddEmployeePage() throws IOException
{


	//Getting The Data from The ExcelWorkbook
	 //Identifying The File
	 String excelPath="./src/com/OHRMExcelWorkBooks/AddEmployeeTestData.xlsx";
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
		
	
//validating PIM Element
		By  menuPIMElement=By.id("menu_pim_viewPimModule");
	    WebElement menuPIML=driver.findElement(menuPIMElement);	
	
	   Actions act=new Actions(driver);
	   act.moveToElement(menuPIML).build().perform();
	
//Validating Add Employee Element
	
	   By PIM_AddEmployeeElement=By.id("menu_pim_addEmployee");
	   WebElement PIM_AddEmployeeL=driver.findElement(PIM_AddEmployeeElement);
	   PIM_AddEmployeeL.click();
	
//VALIDATING ADD EMPLOYEE TEXT
	
	
	Cell expected_AddEmployee=sheetRow.getCell(11);
	String expectedAddEmployeeText=expected_AddEmployee.getStringCellValue();
	System.out.println("The Expected Text of Add Employee is:- "+expectedAddEmployeeText);
	
	
	
	}
	
	
	
	
}
	
	
}
