package com.javaExamples;

class A //parent class
{
	int a=10;
	int b=20;
	int c;
	public void m1()
	{
		System.out.println("m1 Executed");
	}
}
class B extends A //Here B class is inheriting Methods From A class
{
	int x=50;
	int y=60;
	int z;
	public void m2()
	{
		c=a+b;
		System.out.println("The Value of c is-"+c);
	}
	
}
class C extends B //Here C class is inheriting Methods from B class And A class As B class Already Inherited A class 
{				 //Here B Inherited From A Class Therefore B Becomes Base class for new class
	public void m3()
	{
		c=a*b;
		z=x+y;
		System.out.println("The value of c is-"+c);
		System.out.println("The value of z is-"+z);
	}
}	
public class MultipleInheritence  extends C
{
	public static void main(String[] args)
	{
		MultipleInheritence me=new MultipleInheritence();
		me.m1();
		me.m2();
		me.m3();
	}
}
	

