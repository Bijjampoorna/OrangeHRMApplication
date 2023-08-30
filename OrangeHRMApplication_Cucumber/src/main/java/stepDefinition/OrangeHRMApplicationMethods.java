package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods 
{
	
	public OrangeHRMApplicationMethods(Hooks hook)
	{
		driver=hook.driver;
				
	}
	
	
	WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	@Given("^User should open a browser in the system$")
	public void user_should_open_a_browser_in_the_system()
	{
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^User enters OrangeHRM Applicatiin URL Address$")
	public void user_enters_OrangeHRM_Applicatiin_URL_Address()
	{
		 driver.get(applicationURLAddress);

	}

	@Then("^User should be able to navigate to the Orange HRM Login Page$")
	public void user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page() 
	{
		
		
		By loginPanelL=By.id("logInPanelHeading");   
		WebElement loginPanelElemnent=driver.findElement(loginPanelL);		
		String expectedOHRMApplicationLoginPageText="LOGIN Panel";
		String actualOHRMApplicationLoginPageText=loginPanelElemnent.getText();
		
		if(actualOHRMApplicationLoginPageText.equals(expectedOHRMApplicationLoginPageText))
		{
			System.out.println("Titles are Matching-PASS");
			
		}
		else
		{
		   System.out.println("Titles Are Not Macthing-FAIL");
			
		}
		
	}

	@Then("^user should close the application$")
	public void user_should_close_the_application()
	{
	    
		driver.quit();
	}

	
	@Then("^User Should enter the userName and Password and Click on Login Button$")
	public void user_Should_enter_the_userName_and_Password_and_Click_on_Login_Button() 
	{

		By userNameL=By.id("txtUsername");
		WebElement userNameElement=driver.findElement(userNameL);
		userNameElement.sendKeys("Bijjampoorna");
		
		
		By passwordL=By.id("txtPassword");
		WebElement passwordElement=driver.findElement(passwordL);
		passwordElement.sendKeys("Bijjampoorna12$");
		
		By loginButtonL=By.id("btnLogin");
		WebElement loginButtonElement=driver.findElement(loginButtonL);
		loginButtonElement.click();
		
	}

	@Then("^User Should Be Able To Navigate to Orange HRM HomePage$")
	public void user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage() 
	{
	   String  expectedTextOfHomePage="Welcome Admin";
		By welcomeAdminL=By.id("welcome");
		WebElement welcomeAdminElement=driver.findElement(welcomeAdminL);
		
		String actualTextOfHomePage=welcomeAdminElement.getText();
		
		if(actualTextOfHomePage.equals(expectedTextOfHomePage))
		{
			System.out.println("The Text of HomePage Is Matching-PASS");
			
		}
		else
		{
			
			System.out.println("The Text Of HomePage is Not Matching-Fail");
		
		}
		
	}

	@Then("^User Should Find and Click on LogOut Button$")
	public void user_Should_Find_and_Click_on_LogOut_Button() throws InterruptedException 
	{
	  
		By welcomeAdminElement=By.id("welcome");
		WebElement welcomeAdminL=driver.findElement(welcomeAdminElement);
		welcomeAdminL.click();
		Thread.sleep(2500);

		//PROPERTY OF LOGOUT ELEMENT
		By logOutElement=By.linkText("Logout");
		WebElement logOutL=driver.findElement(logOutElement);
		logOutL.click();
	
	}

//TESTING WITH MULTIPLE DATA
	
	@Then("^User Should enter the \"([^\"]*)\" and \"([^\"]*)\" and Click on LoginButton$")
	public void user_Should_enter_the_and_and_Click_on_LoginButton(String UserName, String Password) 
	{
		By userNameL=By.id("txtUsername");
		WebElement userNameElement=driver.findElement(userNameL);
		userNameElement.sendKeys(UserName);
		
		
		By passwordL=By.id("txtPassword");
		WebElement passwordElement=driver.findElement(passwordL);
		passwordElement.sendKeys(Password);
		
		By loginButtonL=By.id("btnLogin");
		WebElement loginButtonElement=driver.findElement(loginButtonL);
		loginButtonElement.click();
		
		
	}
	
//ADD EMPLOYEE FUNCTIONALITY	
	
	@Then("^User Should Find And Click On Add Employee Button$")
	public void user_Should_Find_And_Click_On_Add_Employee_Button() throws InterruptedException 
	{
		
		By pIMElementL=By.id("menu_pim_viewPimModule");
		WebElement menuPIM_Element=driver.findElement(pIMElementL);
		
		Actions act=new Actions(driver);
		act.moveToElement(menuPIM_Element).build().perform();
		Thread.sleep(2500);
		
//VALIDATING ADD EMPLOYEE PROPERTY
		
        By addEmployeeL=By.id("menu_pim_addEmployee");
		WebElement PIM_AddEmployeeElement=driver.findElement(addEmployeeL);
		PIM_AddEmployeeElement.click();
	}

	@Then("^User Should be Able To Navigate To Add Employee Page$")
	public void user_Should_be_Able_To_Navigate_To_Add_Employee_Page()
	{
		By addEmployeeTextL=By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1");
		WebElement addEmployeeTextElement=driver.findElement(addEmployeeTextL);
		String expectedOHRMApplicationAddEmployeeText="Add Employee";
		String actualOHRMApplicationAddEmployeeText=addEmployeeTextElement.getText();
		System.out.println("The actual EmployeeList Name is:- "+actualOHRMApplicationAddEmployeeText);
		
		if(actualOHRMApplicationAddEmployeeText.equals(expectedOHRMApplicationAddEmployeeText)) 
		{
		
			System.out.println("The Text IS Matching-PASS");
		}
		else
		{
			System.out.println("The Text is Not Matching-FAIL");
		}
	}

	@Then("^User Should Enter FirstName and MiddleName and The LastName and click on Save button and Should Validate The Names Entered$")
	public void user_Should_Enter_FirstName_and_MiddleName_and_The_LastName_and_click_on_Save_button_and_Should_Validate_The_Names_Entered() 
	{
	  
				//PROPERTY FIRST NAME
				
				By employeeFirstNameL=By.id("firstName");
				WebElement employee1FirstNameElement=driver.findElement(employeeFirstNameL);
				String expectedFirstName="Kate";
				employee1FirstNameElement.sendKeys(expectedFirstName);
				
		
		//PROPERTY MIDDLE NAME
				
				By employeeMiddleNameL=By.id("middleName");
				WebElement employee1MiddleNameElement=driver.findElement(employeeMiddleNameL);
				String expectedMiddleName="Elizibeth";
				employee1MiddleNameElement.sendKeys(expectedMiddleName); 
				
		//PROPERTY LAST NAME
				
				By employeeLastNameL=By.id("lastName");
				WebElement employee1LastNameElement=driver.findElement(employeeLastNameL);
				String expectedLastName="Winslet";
				employee1LastNameElement.sendKeys(expectedLastName);
				
				//PROPERTY SAVE BUTTON
				By addEmployeeSaveButtonL=By.id("btnSave");		
				 WebElement addEmployeeSaveButtonElement=driver.findElement(addEmployeeSaveButtonL);
			    addEmployeeSaveButtonElement.click();	
			    
			  //VALIDATING PERSONAL DETAILS PAGE		    
			    
			    String expectedPersonalDetailsPage="Personal Details";
			    System.out.println("The Expected Title of Personal Details Page is :-"+expectedPersonalDetailsPage);
		
			    By personalDetailsPageL=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1");
			    WebElement personalDetailsPageElement=driver.findElement(personalDetailsPageL);
			    String actualPersonalDetailsPage=personalDetailsPageElement.getText();
			    System.out.println("The Actual Title of Personal Details Page is :- "+actualPersonalDetailsPage);
		
			    if(actualPersonalDetailsPage.equals(expectedPersonalDetailsPage))
			    {
			    	String personalPagetestResult="Titles are Matching-PASS";
			    	System.out.println(personalPagetestResult);	
			    }
			    else
			    {
			    	String personalPagetestResult="Titles are Not Matching-FAIL";
			    	System.out.println(personalPagetestResult);	
			    }
			    
		//VALIDATING FIRST NAME
			    By actualFirstNameL=By.id("personal_txtEmpFirstName" );
			    WebElement actualFirstNameElemnt=driver.findElement(actualFirstNameL);
			    String actualFirstName=actualFirstNameElemnt.getAttribute("value");
			    System.out.println("The Actual First Name of Employee1 Is:-" +actualFirstName);
			   
			    if(actualFirstName.equals(expectedFirstName))
			    {
			        String FirstNameTestResult="First Names Are Matching-PASS";
			    	System.out.println(FirstNameTestResult);
			    }
			    else
			    {
			    	String FirstNameTestResult="First Names Are Not Matching-PASS";
			    	System.out.println(FirstNameTestResult);
			    }
		
		//VALIDATING MIDDLE NAME		    
			    By actualMiddleNameL=By.id("personal_txtEmpMiddleName");
			    WebElement actualMiddleNameElement=driver.findElement(actualMiddleNameL);	
			    String  actualMiddleName=actualMiddleNameElement.getAttribute("value");
			    System.out.println("The Actual Middle Name of Employee Is:-" +actualMiddleName);
			    
			    if(actualMiddleName.equals(expectedMiddleName))
		
			    {
			    	String MiddleNameTestResult="Middle Names Are Matching-PASS";
				    System.out.println(MiddleNameTestResult);
			    }
			    else
			    {
			    	String MiddleNameTestResult="Middle Names Are Not Matching-Fail";
				    System.out.println(MiddleNameTestResult);
			    }
			    	    
		//VALIDATING LAST NAME
			    By actualLastNameL=By.id("personal_txtEmpLastName" );
			    WebElement actualLastNameElement=driver.findElement(actualLastNameL);
		        String actualLastName=actualLastNameElement.getAttribute("value");
		        System.out.println("The Actual Last Name of Employee Is:-" +actualLastName);
		
		        if(actualLastName.equals(expectedLastName)) 
		        {
		        	String LastNameTestResult="Last Names Are Matching-PASS";
				    System.out.println(LastNameTestResult);
		        }
		        else
		        {
		        	String LastNameTestResult="Last Names Are Not Matching-PASS";
				    System.out.println(LastNameTestResult);
				    		
		        }
		        
	}
	
//VALIDATING THE EMPLOYEE LIST PAGE
	
	@Then("^User Should Find and Click on Employee list$")
	public void user_Should_Find_and_Click_on_Employee_list() 
	{
		//VALIDATING PIM ELEMENT PROPERTY
		
				By pIMElementL=By.id("menu_pim_viewPimModule");
				WebElement menuPIM_Element=driver.findElement(pIMElementL);
				
				Actions act=new Actions(driver);
				act.moveToElement(menuPIM_Element).build().perform();
				
		//VALIDATING ADD EMPLOYEE PROPERTY
		   //id="menu_pim_viewEmployeeList">Employee List</a>
		        By employeeListL=By.id("menu_pim_viewEmployeeList");
				WebElement PIM_EmployeeListElement=driver.findElement(employeeListL);
				PIM_EmployeeListElement.click();
			
		
	}

	@Then("^User Should be able to navigate to Employee list page and Validate the page$")
	public void user_Should_be_able_to_navigate_to_Employee_list_page_and_Validate_the_page() throws InterruptedException 
	{
		//IDENTIFYING THE EMPLOYEE LIST ELEMENT
     	
     	
	     	String expectedEmployeeListName="Employee Information";
	     	System.out.println("The expected Employee List Name is:- "+expectedEmployeeListName);
	     	
	     	///html/body/div[1]/div[3]/div[1]/div[1]/h1
	     
	       By employeeListL =By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1");
	      WebElement employeeListElement=driver.findElement(employeeListL);
	      Thread.sleep(2000);
	      String actualEmployeeListName=employeeListElement.getText();
	      System.out.println("The Actual employeeList is:-"+actualEmployeeListName);
	     
	       
	       if(actualEmployeeListName.equals(expectedEmployeeListName))
	       {
	    	   String employeeListTestResult="Both Names Are Matching-PASS";
	    	   System.out.println(employeeListTestResult);
	    	   
	       }
	       else
	       {
	    	   String employeeListTestResult="Both Names Are Not Matching-FAIL";
	    	   System.out.println(employeeListTestResult);
	    	  
	       }
    	   
		
	}

}
