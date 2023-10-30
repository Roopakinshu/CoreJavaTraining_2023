package Javaprograms;

public class IQ_10_String_Reversal_Using_Array {

	public static void main(String[] args) {
		
		String str="Roopa";
		String rev="";
		char[] a= str.toCharArray();
		for (int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("Reversed String is:" +rev);
	}

}
