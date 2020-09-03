package Trampoline;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> mp=new HashMap<>();
		mp.put("Parag", "8149228504");
		mp.put("Laxman", "8149228505");
		mp.put("Sunanda", "8149228584");
		mp.put("Parag", "8149228504");
		
		//Set<String> s=mp.keySet();
		
		/*for(String i: s)
		{
			System.out.println(i +":"+mp.get(i));
		}*/
		
		Set<Map.Entry<String, String>> s1=mp.entrySet();
		
		for(Map.Entry<String,String> e:s1 )
		{
			System.out.println(e.getKey()+"::"+ e.getValue());
		}
	}

}
