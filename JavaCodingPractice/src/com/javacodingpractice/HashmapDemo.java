package com.javacodingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		Map<String,Integer> hmap=new HashMap<String,Integer>();
		
		hmap.put("Parag",12345);
		hmap.put("Parag1",54321);
		hmap.put("Parag2",125);
		
		
		
		//Set<String> st=hmap.keySet();
		
		Set<Map.Entry<String, Integer>> st1=hmap.entrySet();
		
		for(Map.Entry<String, Integer> s:st1)
		{
			System.out.println(s.getKey()+ "   "+s.getValue());
		}

	}

}
