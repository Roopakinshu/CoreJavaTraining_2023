package coreJavaTraining;

public class MinnoArray {

	public static void main(String[] args) {
	 int xy[][]= {{2,4,5},{3,4,7},{1,2,9}};
	 
	 int min=xy[0][0];
	 
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 if(xy[i][j]<min)
			 {
				min=xy[i][j];
				 System.out.println("Minimum no in matrix is:"+min);
			 }
		 }
	 }

	}

}
