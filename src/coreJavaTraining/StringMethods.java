package coreJavaTraining;

public class StringMethods {

	public static void main(String[] args) {
		
		//String : it is one of the prebuilt class in java
		/* 1.String literal
		2.by creating object of string*/
		
		String  f= "Good Morning";//using literals
		String b=new String("Good Morning");
		
		String c="Good Morning"; //if we declare like this, java checks if it exists already in the string constant pool if yes it simply assigns to variable C and wont create new space
		
		String d=new String("Good Morning");// In this case java creates new object and assign this value.
		
		String a= " java training";//string 

		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("String concat doesnot work like this"));
		String h=a.concat("concat string explicitly");//The string a does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here
		System.out.println(h);
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("r");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("t", "s"));
		System.out.println(a.contains("java"));
		System.out.println(a.equals(b));//content comparision - evaluates the values in objects
		System.out.println(a.equals(c));
		System.out.println(b==d); // compares the address of objects
		System.out.println(f==c);
		System.out.println();
		
		//contains
		String myStr = "Hello";
		System.out.println(myStr.contains("Hel"));
		
		

	}

}
