package com.ExcelWorkBookSingleTestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleTestDataWrite_Example {
	
	public static void main(String[] args) throws IOException {

		//Identifying the file
		FileInputStream file =new FileInputStream("./src/com/ExcelWorkBooks/SingleTestData.xlsx");
		
		//identifying the workbook in the file
		XSSFWorkbook workBook= new XSSFWorkbook(file);
		
		//identifying the Sheet in the WorkBook
		
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		//Identifying the row in the sheet
		 Row row=sheet.createRow(4);
		
		//identifying the row of the cell
		  Cell cell= row.createCell(8);
		  Cell cell1=row.createCell(9);
		  Cell cell2=row.createCell(10);
				  
		 //writing a value in the cell
		 cell.setCellValue("Testing values"); 
		  cell1.setCellValue("Excel");
		  cell2.setCellValue("Values");
		  FileOutputStream File1 = new FileOutputStream("./src/com/ExcelWorkBooks/SingleTestData.xlsx");
		  
		  workBook.write(File1);
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	

}
