package Trampoline;
import java.io.*;

	public class PatternType {

		public static void main(String[] args) {
			
			int i=2,s=0,r;
			int t=i;
			
			while(i>0)
			{
				r=i%10;
				s=s+(r*r*r);
				i=i/10;
				
			}
			
		
			

				if(t==s)
			
					System.out.println("armstrong");
				else 
					System.out.println("not");
			}
		

	}