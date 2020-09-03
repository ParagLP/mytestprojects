package Trampoline;

public interface StIm {
	//void add();
	
	default void sum1()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("subtraction");
	}

}

