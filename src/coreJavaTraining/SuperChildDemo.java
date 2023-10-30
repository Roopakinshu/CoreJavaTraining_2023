package coreJavaTraining;

public class SuperChildDemo extends SuperParentDemo {
	
	String name="Krishna";
	
	public SuperChildDemo()
	{
		super();
		System.out.println("I am child class constructor");
	}

	public void getName()
	{
		super.getName();
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperChildDemo sc=new SuperChildDemo();
		sc.getName();
		
	}


}
