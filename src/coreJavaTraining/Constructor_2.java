package coreJavaTraining;


public class Constructor_2 {
	
	public Constructor_2() {
		System.out.println("This is zero argument constructor");
	}

	
	public Constructor_2(int a)
	{
		System.out.println("This is 1 argument constructor");
		
	}
	public Constructor_2(char a)
	{
		System.out.println("This is 1 argument constructor with char");
		
	}
	
	public Constructor_2(int a, int b)
	{
		System.out.println("this is 2 argument constructor");
		
	}
	public static void main(String[] args) {
		
		
		Constructor_2 c2= new Constructor_2('c');
		
	}
}
