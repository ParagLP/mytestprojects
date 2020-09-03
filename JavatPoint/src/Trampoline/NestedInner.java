package Trampoline;

import Trampoline.AInner.BInner;

public class NestedInner {

	public static void main(String[] args) {
	
		AInner a1=new AInner();
	     a1.display();
		AInner.BInner b1=a1.new BInner()
				{
			public  void display()
			{
				System.out.println("GM anonymous B");
			}		
				};
		b1.display();
		//AInner.BInner b2= new AInner.BInner();
	   //b2.display();	

	}

}

class AInner
{
	public void display()
	{
		System.out.println("GM A");
	}
	 class  BInner
	{
	public void display()
	{
		System.out.println("GM B");
	}
}
}