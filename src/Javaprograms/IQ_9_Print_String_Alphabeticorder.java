package Javaprograms;

public class IQ_9_Print_String_Alphabeticorder {
	public static void main(String[] args) {
		
		String str="roopa";
		char[] arr=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
	}
	
	

}
