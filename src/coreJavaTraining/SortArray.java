package coreJavaTraining;

public class SortArray {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			     int a[]= {2,6,1,4,9};
			     int temp;
			     
			// 1,2,3,4,6, 9
			     
			     for(int i=0;i<5;i++)
			     {
			    for(int j=i+1;j<5;j++)
			    {
			    if(a[i] > a[j])
			    {
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			   
			    }
			    }
			     }
			for(int i=0;i<5;i++)
			{
			System.out.println(a[i]);
			}



			/* int a= 5; // swap using 3rd variable
			int b =4;
			/*int temp;
			temp=a;
			a=b;
			b=temp;
			System.out.println(a);
			System.out.println(b);
			// Swap with out variable

			a=a+b;  // a= 9
			b=a-b;  //b = 5
			a=a-b; // a= 4  */

			}

			

	}


