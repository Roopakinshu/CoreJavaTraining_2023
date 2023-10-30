package streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
	//print names which ends with last letter as 'a' with Uppercase
	public void toUppercase()
	{
		//print names which ends with last letter as 'a' with Uppercase
		Stream.of("Roopa","Deepa","Shilpa","Sai","Kinshu","Satyanarayana").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which starts with uppercase a and sorted
		//Array.asList()-converts array to ArrayList
		System.out.println("*****************************");
		List<String> names=Arrays.asList("Azam","Abhinay","Akshay","Banana","Rama");
	 names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	}
	
	
	
	

	public static void main(String[] args) {
		
		StreamMap m1=new StreamMap();
		m1.toUppercase();

	}

}
