package coreJavaTraining;
public class InterstTypesinterfaceimplementation implements InterfaceLoans,NewLoan{
	
	public static void main(String[] args) {
		
		InterfaceLoans a=new InterstTypesinterfaceimplementation();
		a.carLoan();
		a.homeLoan();
		a.mortgageLoan();
		
		
		
		InterstTypesinterfaceimplementation im=new InterstTypesinterfaceimplementation();
		im.sampleLoan();
		im.newLoan();
	
		
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		System.out.println("Home Loan");
	}
	
	@Override
	public void carLoan() {
		// TODO Auto-generated method stub
		System.out.println("car Loan");
	}

	public void mortgageLoan() {
		// TODO Auto-generated method stub
		System.out.println("car Loan");
		
	}
	
	public void sampleLoan()
	{
		System.out.println("I am not imeplementation method of interface ");
	}

	@Override
	public void newLoan() {
		System.out.println("Multiple inheritance Implementation using Interface");
		
	}

}
