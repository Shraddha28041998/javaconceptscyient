package com.cyient.assignment;
import java.util.Scanner;

public class TwoInteger {

	public static void main(String[] args) {
		  int M,N;
		   Scanner input= new Scanner(System.in);
	        System.out.print("Enter M :");
	         M= input.nextInt();
	        System.out.print("Enter N :");
	         N= input.nextInt();
	       while(N!=0)
	        {
	            System.out.print(" ");
	            System.out.print(M-1);
	            M--;
	            N--;
	        }
	        
	}
}
