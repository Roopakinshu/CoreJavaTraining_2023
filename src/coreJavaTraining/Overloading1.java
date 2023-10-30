package coreJavaTraining;

public class Overloading1 {
	
	//function overloading
	//either argument count should be different or 
	//argument data type should be different

	public void add(int a,int b)
	{
		int sum = a+b;
	   System.out.println("Sum of integers:" +sum);
	
	}

	public void add(float a,float b)
	{
		 float sum = a+b;
	   System.out.println("Sum of float numbers:" +sum);
	}
	public void add(int a,int b,int c)
	{
		int sum = a+b+c;
	   System.out.println("Sum of integers:" +sum);
	}
	
	public static void main(String[] args) {
		
		Overloading1 o1=new Overloading1();
		o1.add(5,6);
		o1.add(2, 3,4);
		o1.add(5.5f,2.5f);
	}
}
