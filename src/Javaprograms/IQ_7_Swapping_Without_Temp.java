package Javaprograms;

import java.util.Scanner;

public class IQ_7_Swapping_Without_Temp {
	public class IQ_9_Swapping_Without_Temp {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the any two variables");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + " " + b);

			a=a+b;  
			b=a-b; 
			a=a-b;
			
			System.out.println(a + " " + b);
		
			
		}
}
}