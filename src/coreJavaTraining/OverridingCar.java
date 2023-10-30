package coreJavaTraining;

public class OverridingCar extends OverridingVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingCar c1=new OverridingCar();
		c1.brakes();
		c1.engine();

		OverridingVehicle c2=new OverridingVehicle();
		c2.brakes();
		c2.engine();
		
		OverridingVehicle c3=new OverridingCar();
		c3.brakes();
		c3.engine();
	}
	
	public void engine()
	{
		System.out.println("car engine has to be more advanced");
	}

	public void brakes()
	{
		System.out.println("Car Brakes are advanced");
	}
}
