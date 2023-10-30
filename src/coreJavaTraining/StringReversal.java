package coreJavaTraining;

public class StringReversal {

	public static void main(String[] args) {
		
		String s="Malayalam";
		String t="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		
		System.out.println("Reverse of String is:" +t);
		
		if(s.equals(t));
		System.out.println("String is 2 palindrome");
			

	}

}
