package Javaprograms;

import java.util.Scanner;

	public class IQ_1_String_Reversal_With_Palindrome {

		public static void main(String[] args) {

			String str;
			String rev = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("enter any string");
			str = sc.nextLine();

			int length = str.length();
			for (int i = length - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);

			}
			System.out.println(rev);
			
			
			if (str.equals(rev)) {
				System.out.println("string is palindrome");

			}

			else
				System.out.println("string is not palindrome");

		}
}
