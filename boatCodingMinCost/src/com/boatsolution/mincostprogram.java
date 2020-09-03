package com.boatsolution;

import java.util.Arrays;
import java.util.Scanner;

public class mincostprogram{

	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner (System.in);
		int testcase_Number = sc.nextInt();
		int person_Count=0;
		long individual_Cost=0;
		
		for (int i=1 ; i<=testcase_Number ;i++)
		{
			
			do
			{
		    // Check to input persons number between range 1 and 100000
			person_Count= sc.nextInt();
			}while(person_Count<1 || person_Count>100000 );
			
			long costArr []=new long[person_Count];
			
			for (int k=0 ; k<person_Count ; k++ )
			{
			   do
			  {
					 // Check to input individual person cost between range 1 and 1000000
				individual_Cost=sc.nextLong();
			  }while(individual_Cost<1 || individual_Cost>1000000);
				
				
				costArr [k]=individual_Cost;
			}
		 
		 System.out.println(minimumCost(costArr,person_Count));	
		
		}
		

	}
	
	
	static long minimumCost(long costArr[], int person_Count) 
    { 
      
        // Sort the price array 
        Arrays.sort(costArr); 
          
        long totalCost = 0; 
      
        // Calcualte minimum price 
        // of n-2 most costly person 
        for (int i = person_Count - 1; i > 1; i -= 2) 
        { 
            if (i == 2) 
            { 
                totalCost += costArr[2] + costArr[0]; 
            } 
            else
            { 
      
                // Both the ways as discussed above 
                long p_first = costArr[i] + costArr[0] + 2 * costArr[1]; 
                long p_second = costArr[i] + costArr[i - 1] + 2 * costArr[0]; 
                totalCost += Math.min(p_first, p_second); 
            } 
        } 
      
        // Calculate the minimum price 
        // of the two cheapest person 
        if (person_Count == 1) 
        { 
            totalCost += costArr[0]; 
        } 
        else
        { 
            totalCost += costArr[1]; 
        } 
      
        return totalCost; 
    } 

}
