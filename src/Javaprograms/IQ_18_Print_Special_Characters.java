package Javaprograms;

import java.util.Scanner;

public class IQ_18_Print_Special_Characters {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.nextLine();
		
		int count=0;
		int i;
		char[] ch=str.toCharArray();
		for (i=0;i<ch.length;i++)
		{
			int j=(int)(ch[i]);
			if(!(j>=48 && j<=57)&&!(j>=65 && j<=90)&&!(j>=97 && j<=122)&& !(j==32))
			{
				count++;
				System.out.println(ch[i]);
	
			}
		}
		if(count==0)
		{
			System.out.println("String has no special characters");
		}
		else
		{
			System.out.println("String has"+" "+count+" "+"Special Characters");
		}
	}

}
