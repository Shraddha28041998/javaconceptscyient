package com.cyient.employee;

public class Employee {
	public int empNo;
	public String empName;
	public double empSalary;
	public static String companyName;

	public static void printEmployeeDetails(Employee emp) {
		System.out.println(emp.empNo);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(emp.companyName);
	}
}