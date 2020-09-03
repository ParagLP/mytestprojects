package Trampoline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collect {

	public static void main(String[] args) {
		
		List<Integer> c1=new ArrayList<>();
		ArrayList<Double> a1=new ArrayList<>();
		
		
		
		
		a1.add(2.2);
		a1.add(3.5);
		
		for(Double i:a1)
		{
			System.out.println(i);
		}
		
		
		
		c1.add(5);
		//c1.add("Raju");
		//c1.add(7.8);
		c1.add(7);
		c1.add(3);
		c1.add(96);
		c1.add(10);
		
		Comparator<Integer> cmd= ( o1,  o2)->
		        {
				if(o1<o2)
					return 1;
				else 
				return -1;
			
				
				};

				Collections.sort(c1, cmd);
			
		
		for(Integer i:c1)
		{
			System.out.println(i);
		}
		
		

	}

}
