package Javaprograms;

import java.util.Scanner;

public class IQ_11_Conversion_Lower_Upper_Viceversa {

	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	
	StringBuffer sb=new StringBuffer(str);
	
	for(int i=0;i<str.length();i++)
	{
		Character c=str.charAt(i);
		
		if(Character.isLowerCase(c))
		{
	        sb.setCharAt(i,Character.toUpperCase(c)); 
		}
		else 
		{
			 sb.setCharAt(i,Character.toLowerCase(c));
		}
	}
	System.out.println(sb);

	}

	
	
	
	
	
	
	
}
