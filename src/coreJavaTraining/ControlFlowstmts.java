package coreJavaTraining;

public class ControlFlowstmts {

	public static void main(String[] args) {


		if (8>10)
			System.out.println("True"); // no backets needed if if has only 1 line of code
		else
			System.out.println("False");

		for(int i=0;i<5;i++)
		{
			if(i==4)
				System.out.println("you are printing 4");
			else
				System.out.println("Print some other value");
		}
		
		if(1<2)
		{
			System.out.println("Example of if with multiple lines");
			System.out.println("Print 1 is less than 2");
		}
		else
			System.out.println("if condition gets executed");
		int j=2;
		while(j<10)
		{
			System.out.println(j);
			j++; 
		}
		
		int c=10;
		do
		{
			System.out.println("print c values:" +c);
			c++;
		
		}
		while(c<20);
	
		
		
		
		
		
	}

}
