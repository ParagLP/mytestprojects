package Trampoline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomComp {

	public static void main(String[] args) {
		
	List<Employee> emp=new ArrayList<Employee>();
	emp.add(new Employee(1,"Mahesh",1000));
	emp.add(new Employee(2,"Rahesh",2000));	
	emp.add(new Employee(3,"Kahesh",500));
	
	Collections.sort(emp,( s1, s2) ->
	{
	
	return s1.salary>s2.salary?-1: s1.salary<s2.salary?1:0;
	});
	
	
	for(Employee i:emp)
	{
		System.out.println(i);
	}

}
}
 class Employee
{
	
	int Id;
	String Ename;
	int salary;
	public Employee(int id, String ename, int salary) {
		super();
		Id = id;
		Ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Ename=" + Ename + ", salary=" + salary + "]";
	}	

	
	
	
	
	
}
