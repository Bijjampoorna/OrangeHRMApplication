package com.javaExamples;

public class DataTypes_Variables
{
	int b=20; //Instance variable
	static int empId=101; //Static variable
	
	public void mE1() //non-static method
	{
		int a=10; //local variable
	System.out.println(a+"-is an Local Variable");
	System.out.println(b+"-is an Instance Variable");	
	System.out.println("me1 is executed");	
	}
	
	public void mE2() //non-static method
	{
	System.out.println(b+"-is an Instance Variable");
	System.out.println(empId+"is an Static Variable");
	System.out.println("me2 is executed");	
	}
	
	public void mE3() //non-static method
	{
		System.out.println(empId+"is an Static Variable");
		System.out.println("me3 is executed");
	}
	 public static void st() //static method
	 {
		 System.out.println("static method is executed");
	 }
	
	public static void main(String[] args) 
	{
		//non static methods can be accesible with the help of creating a object
		DataTypes_Variables dt=new DataTypes_Variables();
		dt.mE1();
		dt.mE3();
		dt.mE2();
		//static variables can be accesible with the help of classname,no need of object
		DataTypes_Variables.st();
		
		
		System.out.println("program is executed");
		
		
	}
	
}
