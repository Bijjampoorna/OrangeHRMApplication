package com.EmployeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaticEmployeeData extends ValidatingEmloyeeListPage
{   //@Test(priority=5)
	public void StaticEmployeeWrite() throws IOException
	{
		
		
		
		String excelPath="./src/com/OHRMExcelWorkBooks/EmployeeData.xlsx";
		 FileInputStream testData=new FileInputStream(excelPath);
		
		//identifying the workbook in the file
		XSSFWorkbook workbook = new XSSFWorkbook(testData);
		
		//identifying the sheet in the workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		Row cityRow = sheet.createRow(0);
		
		/////html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[4]
		
		
		String xPathExpression1="html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[";
		String xPathExpression2="]/td[";
		String xPathExpression3="]";
		
		
		for(int Row=1;Row<=50;Row++)
		{
			 Row row = sheet.createRow(Row);
		  for(int Cell=1;Cell<=4;Cell++ )
		  {
		  WebElement staticEmployeeData=driver.findElement(By.xpath(xPathExpression1+Row+xPathExpression2+Cell+xPathExpression3));
		  
		  String employeeData=staticEmployeeData.getText();
		  System.out.print(staticEmployeeData+" ");
	
				Cell cell = row.createCell(Cell-1);
				cell.setCellValue(employeeData);
				
		  }
		  System.out.println();
		  }
		FileOutputStream testResults= new FileOutputStream("./src/com/OHRMExcelWorkBooks/StaticEmployeeDataResult.xlsx");
	    workbook.write(testResults);		
	}
	
	
	
	
	
	

}
