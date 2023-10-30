 package coreJavaTraining;

public class Firstclass {

	static int a=10;
	
	public String Name()
	{
		System.out.println("print ABCDE");
		return "ABCDEFG";// if you are returning anything return type of methos shouldnt be void
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);// error throws if a is not declared as static
		
		Firstclass f1=new Firstclass();
		System.out.println(f1.a);// can call static variables with object as well
		f1.Name();
		
		SecondClass sn=new SecondClass(); //object of other class can be created within current class if class is public and call method if it is public
		sn.second();
	 
	}

}
