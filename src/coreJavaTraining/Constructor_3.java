package coreJavaTraining;
public class Constructor_3 {

	public Constructor_3() {
		this(10); // this must be first statement of constructor 
	System.out.println("this is 0 argument constructor");
	}
	

	public Constructor_3(int a)
	{
		this(12,10);
		System.out.println("This is 1 argument constructor");
		
	}
	

	
	public Constructor_3(int a, int b)
	{
		System.out.println("this is 2 argument constructor");
		
	}
	
	public static void main(String[] args) {
		
		Constructor_3 c3= new Constructor_3();
	}
}