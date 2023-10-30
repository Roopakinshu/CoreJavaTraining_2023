package Javaprograms;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IQ_14_Split_String_Words {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		//using split
		
		String[] aftersplit=str.split(" ");
		for(String st1:aftersplit)
		{
			System.out.println(st1);
		}
			
		//Using string Tokenizer
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}

	}

}
