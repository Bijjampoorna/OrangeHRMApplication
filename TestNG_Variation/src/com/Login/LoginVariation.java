package com.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginVariation 
{
	class test
	{
	public void logg()
	{
		Logger log=Logger.getLogger(LoginVariation.class);
		//LOGFILE
		String filePath="C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\Log4jFile\\OrangeHRMApplication_POM_LogFiles.properties";
		PropertyConfigurator.configure(filePath);
	}
	
	public void propertyFile() throws IOException
	{
		FileInputStream propertyFilePath=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\OHRMPropertyFile.properties");
		Properties pr=new Properties();
		pr.load(propertyFilePath);
		
	}
	
	public void excelPath() throws IOException 
	{
		
		FileInputStream excelFile=new FileInputStream("C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_TestNG_FrameWork\\src\\com\\ExcelWorkBooks\\LogInTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelFile);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	}
	

	}	
	
}