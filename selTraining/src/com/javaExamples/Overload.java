package com.javaExamples;

public class Overload 
{
	//POLYMORPHISM:ONE NAME WITH MANY FORMSs
	//OVERLOAD:-HERE THE METHOD NAME WILL BE SAME BUT THE SIGNATURE WILL BE DIFFERENT
	//CAN BE IMPLEMENTED IN THE SAME CLASS

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) 
	{
		
		Overload ol=new Overload();
		ol.add(10, 50);
		ol.add(20, 30, 40);
		
	}
	
}
