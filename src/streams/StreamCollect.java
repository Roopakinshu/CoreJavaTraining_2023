package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=Stream.of("Roopa","Deepa","Shilpa","Sai","Kinshu","Satyanarayana").
		filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		
		//print unique number from below array
		List<Integer>Values=Arrays.asList(3,2,2,7,5,1,9,7);
		Values.stream().distinct().forEach(s->System.out.println(s));
		//sort and print value in index 3
		System.out.println("*********************");
		List<Integer> li=Values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		}

}
