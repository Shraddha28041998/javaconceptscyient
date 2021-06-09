package com.cyient.assignment;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		int n=50,sum=0;
		for (int i =1; i<=n;i++)
		{
		   {
	        if (i%2 == 0)
		       {
	        	sum=sum+i;
			     System.out.println(" sum of even numbers" +sum);
		       }
		   }
			
		   if(sum%2==0) 
			   {
				 System.out.println("     even numbers" +sum);
			    }
			   else
			       {  
			       System.out.println("     odd numbers" +sum);
			        }
			    }
	   }

}