package Javaprograms;

import java.util.HashMap;
import java.util.Scanner;

public class IQ_6_Occurence_Of_Char_Instring {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		int count;

		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);

			if (h1.containsKey(c))

			{
				count = h1.get(c);
				h1.put(c, ++count);
			}

			else {
				h1.put(c, 1);

			}

		}

		System.out.println(h1);
	}

}
