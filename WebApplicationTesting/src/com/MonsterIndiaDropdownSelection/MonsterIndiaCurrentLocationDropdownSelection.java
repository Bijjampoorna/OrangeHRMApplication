package com.MonsterIndiaDropdownSelection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonsterIndiaCurrentLocationDropdownSelection {
	
	
public static void main(String[] args) {
		
		WebDriver driver;
	String urlApplicationAddress="https://my.monsterindia.com/sponsered_popup.html";
			
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(urlApplicationAddress);
		driver.manage().window().maximize();
		
		
		WebElement currentLocationDropDown=driver.findElement(By.className("border_grey1"));


		Select selection = new Select(currentLocationDropDown);

		selection.selectByVisibleText("Bengaluru / Bangalore");
		selection.selectByIndex(3);
		selection.selectByValue("491");

		// id="id_industry" - propterty of Industry Element

		WebElement industryDropDown=driver.findElement(By.id("id_industry"));

		Select industrySelection = new Select(industryDropDown);

		industrySelection.selectByVisibleText("Automotive/Automobile/Ancillaries");
		industrySelection.selectByIndex(3);
		industrySelection.selectByValue("65");


		// De-Selection of Selected Optional Value of a DropDown

		industrySelection.deselectByIndex(1);
		industrySelection.deselectByVisibleText("Banking/Accounting/Financial Services");
		 industrySelection.deselectByValue("4");

		industrySelection.deselectAll();





		// <option value="1">Ahmedabad</option>
		// <option value="2">Bengaluru / Bangalore</option>
		// <option value="3">Chennai</option>
		/*
		
		List<WebElement>currentLocationDropDownCityNames=currentLocationDropDown.findElements(By.tagName("option"));

		int currentLocationDropDownCityNames_Count=currentLocationDropDownCityNames.size();

		for(int i=0;i<currentLocationDropDownCityNames_Count;i++)
		{
		String cityName=currentLocationDropDownCityNames.get(i).getText();
		System.out.println(i+" "+cityName);
		}
     */
		driver.quit();
		
		
}



}
