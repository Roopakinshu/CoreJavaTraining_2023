package streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class lambastreamsex {

		//COunt the number of names starting with alphabet A in list
		public void regular()
		{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}

		System.out.println(count);	
			
			
		}

	public void withStreams()
	{
		/*
		 * ArrayList<String> names1=new ArrayList<String>(); names1.add("Abhijeet");
		 * names1.add("Don"); names1.add("Alekhya"); names1.add("Adam");
		 * names1.add("Ram");
		 * 
		 * long d=names1.stream().filter(s->s.startsWith("A")).count();
		 */
		
		long d=Stream.of("Abhijeet","Alekya","Don","Adam","Ram").filter(s->s.startsWith("A")).count();
		//instead of storing data in collections and using stream, you can directly use streams to store data and perform operations 
		System.out.println(d);
	//there is no life for intermediate operation if there is no terminal (count) op
		//terminal op will execute only if inter op(filter) returns true
	}
	
	public void method2()
	{
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Abhijeet");
		names2.add("Don");
		names2.add("Alekhya");
		names2.add("Adam");
		names2.add("Ram");
		
		names2.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambastreamsex t1=new lambastreamsex();
		t1.regular();
		t1.withStreams();
		t1.method2();
	}

}
