package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks 
{

	public static WebDriver driver;
	
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\browserDriverFiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	public static void tearDown()
	{
		driver.close();
		
	}
	
	
}
