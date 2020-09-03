package Trampoline;

class C 
{
	int count;
	public synchronized void count()
	{
		count++;
		System.out.println(count);
	}
	
}


class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("A Thread Printing");
		
		}
	}
	}

class B implements Runnable
{
	public void run()
	{    
		for(int i=1;i<=5;i++)
		{
		System.out.println("B Thread Printing");
		}
	}
	}



public class Multithreading {

	public static void main(String[] args)throws Exception {
		
		A a1=new A();
		B b1=new B();
		Thread r1=new Thread(a1);
		
		Thread r2=new Thread(b1);
		
		r1.start();
		r1.sleep(1000);
		
		r1.join();
		
		r2.start();
		r2.sleep(1000);
		r2.join();
		Thread t=new Thread(new Runnable()
				{
			    public void run()
			    {
			    	System.out.println("Hello");
			    }
				});
		t.start();
		t.join();
		System.out.println("Main Thread");

		
	}

}
