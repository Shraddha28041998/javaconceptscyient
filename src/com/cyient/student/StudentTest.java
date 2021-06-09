package com.cyient.student;

public class StudentTest {

	public static void main(String[] args) {
		Students.schoolName="cyient";
		Students.schoolAddress="Manikonda";
        
		
		Students S1=new Students();
		S1.rollNo=1;
	    S1.studentName="shraddha";
		S1.studentMailid="shraddha@cyient.com";
		S1.studentAddress="nagpur";
		S1.studentPercentage=85;
		
		
		Students.printStudentsDetails(S1);
		

		Students S2=new Students();
		S2.rollNo=2;
		S2.studentName="shree";
		S2.studentMailid="shree@cyient.com";
		S2.studentAddress="hyderabad";
		S2.studentPercentage=80;
		
		Students.printStudentsDetails(S2);
		
	}

}
