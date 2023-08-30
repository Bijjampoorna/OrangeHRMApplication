package com.WebdriverExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
public class Tc_001_VerifyURL 
{
	public static void main(String[] args) throws InterruptedException
	{
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\bijja\\Desktop\\OrangeHRMApplication\\selTraining\\DriverFiles\\operadriver.exe");
		WebDriver operaDriver=new OperaDriver();
		
		driver.get(applicationUrlAddress);
		operaDriver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(1000);
		driver.close();
		operaDriver.close();
		
		
	}

}