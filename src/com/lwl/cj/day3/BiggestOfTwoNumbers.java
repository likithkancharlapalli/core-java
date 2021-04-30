package com.lwl.cj.day3;
import java.util.Scanner;
public class BiggestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		if (num1>num2) {
			System.out.println("The bigger number between "+num1+ " & "+num2+ " is " +num1);
		}
		else
			if (num1<num2) {
				System.out.println("The bigger number between "+num1+ " & "+num2+ " is " +num2);}
			else {
				System.out.println("The two numbers are equal");
			}
		sc.close();
	}
}
