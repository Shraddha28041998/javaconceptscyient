package com.cyient.student;

public class Students {
 public int rollNo;
 public String studentName;
 public String studentMailid;
 public String studentAddress;
 public double studentPercentage;
 public static String schoolAddress;
 public static String schoolName;
 

 
 
 public static void printStudentsDetails(Students s)
 {
	System.out.println("                         ");
	System.out.println("student rollNo:"+s.rollNo);
	System.out.println("student Name:"+s.studentName);
	System.out.println("student mailid:"+s.studentMailid);
	System.out.println("student address:"+s.studentAddress);
	System.out.println("student percentage"+s.studentPercentage);
	System.out.println("school address:"+Students.schoolAddress);
	System.out.println("school Name:"+Students.schoolName);
	System.out.println("                          ");
 }
 
}
