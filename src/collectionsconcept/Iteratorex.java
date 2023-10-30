package collectionsconcept;

import java.util.HashSet;
import java.util.Iterator;

public class Iteratorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Sai");
		hs.add("Roopa");
		hs.add("Harini");
		hs.add("Krishna");
		hs.add("Kinshu");
		hs.add("Vihaansh");
		hs.add("Sai");
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		Iterator it=hs.iterator(); //Iterator is Interface and iterator() is a method
		/*
		 * System.out.println(it.next());// prints first data in set
		 * System.out.println(it.next());
		 */
		System.out.println("*******************************************");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
