package com.javaExamples;

abstract class Bank
{
	abstract void debit();
	abstract void credit();
	
}
class HDFC extends Bank
{
	public void debit()
	{
		System.out.println("Amount Debited");
	}
	public void credit()
	{
		System.out.println("Amount Credited ");
	}
}

class ICICI extends Bank
{
	public void debit()
	{
		System.out.println("Amount Debited");
	}
	public void credit()
	{
		System.out.println("Amount Credited ");
	}
}

public class Abstraction 
{

	//ABSTRACTION-DATA HIDE
	
	//RULE 1:-USING THE KEYWORD OF abstract
	//RULE 2:-PROVIDING IMPLEMENTATION IN ANOTHER CLASS
	//RULE 3:-CREATION OF OBJECT WILL NOT BE POSSIBLE FOR ABSTRACT CLASS
	
	public static void main(String[] args)
	{
		HDFC hd=new HDFC();
		hd.credit();
		hd.debit();
		ICICI ic=new ICICI();
		ic.debit();
		ic.credit();
	}
}

