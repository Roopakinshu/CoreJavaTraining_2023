package coreJavaTraining;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("Apple");
		sb1.replace(1,3,"Rupa");  
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Apple");
		sb2.delete(1,3);  
		System.out.println(sb2);

		StringBuffer sb3=new StringBuffer("Banana");  
		sb3.reverse();  
		System.out.println(sb3);
		
		
		
	}

}
