package Trampoline;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.*;
import java.util.List;


public class Serial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st1=new Student1();
		Student1 st2=new Student1();
		st1.setRoll(1);
        st1.setName("Parag");
        
        st2.setRoll(2);
        st2.setName("raj");
        
        List<String> ls1=new ArrayList<>();
        ls1.add("Mango");
        ls1.add("banana");
        
        for(String fruits:ls1)
        {
        	System.out.println(fruits);
        }
        	
        
        List<Student1> ls= new ArrayList<>();
        ls.add(st1);
        ls.add(st2);
        
      //  College1 c1=new College1();
      //  c1.setSs(ls);
        
        
        try {
			XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Mycollege2.xml")));
			
			x.writeObject(ls);
			x.close();
		}
        
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
		

	}

}
