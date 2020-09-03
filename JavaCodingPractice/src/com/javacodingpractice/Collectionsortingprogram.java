package com.javacodingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
private int rollno;
private String sname;
private int marks;


public Student(int rollno, String sname, int marks) {
	
	this.rollno = rollno;
	this.sname = sname;
	this.marks = marks;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public int compareTo(Student o) {
	int comparemarks= o.getMarks();
	
	return this.marks-comparemarks; 
			
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", sname=" + sname + ", marks=" + marks + "]";
}






}


public class Collectionsortingprogram
{
	public static void main(String args[])
	{
		Student s1=new Student(1,"Parag",50);
		Student s2=new Student(2,"Raj",90);
		Student s3=new Student(3,"Ram",80);
		
		List<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		Collections.sort(student);
		
		
		for(Student str: student)
		{
			System.out.println(str);
		
		}
		
	}
	

}
