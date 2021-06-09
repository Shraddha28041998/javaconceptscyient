package com.cyient.assignment;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner number = new Scanner(System.in);
	        System.out.println("enter a Number: " );
	        int n = number.nextInt();
	        
	        for( i=1;i<=n;i++){
	            if(i%2 != 0)
	            {
	        System.out.println("odd number is "+i);
	        sum=sum+i;
	            }
	        }
	              
	            
	            
              System.out.println("sum of odd number is "+sum);
	            
	}
}