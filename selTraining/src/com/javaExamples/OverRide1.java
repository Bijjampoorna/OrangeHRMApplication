package com.javaExamples;

public class OverRide1 extends OverRide//inheriting Override class Which is also the parent class
{
//OVERRIDE:- BOTH THE METHOD AND SIGNATURE SHOULD BE SAME 
	//SHOULD NEED TWO DIFFERENT CLASSES TO IMPLEMENT OVERRIDE
	public void add(int a,int b)//Here the child class is overriding the parent class
	{
		System.out.println(a-b);
		System.out.println("Child Class");
	}
	
	public static void main(String[] args)
	{
		OverRide1 or1=new OverRide1();
		or1.add(10,20);
	}

}
