package com.javaExamples;

public class Encapsulation 
{
	//ENCAPSULATION:-COMBINING TWO OR MORE FUNCTIONALITIES INTO ONE SINGLE ENTITY
	
	
	private String name="Poorna"; //Datatype-function
	private int age=25;
	public void talk()//Method-function
	{
		System.out.println("The name is -"+name);
		System.out.println("The age is-"+age);
	}
	public static void main(String[] args)
	{
		Encapsulation en=new Encapsulation();
		en.talk();
	}
}
