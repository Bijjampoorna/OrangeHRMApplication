package com.LoginFunctionalityOfORMApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLoginFunctionalityWithMultipleData {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 //Getting The Data from The ExcelWorkbook
		 //Identifying The File
		 FileInputStream testData=new FileInputStream("./src/com/HRMLoginFunctionalityWithMultipleDataExcelFiles/ValidInvalidDataOfOHRMApplication.xlsx");
		
		 //Identifying the Workbook
		 XSSFWorkbook workbook=new XSSFWorkbook(testData);
		 
		 //IDentifying the Sheet in the WorkBook
		 XSSFSheet sheet=workbook.getSheet("Sheet1");
		 
		 String ORMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";      
			driver.get(ORMApplicationURLAddress);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		 //Identifying the Active rows in the Sheet
		 
		int rowsCount=sheet.getLastRowNum();
		System.out.println(rowsCount);
		for(int row=1;row<=rowsCount;row++)
		{
			//going to all the active Rows
			Row sheetRow=sheet.getRow(row);
			
			//going to a row ad=nd finding the number of Active cells
			int cellCount=sheetRow.getLastCellNum();
			System.out.println(cellCount);
			
			//going to an Active row pof all active cells
				//UserName Cell
			Cell usernamecellOfRow=sheetRow.getCell(0);
			String expectedUsernameTestData=usernamecellOfRow.getStringCellValue();
			System.out.println("The Username is:- "+expectedUsernameTestData);
			
			
			//Password Cell
			  Cell passwordCellofRow=sheetRow.getCell(1);
			  String expectedPasswordTestData=passwordCellofRow.getStringCellValue();
			  System.out.println("The Password is :- "+expectedPasswordTestData);
			
			//Expected text of LoginPage Element
		    String expectedTextOfLoginPage="LOGIN Panel";
		    System.out.println("the expected text of Orange HRM LoginPage is:- "+expectedTextOfLoginPage);
		    
		    //<div id="logInPanelHeading">LOGIN Panel</div>
			WebElement TextOfLoginpage=driver.findElement(By.id("logInPanelHeading"));
			String actualTextOfLoginPage=TextOfLoginpage.getText();
			
			System.out.println("the actual text of Orange HRM Loginpage is:- "+actualTextOfLoginPage);
			
			
			if(actualTextOfLoginPage.equals(expectedTextOfLoginPage))
			{	
              System.out.println("At Login Page-PASS");
		    //testing the Username Functionality
			//<input name="txtUsername" id="txtUsername" type="text">
			WebElement usernameElement=driver.findElement(By.id("txtUsername"));
			usernameElement.sendKeys(expectedUsernameTestData);
			
			
			//Testing Password Functionality
		    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			WebElement passwordElement=driver.findElement(By.id("txtPassword"));
			passwordElement.sendKeys(expectedPasswordTestData);
			
			
			
		    //Testing Login Button Functionality
			//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			WebElement loginButton=driver.findElement(By.id("btnLogin"));
			loginButton.click();
			Thread.sleep(5000);
			
			
			
			String expectedOHRMHomePage_URl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			System.out.println("The Expected URL Address Of OHRM Application Is:- "+expectedOHRMHomePage_URl);
           
			String actualOHRMHomePage_URL=driver.getCurrentUrl();
			System.out.println("The actual Title of OHRM Application Is:- "+actualOHRMHomePage_URL);
			
			if(actualOHRMHomePage_URL.equals(expectedOHRMHomePage_URl))
			{
				
				WebElement welcomeAdminElement=driver.findElement(By.id("welcome"));
				welcomeAdminElement.getText();
				welcomeAdminElement.click();
				
				//Expected Text of Admin
				String expectedTextOfHomePage="Admin";
				System.out.println("The Expected Text Of Orange HRM HomePage is:- "+expectedTextOfHomePage);
				
				String actualTextOfHomePage=welcomeAdminElement.getText();
				System.out.println("The Actual Text Of Orange HRM Homepage is:- "+actualTextOfHomePage);
				
				if(actualTextOfHomePage.contains(expectedTextOfHomePage))
				{
					System.out.println("Landed Sucessfully at OHRM HomePage-PASS");
					Cell testResult=sheetRow.createCell(2);
					testResult.setCellValue("Landed Sucessfully at OHRM HomePage-PASS");
					//Thread.sleep(2000);
					
				    WebElement logOutElement=driver.findElement(By.linkText("Logout"));
					logOutElement.click();
					
				}
			
				else
				{
					
				File file_OHRM_Login_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file_OHRM_Login_ScreenShot,new File(".\\OHRM_TestResults_ScreenShots\\"+"userName-"+expectedUsernameTestData+".png"));
					System.out.println("Failed To Login Into OHRM Application-FAIL");
					Cell failedTestResult=sheetRow.createCell(2);
					failedTestResult.setCellValue("Failed To Login Into OHRM Application-FAIL");
				}
			 }
			
			}
			FileOutputStream file1=new FileOutputStream("./src/com/HRMLoginFunctionalityWithMultipleDataExcelFiles/OHRMLoginTestResults.xlsx");
			workbook.write(file1);
			
			  }
			
		driver.quit();
		}
			
		
	}


