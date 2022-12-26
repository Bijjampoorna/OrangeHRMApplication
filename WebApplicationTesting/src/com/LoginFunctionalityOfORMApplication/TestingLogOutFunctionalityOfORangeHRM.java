package com.LoginFunctionalityOfORMApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingLogOutFunctionalityOfORangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String ORMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";      
		
		driver.get(ORMApplicationURLAddress);
		
		//Validating the OrangeHRM Application Login Page
		
		String expected_OrangeHRMLoginPage_Title="OrangeHRM";
		System.out.println("the expected title of OrangeHRM Login Page is:-" +expected_OrangeHRMLoginPage_Title);
		
		String actual_OrangeHRMLoginPage_Title=driver.getTitle();
		System.out.println("the actual title of Orange HRM Application Login Page is:-"+actual_OrangeHRMLoginPage_Title);
		
		if(actual_OrangeHRMLoginPage_Title.equals(expected_OrangeHRMLoginPage_Title))
		{
			System.out.println("Landed Sucessfully at Orange HRM Application LoginPage-Pass");
		}
		else
		{
			System.out.println("Failed to land at Orange HRM LoginPage-Fail");
		}
		
       //Expected text of LoginPage Element
		
	    String expectedTextOfLoginPage="LOGIN Panel";
	    System.out.println("the expected text of Orange HRM LoginPage is:- "+expectedTextOfLoginPage);
	    
	  //<div id="logInPanelHeading">LOGIN Panel</div>
		WebElement TextOfLoginpage=driver.findElementById("logInPanelHeading");
		String actualTextOfLoginPage=TextOfLoginpage.getText();
		
		System.out.println("the actual text of Orange HRM Loginpage is:- "+actualTextOfLoginPage);
		
		if(actualTextOfLoginPage.equals(expectedTextOfLoginPage))
		{
			System.out.println("the Text Of Orange HRM Login Page is Matching-Pass");
		}
		else
		{
			System.out.println("the Text of Orange HRM Login page is Not Matching-Fail");
		}
		
	
		//testing the Username Functionality
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement UsernameElement=driver.findElementById("txtUsername");
		UsernameElement.sendKeys("Bijjampoorna");
		
		//Testing Password Functionality
	    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement PasswordElement=driver.findElementById("txtPassword");
		PasswordElement.sendKeys("Bijjampoorna12$");
		
		//Testing Login Button Functionality
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		WebElement Login=driver.findElementById("btnLogin");
		Login.click();
		
		
		//Validating the Orange Application HRM Home Page Element
		
		String expected_OrangeHRMHomePage_Title="orangeHRM";
		System.out.println("the expected OrangeHRM HomePage Title:- "+expected_OrangeHRMHomePage_Title);
		
		
	    String actual_OrangeHRMHomePage_Title=driver.getTitle();
		System.out.println("the actual OrangeHRM HomePage Title:- "+actual_OrangeHRMHomePage_Title);
		
		if(actual_OrangeHRMHomePage_Title.equalsIgnoreCase(expected_OrangeHRMHomePage_Title))
		{
			System.out.println("The Orange HRM Application HomePage Titles Matched-Pass");	
		}
		else
		{
			System.out.println("The Orange HRM Application Homepage Title Not Matched-Fail");
			
			
		}
		
		
		
		//Expected URL Address
		
		String expectedURLAddress="orangehrm";
		System.out.println("The Expected URL Address of Orange HRM HomePage is:- "+expectedURLAddress);
		
		String actualURLAddress=driver.getCurrentUrl();
		System.out.println("The Actual URL Address of Orange HRM HomePage is:- "+actualURLAddress);
		
		if(actualURLAddress.contains(expectedURLAddress))
		{
			System.out.println("the URl Address of Orange HRM HomePage Is Matching-Pass");
		}
		else
		{
			System.out.println("the URl Address of Orange HRM HomePage Is Not Matching-Fail");
		}
		
	
		// Validating Welcome Admin Element
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		
		
		WebElement welcomeAdminElement=driver.findElementById("welcome");
		welcomeAdminElement.getText();
		welcomeAdminElement.click();
		
		//Expected Text of Admin
		String expectedTextOfHomePage="Admin";
		System.out.println("The Expected Text Of Orange HRM HomePage is:- "+expectedTextOfHomePage);
		
		String actualTextOfHomePage=welcomeAdminElement.getText();
		System.out.println("The Actual Text Of Orange HRM Homepage is:- "+actualTextOfHomePage);
		
		if(actualTextOfHomePage.contains(expectedTextOfHomePage))
		{
			System.out.println("The Text Of Orange HRM HomePage is Matching-Pass");
		}
		else
		{
			System.out.println("The Text Of Orange HRM Homepage is Not Matching-Fail");
		}
		
		Thread.sleep(2000);
		
	    WebElement logOutElement=driver.findElementByLinkText("Logout");
		logOutElement.click();
		
		
		
		
		driver.close();
        
	
	}

}
