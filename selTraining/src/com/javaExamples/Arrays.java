package com.javaExamples;

public class Arrays 
{

	public void arraysEx()
	{
		int subMarks[]= {90,85,55,95,80};
		
		for(int a:subMarks)
		{
		System.out.println("The subject marks is-"+a);	
		}
		
	}
	
	public static void main(String[] args) 
	{
		Arrays ar=new Arrays();
		ar.arraysEx();
		
	}
}
