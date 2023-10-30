package Javaprograms;

import java.util.Scanner;

public class IQ_13_Replace_Vowels_Special_Char {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String str=sc.nextLine();
	char[] vowels= {'a','e','i','o','u'};
	for(char vow:vowels)
	{
		str=str.replace(vow,'#');
		
	}
		System.out.println("String after replacing vowels with special char : "+str);

	}

}
