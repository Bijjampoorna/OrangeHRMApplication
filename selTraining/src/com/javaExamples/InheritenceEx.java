package com.javaExamples;

class SingleInheritence 
{
	public void singleIn()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println("The mutliple of two values is-"+c);				
	}
}
public class InheritenceEx extends SingleInheritence
{

	public static void main(String[] args) 
	{
		InheritenceEx ie=new InheritenceEx();
		ie.singleIn();
	}
	
}

