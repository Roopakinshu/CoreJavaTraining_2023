package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeStreams {
	
	public void mergeStreams()
	{
		//Merging 2 different lists
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Abhijeet");
		names2.add("Don");
		
		
		List<String> names3=Arrays.asList("Azam","Rama");
		
		Stream<String> newstream=Stream.concat(names2.stream(),names3.stream());
		newstream.sorted().forEach(s->System.out.println(s));
		
	}
	
	public void ignoreCase()
	{
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Abhijeet");
		names2.add("Don");
		
		
		List<String> names3=Arrays.asList("Azam","Rama");
		
		Stream<String> newstream=Stream.concat(names2.stream(),names3.stream());
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStreams ms=new MergeStreams();
		ms.mergeStreams();
	}

}
