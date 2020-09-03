package Trampoline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Demo {

	public static void main(String[] args) {
		
	List<Integer> ab=Arrays.asList(1,2,3,4,5);
	
     ab.forEach(Java8Demo::dance);
     
     //Stream s=ab.stream();
     
	}

	
	public static void dance(Integer i)
	{
		System.out.println(i*3);
	}
}
