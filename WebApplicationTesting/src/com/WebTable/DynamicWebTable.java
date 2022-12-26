package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseTest{

	@Test
	public void capturingDynamicWebTableData() throws IOException
	{
		
		
	FileInputStream file=new FileInputStream("./src/com/WebTableExcelWorKBookData/DynamicWebTableData.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(file);
	XSSFSheet sheet=workBook.getSheet("Sheet1");
	
	Row cityRow = sheet.createRow(0);
	
	Cell city0=cityRow.createCell(0);
	
   city0.setCellValue("CityName     Time ");
	// /html/body/div[5]/section[1]/div

	   By webTableL=By.xpath("/html/body/div[5]/section[1]/div");
	WebElement webTable=driver.findElement(webTableL);
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]
	   By tablesRowsL=By.tagName("tr");
	   List<WebElement> tableRows=webTable.findElements(tablesRowsL);
	   int tableRowsCount=tableRows.size();
	   System.out.println("The Active Row Size Is :-"+tableRowsCount);
	   
	   for(int i=0; i<tableRowsCount; i++)
	   {
		   
		   
	    WebElement tableRow=tableRows.get(i);
	    
	    By tableColumnL=By.xpath("td");
	    List<WebElement> tableColumn=tableRow.findElements(tableColumnL);
	    int tableColumnCount=tableColumn.size();
	  
	   
	    Row row=sheet.createRow(i);
	    for(int j=0;j<tableColumnCount;j++)
	    {
	    String webTableData=tableColumn.get(j).getText();
	   
	    Cell cell=row.createCell(j);
	    cell.setCellValue(webTableData);
	    System.out.print(webTableData+"     ");
	    }
	    System.out.println();
	   }
	   
	FileOutputStream testResult = new FileOutputStream("./src/com/WebTableExcelWorKBookData/DynamicWebTableDataResult.xlsx");
	workBook.write(testResult);

	
	}
	
}
