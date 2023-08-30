package com.ExcelWorkBookSingleTestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SingleTestData_Example {
	public static void main(String[] args) throws IOException {
		
		//Identifying the file
		FileInputStream file =new FileInputStream("./src/com/ExcelWorkBooks/SingleTestData.xlsx");
		
		//identifying the workbook in the file
		XSSFWorkbook workBook= new XSSFWorkbook(file);
		
		//identifying the Sheet in the WorkBook
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		//Identifying the row in the sheet
		 Row row=sheet.getRow(0);
		
		//identifying the row of the cell
		  Cell cell= row.getCell(0);
		
		//Reading the data from the cell
		 String testData = cell.getStringCellValue();
		 
		 System.out.println(testData);
	}

}
