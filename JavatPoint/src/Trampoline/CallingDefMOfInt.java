package Trampoline;

public class CallingDefMOfInt {
	
	public static void main(String args[])
	{
		Interjavaface jj=new DefInterDemo();
		jj.faster();
		jj.run();
	}
}


	class DefInterDemo implements Interjavaface

	{
		public void faster()
		{
			System.out.println("Faster ");
			
		}
		}


