package Trampoline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		

		
	List<Employee1> emp=new ArrayList<Employee1>();
	emp.add(new Employee1(1,"Mahesh",1000));
	emp.add(new Employee1(2,"Rahesh",2000));	
	emp.add(new Employee1(3,"Kahesh",500));
	
	
	
	
	//return s1.salary>s2.salary?-1: s1.salary<s2.salary?1:0;
	Collections.sort(emp);
	
	
	for(Employee1 i:emp)
	{
		System.out.println(i);
	}

}
}
class Employee1  implements Comparable<Employee1>
{
	
	
	int Id;
	String Ename;
	int salary;
	
	
	public Employee1(int id, String ename, int salary) {
		super();
		Id = id;
		Ename = ename;
		this.salary = salary;
	}
	

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.salary>o.salary?1: this.salary<o.salary?-1:0;
	}
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Ename=" + Ename + ", salary=" + salary + "]";
	}	
	
	
	
	
}

