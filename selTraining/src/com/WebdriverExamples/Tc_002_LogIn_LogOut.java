package com.WebdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_002_LogIn_LogOut
{
	static WebDriver driver;
	static String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By loginPageTitleElement=By.id("logInPanelHeading");
		WebElement loginPageTitleL=driver.findElement(loginPageTitleElement);
		String actualLoginPageTitle=loginPageTitleL.getText();
		System.out.println("The Actual title of login page is-"+actualLoginPageTitle);

		
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
	public void homePage()
	{
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		String actualHomePageTitle=welcomeAdminL.getText();
		System.out.println("The actual homepage text is-"+actualHomePageTitle);
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
	
	public void tearDown()
	{
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Tc_002_LogIn_LogOut tc=new Tc_002_LogIn_LogOut();
		tc.setUp();
		tc.login();
		tc.homePage();
		tc.logout();
		tc.tearDown();
	}
	
}
