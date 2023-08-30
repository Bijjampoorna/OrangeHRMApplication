package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_003_MouseHoverOperation
{
	public static WebDriver driver;
	public static String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void login()
	{
		By userNameElement=By.id("txtUsername");
		WebElement userNameL=driver.findElement(userNameElement);
		userNameL.sendKeys("Bijjampoorna");
		
		By passwordElement=By.id("txtPassword");
		WebElement passwordL=driver.findElement(passwordElement);
		passwordL.sendKeys("Bijjampoorna12$");
		
		By loginBTNElement=By.id("btnLogin");
		WebElement loginBTNL=driver.findElement(loginBTNElement);
		loginBTNL.click();
		
	}
	
	public void mousehoverOp()
	{
		String expectedAddEmployeeText="Add Employee";
		By pimElement=By.id("menu_pim_viewPimModule");
		WebElement pimL=driver.findElement(pimElement);
		Actions act=new Actions(driver);
		
		act.moveToElement(pimL).build().perform();
		By addEmployeeElement=By.id("menu_pim_addEmployee");
		WebElement addEmployeeL=driver.findElement(addEmployeeElement);
		addEmployeeL.click();
		
		By addEmployeeTextElement=By.linkText("Add Employee");
		WebElement addEmployeeTextL=driver.findElement(addEmployeeTextElement);
		String actualAddEmployeeText=addEmployeeTextL.getText();
		System.out.println("The actual text of add employee is-"+actualAddEmployeeText);
		
		if(actualAddEmployeeText.equals(expectedAddEmployeeText))
		{
			System.out.println("Landed at add employee page");
		}
		else
		{
			System.out.println("Failed to land at add employee page");
		}
	}
	
	public void logout() throws InterruptedException
	{
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		Thread.sleep(1500);
		
		By logOutElement=By.linkText("Logout");
		WebElement logOutL=driver.findElement(logOutElement);
		logOutL.click();
	}
	public void teardown()
	{
		
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Tc_003_MouseHoverOperation mo=new Tc_003_MouseHoverOperation();
		mo.setUp();
		mo.login();
		mo.mousehoverOp();
		mo.logout();
		mo.teardown();
		
	}
}
