package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
	public static void main(String[] args) {
		
		List obj= new ArrayList();
		obj.add(1);   ///obj.add(Integer.valueOf(1));
		obj.add('a');
		obj.add("Rupa");
		obj.add(10.1);
		obj.add(4,'r');//add at 4th index
		obj.add(3,'p');
		System.out.println(obj.get(5));//to get data 
		//obj.remove("Rupa");//to remove data from array list
		System.out.println(obj.contains("rupa"));
		System.out.println(obj.contains("Rupa"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());

		System.out.println(obj);//object in strings and collections prints the content in the object
		//System.out.println(obj.toString());
		
		
		System.out.println("****************************************");
		
		for(Object all :obj)//since object class can hold any type of data.. and object class is parent class
		System.out.println(all);
			
		
		
		

	

}
}
