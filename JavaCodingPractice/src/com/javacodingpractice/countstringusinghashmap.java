package com.javacodingpractice;

import java.util.HashMap;

public class countstringusinghashmap {

	public static void main(String[] args) {
	
		String s1="Parag Patil is Parag";
		String[] str=s1.split(" ");
		
		HashMap<String,Integer> hmap=new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			if(hmap.containsKey(str[i]))
			{
				 int count = hmap.get(str[i]);
	                hmap.put(str[i], count+1);
			}
			else
			{
				hmap.put(str[i], 1);
			}
			
		}
		System.out.println(hmap);
    }
	}


