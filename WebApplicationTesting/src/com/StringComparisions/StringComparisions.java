package com.StringComparisions;

public class StringComparisions {
	public static void main(String[] args) {
		String stringdata="Livetech";
		System.out.println(stringdata);
		
		//Finding the Length of numbers of Characters in a String
		int stringdatalength=stringdata.length();
		System.out.println("the length of string variable="+stringdatalength);
		
		//converting the string to LowerCase
		 String stringdataconvertedtolowercase=stringdata.toLowerCase();
		 System.out.println("the variaable value after converting into lowercase="+stringdataconvertedtolowercase);
		 
		 //converting the String to UpperCase
		 String stringdataconvertedtouppercase=stringdata.toUpperCase();
		System.out.println("the variable after converting into uppercase is="+stringdataconvertedtouppercase);
		 
		String stringdata1="Livetech";
		String stringdata2="Livetech Technologies";
		
		//comparing the 2 strings whether they are equal or not using-equal method
		
		if(stringdata.equals(stringdata2))
		{
		   System.out.println("both strings are equal");
		}
		else
		{
			System.out.println("both strings are not equal");
		}
		
		String stringdata3="Livetech technologies";
		String stringdata4="Livetech TechnoLOgies";
		
		//comparing the 2 strings whether they are equal or not ignoring the case values using-equalsIgnorecase method
		
		if(stringdata3.equalsIgnoreCase(stringdata4))
		{
			System.out.println("both strings are matching");
			
		}
		else
		{
			System.out.println("both strings are not matching");
			
		}
		
		String stringdata5="Livetech technologies";
		String stringdata6="Livetech";
		
		//finding out the existence of a string value in another value using-contains method
		
		if(stringdata6.contains(stringdata5))
		{
			System.out.println("string existing");
		}
		else
		{
			System.out.println("both strings are not matching");
		}
		
		String stringdata7="Livetech technologies";
		String stringdata8="Livetech  tecnologies";
		
		//comparing 2 strings 
		
		if(stringdata7.equals(stringdata8))
		{
			System.out.println("both strings are matching");
		}
		else
		{
			System.out.println("both strings are not matching");
		}
		
		
		int charindexstringdata8=stringdata8.charAt(3);
		System.out.println(charindexstringdata8);//will return the ASCII value of the character at index 3
		
		System.out.println(stringdata8.charAt(3));//will return the value of the character at index 3
		
	}
}
