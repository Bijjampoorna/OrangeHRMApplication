package com.EmployeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicEmployeeList extends EmployeeList
{

	@Test(priority=3)
	public void dynamicEmployeeListValidation() throws IOException
	{
		//PROPERTYFILE	   
		   FileInputStream proFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\OHRMPropertyFile.properties");
		   Properties pr=new Properties();
		   pr.load(proFile);
		   
	//EXCELFILE
		   FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRMApplicationExcelOperations\\src\\com\\ExcelWorkBooks\\DynamicEmployeeListData.xlsx");
		   
		   XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		   
		   XSSFSheet sheet=workbook.getSheet("Sheet1");
		   
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table
		   ////*[@id="resultTable"]
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		   //
		   Row rowSheet=sheet.createRow(0);
		   
		   By webTableElement=By.id(pr.getProperty("webTableElement"));
		   WebElement webTableL=driver.findElement(webTableElement);
		   //String webTableText=webTableL.getText();
		   //log.info("The Text of Webtable id-"+webTableText);
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		   ///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]
		   
		   
		   
		   
		   
		   
		
		
	}
	
	
	
	
}
