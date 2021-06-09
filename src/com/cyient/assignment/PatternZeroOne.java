package com.cyient.assignment;

import java.util.Scanner;

public class PatternZeroOne {

	public static void main(String[] args) {
		int i,j;
		Scanner input= new Scanner(System.in);
        System.out.println("enter a number: " );
        int n = input.nextInt();
        for ( i = 1; i <= n; i++) 
        {
            for ( j = 1; j <= i; j++)
            {
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(0);
               }
              
            System.out.println();
        }
	}
}
