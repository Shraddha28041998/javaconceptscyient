package com.cyient.logics;

public class GradeTest {

	public static void main(String[] args) {
		
          int per=71;
        		  if(per>=90)
        		    {
        			  System.out.println("having A grade");
        		    }
        		  else if(per>=80 || per<=89)
        		  {
        			  System.out.println("having B grade");
        		  }
        		 else if(per>=60 || per<=79)
        		 {
        			 System.out.println("having c grade");
        		 }
        		 else if(per<=59 || per>=33)
        		 {
        			 System.out.println("having D grade");
        		 }
        		 else if(per<33)
        		 {
        			 System.out.println("fail");
        		 }
	}

}
