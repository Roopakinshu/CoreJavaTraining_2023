package coreJavaTraining;

public class MulArrayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find minium no in array and print the max no in the same column

			int abc[][]={{2,4,5},{3,2,10},{1,2,0}};
			int min=abc[0][0];
			int mincoloumn = 0;


			for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
			{
			if(abc[i][j]<min)//2
			{
			min=abc[i][j];
			mincoloumn=j;
			}
			}
			}
			//=1
			int max=abc[0][mincoloumn];
			int k = 0;
			while(k<3)
			{
			if(abc[k][mincoloumn]>max)
			{
			max=abc[k][mincoloumn];
			}
			k++;
			}

			System.out.println(max);
			}

			

	}


