package com.cyient.assignment;

public class PatternSum {
public static void main(String[] args) {
			int i,n=5,tab=0;
			for(i=1;i<=30;i++) {
			   {
				tab=n*i;
				System.out.println(n+"*"+i+"="+tab);
                }
	        if(tab%2==0)
	         {
    	   System.out.println("      even numbers" +tab);
             }
    	   else {
    		   System.out.println("     odd numbers" +tab);
                }
			}
       }
	}

