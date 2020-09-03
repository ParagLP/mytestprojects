package Trampoline;

public class InnerClassDemo {

	public static void main(String[] args) {
		 Inner obj=new Inner()
				 
				 {
			 public void show()
			 {
			 System.out.println("India");
			 }
				 };
		Inner i=new Inner();
		i.show();
				 obj.show();
	}

}

class Inner 
{
	public void show()
	{
		System.out.println("Happy");
	}
}