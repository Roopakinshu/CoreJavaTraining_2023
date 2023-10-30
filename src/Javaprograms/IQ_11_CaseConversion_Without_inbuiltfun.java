package Javaprograms;

import java.util.Scanner;

public class IQ_11_CaseConversion_Without_inbuiltfun {

	public static void main(String[] args) {
		

		//Method2:
		//lower case -upper case-->c-32
		//uppercase -Lower case --->c+32
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			
			if(Character.isLowerCase(c))
			{
				char convertuppercase= (char)(c-32);
				sb.setCharAt(i,convertuppercase );
			}
			else {
				char convertLowercase= (char)(c+32);
				sb.setCharAt(i, convertLowercase);
			}
				
		
	}
  System.out.println(sb);
	}
}
