package com.javacodingpractice;

public class PatternLogic {

	public static void main(String[] args)
	{
	String s="UNIX WIN32 SDK";
	String[] str=s.split(" ");
	
	char arr[]=s.toCharArray();
	
	for(int x=0;x<4;x++)
	{
		for(int y=0;y<=x;y++)
		{
			System.out.print(arr[y]);
		}
		System.out.println();
	}
	
	for(int x=5;x<10;x++)
	{
		for(int y=5;y<=x;y++)
		{
			System.out.print(arr[y]);
		}
		System.out.println();
	}
	
	
	
	for(int x=11;x<14;x++)
	{
		for(int y=11;y<=x;y++)
		{
			System.out.print(arr[y]);
		}
		System.out.println();
	}
	
	
	
	for(int m=1;m<=5;m++)
	{
		for(int n=m;n>0;n--)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	
	/*
	 * for(int i=0;i<str.length;i++) { System.out.println(str[i] +"  "+ i); }
	 */
	}

}
