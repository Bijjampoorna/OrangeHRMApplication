package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingWebTableData {

	public class CapturingFirstColumn extends BaseTest {

		@Test
		public void CapturingFirstColumnData() throws IOException
		{
			 
			//Finding The Property of First Row of the First Cell
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			
			
			//Finding the Last Row Of Firsr Cell
			//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
			///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
			
	String workBookLocation="./src/com/WebTableExcelWorKBookData/WebTableData.xlsx";
			
			//Identifying the location of the File
			FileInputStream firstColumnData= new FileInputStream(workBookLocation);
			
			//identifying the workbook in the file
			XSSFWorkbook workbook = new XSSFWorkbook(firstColumnData);
			
			//identifying the sheet in the workbook
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			Row cityRow = sheet.createRow(0);
					
			Cell city0=cityRow.createCell(0);
			
		   city0.setCellValue("CityName     Time ");
		   
			
			String xPathExpression1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
			String xPathExpression2="]/td[";
			String xPathExpression3="]";
			
			for(int city=1;city<=36;city++)
			{
				 Row row = sheet.createRow(city);
			  for(int time=1;time<=8;time++ )
			  {
			  WebElement firstColumnElements=driver.findElement(By.xpath(xPathExpression1+city+xPathExpression2+time+xPathExpression3));
			  
			  String cityName=firstColumnElements.getText();
			  System.out.print(cityName+" ");
		
					Cell cell = row.createCell(time-1);
					cell.setCellValue(cityName);
					
			  }
			  System.out.println();
			  }
			FileOutputStream testresults= new FileOutputStream("./src/com/WebTableExcelWorKBookData/WebTableData1.xlsx");
			workbook.write(testresults);
			}
			
			
		}
		
		
		


}
