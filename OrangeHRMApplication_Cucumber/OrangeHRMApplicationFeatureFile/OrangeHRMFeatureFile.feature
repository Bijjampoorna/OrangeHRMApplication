Feature: OrangeHRMAppplicationTesting
Scenario: OrangeHRM Application Login Test

Given User should open a browser in the system
When User enters OrangeHRM Applicatiin URL Address
Then User should be able to navigate to the Orange HRM Login Page
Then user should close the application

Scenario: OrangeHRM Application Login Functionality Test

Given User should open a browser in the system
When User enters OrangeHRM Applicatiin URL Address
Then User should be able to navigate to the Orange HRM Login Page
Then User Should enter the userName and Password and Click on Login Button
Then User Should Be Able To Navigate to Orange HRM HomePage 
Then User Should Find and Click on LogOut Button
Then user should close the application


Scenario Outline: OrangeHRM Application Login Functionality With Multiple Test Data

Given User should open a browser in the system
When User enters OrangeHRM Applicatiin URL Address
Then User should be able to navigate to the Orange HRM Login Page
Then User Should enter the "<UserName>" and "<Password>" and Click on LoginButton
Then User Should Be Able To Navigate to Orange HRM HomePage 
Then User Should Find and Click on LogOut Button
Then user should close the application

Examples:
|   UserName     |    Password     | 
|  Bijjampoorna  | Bijjampoorna12$ |
|  bijjam				 | bijjampoorna		 |
|  poorna				 | poorna          |  


Scenario: OrangeHRM Application Add Employee Functionality Test

Given User should open a browser in the system
When User enters OrangeHRM Applicatiin URL Address
Then User should be able to navigate to the Orange HRM Login Page
Then User Should enter the userName and Password and Click on Login Button
Then User Should Be Able To Navigate to Orange HRM HomePage
Then User Should Find And Click On Add Employee Button
Then User Should be Able To Navigate To Add Employee Page
Then User Should Enter FirstName and MiddleName and The LastName and click on Save button and Should Validate The Names Entered
Then User Should Find and Click on LogOut Button
Then user should close the application

@Sanity
Scenario: OrangeHRM Application Employee List Validation Test

Given User should open a browser in the system
When User enters OrangeHRM Applicatiin URL Address
Then User should be able to navigate to the Orange HRM Login Page
Then User Should enter the userName and Password and Click on Login Button
Then User Should Be Able To Navigate to Orange HRM HomePage
Then User Should Find and Click on Employee list 
Then User Should be able to navigate to Employee list page and Validate the page 
Then User Should Find and Click on LogOut Button
Then user should close the application


