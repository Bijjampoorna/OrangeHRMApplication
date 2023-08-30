package com.ohrm.lib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General extends Global
{

	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\OHRM_Modular_FrameWork\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get(urlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
	}
	public void loginPageValidation()
	{
		
		WebElement loginPanelL=driver.findElement(By.id(loginPanelElement));
		String actualLoginPageText=loginPanelL.getText();
		System.out.println("The actual text of login page is-"+actualLoginPageText);
		if(actualLoginPageText.equals(expectedLoginPageText))
		{
			System.out.println("landed at Login Page");
		}
		else
		{
			System.out.println("Failed to land at login page");
		}
	}
	
	public void login()
	{
		
		
		WebElement userNameL=driver.findElement(By.id(userNameElement));
		userNameL.sendKeys(userName);
		
		WebElement passwordL=driver.findElement(By.id(passWordElement));
		passwordL.sendKeys(passWord);
		
		WebElement loginBtnL=driver.findElement(By.id(loginBtnElement));
		loginBtnL.click();
		
	}
	
	public void homepageValidation()
	{
		WebElement WelcomeAdminL=driver.findElement(By.id(welcomeAdminElement));
		String actualHomePageText=WelcomeAdminL.getText();
		System.out.println("The actual text of homepage is-"+actualHomePageText);
		if(actualHomePageText.equals(expectedHomePageText))
		{
			System.out.println("In The HomePage");
		}
		else
		{
			System.out.println("Unable to Login");
		}
		
	}
	public void logOut() throws InterruptedException
	{
		WebElement welcomeAdminL=driver.findElement(By.id(welcomeAdminElement));
		welcomeAdminL.click();
		Thread.sleep(1500);	
		
		WebElement logOutL=driver.findElement(By.linkText(logOutElement));
		logOutL.click();
	}
	
	public void tearDown()
	{
		driver.quit();
	}
	
	public void addEmployeepageValidation() throws InterruptedException
	{
		WebElement pimL=driver.findElement(By.id(pimElement));
		 Actions act=new Actions(driver);
		act.moveToElement(pimL).build().perform();
		Thread.sleep(1500);
		
		WebElement addEmployeeL=driver.findElement(By.id(addEmployeeElement));
		addEmployeeL.click();
		
		WebElement addEmployeeTextL=driver.findElement(By.className(addEmployeeTextElement));
		String actualAddEmployeePageText=addEmployeeTextL.getText();
		System.out.println("The actual text of add employee page is-"+actualAddEmployeePageText);
		
		if(actualAddEmployeePageText.equals(expectedAddEmployeePageText))
		{
			System.out.println("Landed at Add Employee Page");
		}
		else
		{
			System.out.println("Failed to land at add employee page");
		}
	}
	
	public void employeeName()
	{
		WebElement firstNameL=driver.findElement(By.id(firstNameElement));
		firstNameL.sendKeys(firstName);
		
		WebElement middleNameL=driver.findElement(By.id(middleNameElement));
		middleNameL.sendKeys(middleName);
		
		WebElement lastNameL=driver.findElement(By.id(lastNameElement));
		lastNameL.sendKeys(lastName);
		
		WebElement saveBtnL=driver.findElement(By.id(saveBtnElement));
		saveBtnL.click();
		
	}
}
