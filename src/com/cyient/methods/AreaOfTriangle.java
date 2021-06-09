package com.cyient.methods;

public class AreaOfTriangle {

	 public static double areaOfTriangle(int b,int h)
	    {
	        double area= 0.5*b*h;
	        return area;
	    }
	    public static void main(String[] args) {
	        int b=3;
	        int h=8;
	        double result=AreaOfTriangle .areaOfTriangle(b,h);
	        System.out.println(result);

	 

	    }

	}


