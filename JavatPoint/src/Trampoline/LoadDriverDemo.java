package Trampoline;

public class LoadDriverDemo {

	public static void main(String[] args) throws ClassNotFoundException {
	
		Class.forName("PQR");

	}

}

class PQR
{
	static {System.out.println("In static block ");}
		
	{System.out.println("In Instance block");}
}