package coreJavaTraining;

public class StringBuilderex {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		StringBuilder sb1=new StringBuilder("Tim ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);
		

		StringBuilder sb2=new StringBuilder("Johnny");
		sb2.replace(1,3,"Java");  
		System.out.println(sb2);
		
		StringBuilder sb3=new StringBuilder("Twinkle");  
		sb3.delete(1,3);  
		System.out.println(sb3);
		
		
		StringBuilder sb4=new StringBuilder("Hello");  
		sb4.reverse();  
		System.out.println(sb4);
	}

}
