package com.javaExamples;

public class Methods
{
	public void mE1() 
	{
	System.out.println("me1 is executed");	
	}
	
	public void mE2() 
	{
	System.out.println("me2 is executed");	
	}
	
	public void mE3()
	{
		System.out.println("me3 is executed");
	}
	
	
	public static void main(String[] args) 
	{
	
		Methods me=new Methods();
		me.mE1();
		me.mE3();
		me.mE2();
		
		System.out.println("program is executed");
		
		
	}
}