package coreJavaTraining;

public class ArraySiMul {
	public static void main(String[] args) {

	int a[] = new int[5]; // Traditional way ..Delcares an aray and allocates memory for the values
	a[0]= 2;
	a[1]=6;
	a[2]=1;
	a[3]=9;
	a[4]=12;//initilased values into that array
	

	int b[] = {1,4,3,5,7,8};//simple way of declaring array


for(int i=0;i<b.length;i++)
{
System.out.println("Print single dimension array:"+ b[i]);
  // retrieve values present in this array/
}

int c[][] = new int[2][3]; //traditional multi dimentional array 
c[0][0]=2;
c[0][1]=4;
c[0][2]=5;
c[1][0]=3;
c[1][1]=4;
c[1][2]=7;

int d[][]= {{2,4,5},{3,4,7}}; // simple way of multi dimentional array 


/*
 * for(int i=0;i<b.length;i++) {
 * 
 * System.out.println("Print multi dimentional Araay:"+c[i[]j]);
 * 
 * }
 */

for (int i=0;i<c.length;i++)
{
	for(int j=0;j<3;j++)
	{
		System.out.println("Print multidimentional array C: " +c[i][j]);
	}
}



	}

}
