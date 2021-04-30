package com.lwl.cj.day2;

import java.util.Scanner;

public class AvgAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st person weight");
		float num1 = sc.nextFloat();
		System.out.println("Enter 2nd person weight");
		float num2 = sc.nextFloat();
		System.out.println("Enter 3rd person weight");
		float num3 = sc.nextFloat();
		float sum = num1+num2+num3;
		float avg = sum/3;
		System.out.println("The sum of the 3 weights is "+ sum + " and the average weight is " +avg);
		sc.close();
	}
}