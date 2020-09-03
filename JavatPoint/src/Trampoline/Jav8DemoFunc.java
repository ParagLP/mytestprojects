package Trampoline;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Jav8DemoFunc {

	public static void main(String[] args) {
		List<Integer> ab=Arrays.asList(8,9,3,5,7);
	     
	
		Stream<Integer> s=ab.stream();
		
		
	/*	Stream<Integer> s1=s.map(new Function<Integer,Integer> ()
				{
					public Integer apply(Integer i)
					{
						return i*5;
					}
				}
				);
		*/
		Stream<Integer> s2=s.map(i -> i*3);
		
		//BinaryOperator<Integer> bo= i-> return i+j
			      
				
				
		
		      
		
	
		
		s2.forEach(System.out::println);
				

	}

}
