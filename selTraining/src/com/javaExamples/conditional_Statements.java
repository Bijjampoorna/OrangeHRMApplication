package com.javaExamples;

public class conditional_Statements
{

	public void ifStatement()
	{
		int studentMarks=80;
		
		if(studentMarks==80)
		{
			System.out.println("The student marks is-"+studentMarks);
		}
		
	}
	
	public void ifElseStatement()
	{
		int age=20;
		if(age<=20)
		{
			System.out.println("The age is-"+age);
			
		}
		else
		{
			System.out.println("the age is not matching");
		}
		
		if(age>=20)
		{
			System.out.println("eligible for Driver's License");
		}
		else
		{
			System.out.println("not eligible for Driver's License");
		}
		
		if(age>=20)
		{
			System.out.println("eligible to cast vote");
		}
		else
		{
			System.out.println("not eligible to cast vote");
		}
	}
	
	public void elseifStatement()
	{
		int stdmarks=92;
		
		if(stdmarks>90)
		{
			System.out.println("Student Grade is A");
		}
		else if(stdmarks>=80&&stdmarks>=90)
		{
			System.out.println("Student Grade is B");
		}
		else if(stdmarks>=70&&stdmarks>=80)
		{
			System.out.println("Student Grade is C");
		}
		else if(stdmarks>=60&&stdmarks>=70)
		{
			System.out.println("Student Grade is D");
		}
		else if(stdmarks>=50&&stdmarks>=60)
		{
			System.out.println("Student Grade is E");
		}
		else
		{
			System.out.println("Student is Failed");
		}
	}
	
	public void nestedifStatement()
	{
		int age=27;
		int salary=50000;
		if(age==27)
		{
			if(salary==50000)
			{
				System.out.println("Condition 2 is true");
			}
			else
			{
				System.out.println("Condition 2 is false");
			}
		}
		else
		{
			System.out.println("Condition 1 is false");
		}
		
	}
	public static void main(String[] args) 
	{
		conditional_Statements cs=new conditional_Statements();
		
		cs.ifStatement();
		cs.ifElseStatement();
		cs.elseifStatement();
		cs.nestedifStatement();
	}
	
}
