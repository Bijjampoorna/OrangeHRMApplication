package com.javaExamples;


//INTERFACE:-INTERFACE IS THE BLUEPRINT OF JAVA CLASS
	//IT IS SIMILAR TO ABSTRACTION
	// SHOULD USE 'interface' keyword to create class
	// inheritence is implemented using keyword 'implements'
	//object creation is not possible in interface
	//provides implementation in another class
interface Webdriver
{
	public void openApp();
	public void closeApp();
	
}
class FirefoxDriver implements Webdriver
{
	public void openApp()
	{
		System.out.println("Open FireFox");
	}
	public void closeApp()
	{
		System.out.println("Close FireFox");
	}
}

class ChromeDriver implements Webdriver
{
	public void openApp()
	{
		System.out.println("Open Chrome");
	}
	public void closeApp()
	{
		System.out.println("Close Chrome");
	}
}
public class Interface 
{
	
	public static void main(String[] args) 
	{
		/*
		FirefoxDriver ff=new FirefoxDriver();
		ff.openApp();
		ff.closeApp();
		
		ChromeDriver cd=new ChromeDriver();
		cd.openApp();
		cd.closeApp();
		*/
		
		//Creating a object for Webdriver(interface) indirectly with the help of available classes
		Webdriver driver=new FirefoxDriver();
		driver.openApp();
		driver.closeApp();
		Webdriver chDriver=new ChromeDriver();
		chDriver.openApp();
		chDriver.closeApp();
		
	}
	

	
}