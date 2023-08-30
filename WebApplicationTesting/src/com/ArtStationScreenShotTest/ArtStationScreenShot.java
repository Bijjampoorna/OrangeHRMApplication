package com.ArtStationScreenShotTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArtStationScreenShot {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver;
		String WebApplicationURLAddress="https://www.artstation.com/?sort_by=trending&dimension=3d";
		
		System.setProperty("webdriver.chrome.driver",".\\browserDriverFiles\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(WebApplicationURLAddress);
		Thread.sleep(5000);
		
		File artstationCapturedScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(artstationCapturedScreenShot,new File(".\\ApplicationScreenShots\\ArtStation.png"));
		
		
		
		driver.quit();
		
	}


}
