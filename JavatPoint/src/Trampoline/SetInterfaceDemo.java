package Trampoline;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set<Integer> s1=new TreeSet<Integer>();
  s1.add(8);
  s1.add(9);
  s1.add(16);
  s1.add(8);
  
  for(Integer i:s1)
  {
	  System.out.println(i);
  }
  
	}

}
