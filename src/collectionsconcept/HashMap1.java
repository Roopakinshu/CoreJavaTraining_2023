package collectionsconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "he");
		hm.put(2, "hel");
		hm.put(3, "hallow");
		hm.put(4, "hellos");
		hm.put(5, "hat");
		hm.put(6, "hat");
		System.out.println(hm);
		System.out.println(hm.get(4));
		System.out.println(hm.remove(4));
		System.out.println("************************************");
		Set sn = hm.entrySet();// we are converting the map to set now and storing key value pair in set
								// .entrySet() is the position in the map
		Iterator it = sn.iterator();// we are iterating set here
		System.out.println("************************************");
		/*
		 * while (it.hasNext()) {
		 * 
		 * System.out.println(it.next());
		 * 
		 * }
		 */
		while (it.hasNext()) {
			
			 Map.Entry mp=(Map.Entry)it.next();//instead of printing Key and value together to print them separalty we use Map.Entry which splits key and value in Set 
			 System.out.println(mp.getKey()); 
			 System.out.println(mp.getValue());
		}
			 
		}
	}


