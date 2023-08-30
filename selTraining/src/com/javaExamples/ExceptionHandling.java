package com.javaExamples;

public class ExceptionHandling
{

	public void exp_ExceptionHandling()
	{
		try //Try performs identifying for the errors in the program
		{
			int a;
			a=10/0;
			System.out.println("The value of a is-"+a);
		}
		//EXCEPTION:-EXCEPTION IS THE SUPERCLASS OF ALL THE PREDEFINED ERRORS IN JAVA
		catch (Exception e) //catch performs capturing the error and printing it
		{
			System.out.println(e);
		}
	}
	
	public void exp_ExceptionHandling1()
	{
		try 
		{
			
			int a[]= {10,20,30,40,50};
			System.out.println("The value of a is-"+a[12]);
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) 
	{
		ExceptionHandling eh=new ExceptionHandling();
		eh.exp_ExceptionHandling();
		eh.exp_ExceptionHandling1();
	}
	
	
}
