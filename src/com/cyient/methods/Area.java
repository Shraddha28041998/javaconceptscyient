package com.cyient.methods;

public class Area {



	 public double areaOfCircle(int radius)
	 {
	  double area=3.14*radius*radius;
        return area;
	   }
	 public static double areaofRectangle(int l,int w)
	    {double area=l*w;
	    return area;
	    }

	 public static double areaOfTriangle(int b,int h)
	 {  double area= 0.5*b*h;
     return area;
      }

	 public static double areaOfSquare(int s)
	 {  double area= s*s;
     return area;
      }
	 public static double areaOftrepezium(int a,int b,int h)
	 {  double area= (a+b)*(0.5)*h;
     return area;
      }
}