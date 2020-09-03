package Trampoline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompInter {
	
	public static void main(String args[])
	{

		List<Integer> values1=new ArrayList<>();
		values1.add(5);
		values1.add(2);
		values1.add(15);
		values1.add(1);
		values1.add(6);
		
		Comparator cc=new ComplComp();
		
		Collections.sort(values1,cc) ;
		
		for(Integer i:values1)
		{
			System.out.println(i);
		}
		
		
		
		
		
}
}