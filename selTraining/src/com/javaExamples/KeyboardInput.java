package com.javaExamples;

import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

public class KeyboardInput
{

	public void scannerEx()
	{
		int a,b,c;
		System.out.println("Enter a,b Values");
		Scanner sc=new Scanner(System.in);//System.in is a predefined function to accept values from keyboard
		a=sc.nextInt();//nextint() is an predefined function which only accepts integer values
		b=sc.nextInt();
		c=a+b;
		System.out.println("The value of c is-"+c);
		
	}
	
	public void switchEx()
	{
		int a,b;
		System.out.println("Do Addition-1");
		System.out.println("Do Subraction-2");
		System.out.println("Do Multiply-3");
		System.out.println("Do Division-4");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A Value ");
		a=sc.nextInt();
		System.out.println("Enter B Value");
		b=sc.nextInt();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("The addition of two value is-"+(a+b));
				break;
			case 2:
				System.out.println("The subraction of two values is-"+(a-b));
				break;
			case 3:
				System.out.println("the multiplication of two values is-"+(a*b));
				break;
			case 4:
				System.out.println("The division of two values is-"+(a/b));
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
		
	}
	
	public void multipleTable()
	{
		int n,c;
		System.out.println("Enter the Number to display the multiplication table");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(c=1;c<=10;c++)
		{
			System.out.println(n+"*"+c+"="+(n*c));
		}
		
		
	}
	public static void main(String[] args) 
	{
		KeyboardInput ki=new KeyboardInput();
		//ki.scannerEx();
		//ki.switchEx();
		ki.multipleTable();
	}
}
