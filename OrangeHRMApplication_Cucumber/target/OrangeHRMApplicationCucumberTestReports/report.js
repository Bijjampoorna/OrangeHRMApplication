$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrangeHRMFeatureFile.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRMAppplicationTesting",
  "description": "",
  "id": "orangehrmappplicationtesting",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "OrangeHRM Application Login Test",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 2558499400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 6686906900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 66903300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "duration": 733887200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "OrangeHRM Application Login Functionality Test",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Should enter the userName and Password and Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1380551700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 675911800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 48003400,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_userName_and_Password_and_Click_on_Login_Button()"
});
formatter.result({
  "duration": 6119918300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 55713800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "duration": 3253952500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "duration": 703767300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "OrangeHRM Application Login Functionality With Multiple Test Data",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Should enter the \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\" and Click on LoginButton",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 31,
      "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;1"
    },
    {
      "cells": [
        "Bijjampoorna",
        "Bijjampoorna12$"
      ],
      "line": 32,
      "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;2"
    },
    {
      "cells": [
        "bijjam",
        "bijjampoorna"
      ],
      "line": 33,
      "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;3"
    },
    {
      "cells": [
        "poorna",
        "poorna"
      ],
      "line": 34,
      "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "OrangeHRM Application Login Functionality With Multiple Test Data",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Should enter the \"Bijjampoorna\" and \"Bijjampoorna12$\" and Click on LoginButton",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1408769500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 634255300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 55826900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bijjampoorna",
      "offset": 23
    },
    {
      "val": "Bijjampoorna12$",
      "offset": 42
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_and_and_Click_on_LoginButton(String,String)"
});
formatter.result({
  "duration": 2028807600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 47975100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "duration": 3453081800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "duration": 679221000,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "OrangeHRM Application Login Functionality With Multiple Test Data",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Should enter the \"bijjam\" and \"bijjampoorna\" and Click on LoginButton",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1403048000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 616536600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 64937600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bijjam",
      "offset": 23
    },
    {
      "val": "bijjampoorna",
      "offset": 36
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_and_and_Click_on_LoginButton(String,String)"
});
formatter.result({
  "duration": 793372700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 10144482000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027MSI\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\BIJJAM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:13511}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 92f010514c747c27cf1e7839606bc2ef\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat stepDefinition.OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage(OrangeHRMApplicationMethods.java:101)\r\n\tat ✽.Then User Should Be Able To Navigate to Orange HRM HomePage(OrangeHRMFeatureFile.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 34,
  "name": "OrangeHRM Application Login Functionality With Multiple Test Data",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-login-functionality-with-multiple-test-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User Should enter the \"poorna\" and \"poorna\" and Click on LoginButton",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1404652900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 647763800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 43495000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "poorna",
      "offset": 23
    },
    {
      "val": "poorna",
      "offset": 36
    }
  ],
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_and_and_Click_on_LoginButton(String,String)"
});
formatter.result({
  "duration": 608662500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 10075280900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027MSI\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\BIJJAM~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:13532}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d942f360cb5bfd9f8638de39bb3fadd2\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat stepDefinition.OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage(OrangeHRMApplicationMethods.java:101)\r\n\tat ✽.Then User Should Be Able To Navigate to Orange HRM HomePage(OrangeHRMFeatureFile.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "OrangeHRM Application Add Employee Functionality Test",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-add-employee-functionality-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "User Should enter the userName and Password and Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "User Should Find And Click On Add Employee Button",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "User Should be Able To Navigate To Add Employee Page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User Should Enter FirstName and MiddleName and The LastName and click on Save button and Should Validate The Names Entered",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1750015900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 557024800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 50876700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_userName_and_Password_and_Click_on_Login_Button()"
});
formatter.result({
  "duration": 2019243900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 56321200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_And_Click_On_Add_Employee_Button()"
});
formatter.result({
  "duration": 3689343800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_be_Able_To_Navigate_To_Add_Employee_Page()"
});
formatter.result({
  "duration": 36321500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Enter_FirstName_and_MiddleName_and_The_LastName_and_click_on_Save_button_and_Should_Validate_The_Names_Entered()"
});
formatter.result({
  "duration": 4128388800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "duration": 3387556500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "duration": 770490000,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "OrangeHRM Application Employee List Validation Test",
  "description": "",
  "id": "orangehrmappplicationtesting;orangehrm-application-employee-list-validation-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User should open a browser in the system",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "User enters OrangeHRM Applicatiin URL Address",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "User should be able to navigate to the Orange HRM Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "User Should enter the userName and Password and Click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "User Should Be Able To Navigate to Orange HRM HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "User Should Find and Click on Employee list",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "User Should be able to navigate to Employee list page and Validate the page",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "User Should Find and Click on LogOut Button",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "user should close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_open_a_browser_in_the_system()"
});
formatter.result({
  "duration": 1439707600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_enters_OrangeHRM_Applicatiin_URL_Address()"
});
formatter.result({
  "duration": 510267000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_be_able_to_navigate_to_the_Orange_HRM_Login_Page()"
});
formatter.result({
  "duration": 43004800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_enter_the_userName_and_Password_and_Click_on_Login_Button()"
});
formatter.result({
  "duration": 2100918600,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Be_Able_To_Navigate_to_Orange_HRM_HomePage()"
});
formatter.result({
  "duration": 44657700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_Employee_list()"
});
formatter.result({
  "duration": 2697515000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_be_able_to_navigate_to_Employee_list_page_and_Validate_the_page()"
});
formatter.result({
  "duration": 2078113700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_Should_Find_and_Click_on_LogOut_Button()"
});
formatter.result({
  "duration": 3277363000,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRMApplicationMethods.user_should_close_the_application()"
});
formatter.result({
  "duration": 753212700,
  "status": "passed"
});
});