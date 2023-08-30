package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstRowOFFirstCellData extends BaseTest{
	
	@Test
	public void FirstRowOFFirstCellValue()
	{
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		String xPathExpression="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]";
		
		WebElement firstRowOFFirstCellElement=driver.findElement(By.xpath(xPathExpression));
		
		String cityName=firstRowOFFirstCellElement.getText();
		
		System.out.println("The City Name is:-"+cityName);
		
		
	}

}
