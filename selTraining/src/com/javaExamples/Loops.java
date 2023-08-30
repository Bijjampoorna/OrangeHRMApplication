package com.javaExamples;

public class Loops 
{

	public void whileLoop()
	{
		int a=1;
		while(a<=10)//condition
		{
			System.out.println("java is very easy-"+a);//statements
			a++;//increment/decrement
		}
	
	}
	
	public void doWhileLoop()
	{
		int a=1;
		do
		{
			System.out.println("Selenium is very easy"+"-"+a);//statements
			a++;//increment/decrement
		}
		while(a<=10);	//condition	
	}
	
	public void forLoop()
	{
		//for(initilization;condition;increment/decrement)
		for(int a=1;a<=20;a=a+2)
		{
			System.out.println("The number is-"+a);
		}
	}
	
	public void forEachLoop()
	{
		String data[]= {"selenium","training","by","suresh"};
		
		for(String a:data)
		{
			System.out.println(a);
		}
		
		
	}
	public static void main(String[] args) 
	{
	
		Loops lo=new Loops();
		lo.whileLoop();
		lo.doWhileLoop();
		lo.forLoop();
		lo.forEachLoop();
	}
	
}