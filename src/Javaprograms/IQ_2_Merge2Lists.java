package Javaprograms;

import java.util.ArrayList;

public class IQ_2_Merge2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
       ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(4);
        l2.add(5);
        l2.add(6);
       ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(l1);
        merge.addAll(l2);
System.out.println("L1 : "+l1);
System.out.println("L2 : "+l2);
System.out.println("Merged : "+merge);

}
}
