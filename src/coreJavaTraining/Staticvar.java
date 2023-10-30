package coreJavaTraining;

public class Staticvar {
	String name;
	String address; // instance variables-changes from object to object
	static int i; // static variables - shared among all ,last updated value will be assigned here
	static String city;
	static {
		 i=0;
		 city="Bangalore";
				
	}
	
	public Staticvar(String name,String address) //local variables
	{
		this.name=name;
		this.address=address;//assigning local variables to instance variables using this keyword
	}
	
	public void getAddress()
	{
		System.out.println(address);
		i++;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticvar sv= new Staticvar("Roopa","Amberpet");
		Staticvar sv1= new Staticvar("Krishna","Amberpet2");

		sv.getAddress();
		sv1.getAddress(); //instance variables changes from object to object 
		
	}

}
