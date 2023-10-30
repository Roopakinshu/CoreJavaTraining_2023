package Javaprograms;

import java.util.Scanner;

public class IQ_12_Vowel_Consonant_Count {
	public static void main(String[] args) {

		int vowels = 0, consonants = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++)

		{
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

				++vowels;

			else if (ch >= 'a' && ch <= 'z')

				++consonants;

		}

		System.out.println("Number of Vowles	" + vowels);
		System.out.println("Number of Consonants	" + consonants);

	}


}
