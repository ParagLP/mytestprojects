package Trampoline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3);
		List<Integer> arr=Arrays.asList(5,6,7);
		List <Object> obj=new ArrayList<>();
		obj.add(1);
		obj.add("Parag");
		obj.add(4.9);
		
		
		obj.forEach(i->System.out.println(i));
		
		for(Integer i:arr)
		{
			System.out.println(i);
		}
		
		li.forEach( System.out::println);//call by method reference instead of Lambda

	}

}
