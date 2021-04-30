package com.lwl.cj.day2;
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empno :");
		String empno = sc.nextLine();
		System.out.println("Enter the salary :");
		float m_salary= sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		float y_salary = m_salary*12;
		System.out.println("Name          :"+name);
		System.out.println("Empno         :"+empno);
		System.out.println("Montly Salary :"+m_salary);
		System.out.println("Yearly Salary :"+y_salary);
		sc.close();
	}
}
