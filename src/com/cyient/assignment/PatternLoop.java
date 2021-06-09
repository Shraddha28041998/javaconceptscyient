package com.cyient.assignment;

import java.util.Scanner;

public class PatternLoop {

	public static void main(String[] args) {
		int i,j;
		Scanner input= new Scanner(System.in);
        System.out.print("enter a lenth: " );
        int l = input.nextInt();
        System.out.print("enter a width: " );
        int w = input.nextInt();
		for(i=1;i<=l;i++)
		      {
			for(j=1;j<=w;j++)
				
			    {
	
		         if(i==1||j==1||j==w||i==l)
		          System.out.print("*");
		             else
	             System.out.print(" ");
	              }
		System.out.println(" ");
		   
		      }

	    }


}
