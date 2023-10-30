package Javaprograms;

	

	import java.util.LinkedHashSet;
	import java.util.Scanner;

public class IQ_5_Removal_Duplicates_in_string {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter any string");
			String str = sc.nextLine();

			StringBuilder sb = new StringBuilder();

			LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

			for(int i=0;i<str.length()-1;i++)
				
			{
				 lh.add(str.charAt(i));
				 
			}
			System.out.println(lh);
			for(char c:lh)
			{
				System.out.println(c);
				sb.append(c);
			}
			
			System.out.println(sb);
			
		}
		


	}


