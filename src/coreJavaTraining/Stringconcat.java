package coreJavaTraining;

public class Stringconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m="Roopa";
		
		System.out.println(m.concat("Harini"));//RoopaHarini
		//The string m does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here i.e m=m.concat(Harini) concat works.. Sysout concts and prints but reference is still not changed 
		System.out.println(m);// Roopa 
		m=m.concat("Harini");
		System.out.println(m);//RopaHarini
		

		
		StringBuffer sb=new StringBuffer("Hello");  
		System.out.println(sb.append("Rupa"));//HelloRupa
		System.out.println(sb);//HelloRupa
		
		
		
	}

}
