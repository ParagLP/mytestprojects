package Trampoline;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		i=7;
		String s1="ramesh";
		s1="Reddy";
		System.out.println(i);
		System.out.println(s1);
		StringBuffer str=new StringBuffer("ParagPatil");
		
		System.out.println(str);
		str.append("PSI");
		str.replace(0,7,"Saj");
		str.delete(3, 6);
		System.out.println(str);
		
		

	}

}
