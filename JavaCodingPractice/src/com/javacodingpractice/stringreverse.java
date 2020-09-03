package com.javacodingpractice;

public class stringreverse {

	public static void main(String[] args) 
	
	{
	String s1=new String("Parag Patil");
	
	char arr1[]=s1.toCharArray();
	char arr2[]=new char[20];
	int j=0;
	for(int i=arr1.length-1;i>=0;i--)
	{
		
		arr2[j]=arr1[i];
		j++;
	}
	
	for(char c:arr2)
	{
		System.out.print(c);
	}
	
	}

}
