package collectionsconcept;

import java.util.HashSet;

public class Hashset1 {
	public static void main(String[] args) {
		
		HashSet hs= new HashSet();
		hs.add('r');
		hs.add(1);
		hs.add("string");
		hs.add(1);
		hs.add(20);
		System.out.println(hs);//it will not accept duplicates, considers first occurs of duplicate, insertion order is not followed
		
		
		
		}

}
