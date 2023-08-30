package com.Assignments;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment_001_EmpId 
{

	WebDriver driver;
	String urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void empId() throws InterruptedException
	{
		By userNameElement=By.id("txtUsername");
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys("Bijjampoorna");
		
		
		By passWordElement=By.id("txtPassword");
		WebElement passwordL=driver.findElement(passWordElement);
		passwordL.sendKeys("Bijjampoorna12$");
		
		By loginBtnElement=By.id("btnLogin");
		WebElement loginBtnL=driver.findElement(loginBtnElement);
		loginBtnL.click();
		/*
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		*/
		
		By pimElement=By.id("menu_pim_viewPimModule");
		WebElement pimL=driver.findElement(pimElement);
		
		Actions act =new Actions(driver);
		act.moveToElement(pimL).build().perform();
		
		By employeeListElement=By.id("menu_pim_viewEmployeeList");
		WebElement employeeListL=driver.findElement(employeeListElement);
		employeeListL.click();
		
		//Empid
		By tableElement=By.id("resultTable");
		WebElement TableL=driver.findElement(tableElement);
		
		//ohrmList_chkSelectAll
		//ohrmList_chkSelectRecord_16
		//
		//input[starts-with(@id,'ohrmList_chkSelectRecord')]
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]/input
		//chkSelectRow[]
		//input[@name='chkSelectRow[]']
		By idElement=By.tagName("tr");
		List<WebElement> idL = TableL.findElements(idElement);
		int idCount=idL.size();
		System.out.println("the size  of id's is-"+idCount);
		
		for(int i=1;i<idCount;i=i+2)
		{
			//
			//[@class='table hover']/tbody/tr[1]/td[1]
			//*[@id="resultTable"]/tbody/tr[2]/td[1]
			//*[@id="resultTable"]/tbody/tr[3]/td[1]
			//html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]
			//html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[2]/td[1]
			By empIdElement=By.xpath("//html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr["+i+"]/td[1]");
			WebElement empIdL=driver.findElement(empIdElement);
			empIdL.click();
			System.out.println("Clicked on id-"+i);
			
			
		}
		
		
		
		
	}
	public void tearDown()
	{
		driver.quit();	
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Assignment_001_EmpId id=new Assignment_001_EmpId();
		id.setUp();
		id.empId();
		
	}
}