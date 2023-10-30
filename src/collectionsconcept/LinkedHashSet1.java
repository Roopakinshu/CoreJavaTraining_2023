package collectionsconcept;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet();
		lh.add('r');
		lh.add("linked hash set");
		lh.add(1);
		lh.add('r');
		lh.add('r');
		lh.add(4.5);
		System.out.println(lh);//insertion order is preserved

	}
}
