package Javaprograms;

import java.io.*;
import java.util.*;

public class IQ_20_firstletter_case_convertion {

    public static void main(String[] args) {
    	
		/*
		 * Given two strings of lowercase English letters, String A and B, perform the following
		 * operations:
		 * 
		 * Sum the lengths of A and B. Determine if is lexicographically larger than (i.e.:B
		 * does come before A in the dictionary?). Capitalize the first letter in A and B and
		 * print them on a single line, separated by a space.
		 */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Print first String");
        String A=sc.next();
        System.out.println("Print first String");
        String B=sc.next();
        
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        /* Enter your code here. Print output to STDOUT. */
        
    System.out.println(A.substring(1));
       
       int compareresult=A.substring(0, 1).compareTo(B.substring(0, 1));
		if (compareresult < 0)/*
								 * Given two strings of lowercase English letters, and , perform the following
								 * operations:
								 * 
								 * Sum the lengths of and . Determine if is lexicographically larger than (i.e.:
								 * does come before in the dictionary?). Capitalize the first letter in and and
								 * print them on a single line, separated by a space.
								 */
       {
    	   System.out.println("No");
           System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
       }
       else
    	   System.out.println("Yes");
    }
}



