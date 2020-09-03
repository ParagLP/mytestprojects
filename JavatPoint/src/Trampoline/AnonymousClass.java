package Trampoline;
interface Abcd
{
	public void read();
}

public class AnonymousClass {

	public static void main(String[] args) {
		
Abcd a1=new Abcd()
{
	public void read()
	{
		System.out.println("Welcome");
	}
	};
	
	a1.read();
	}
}
