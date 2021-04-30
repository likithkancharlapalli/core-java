package com.lwl.cj.day4;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i=1; i<=num; i++) {
			sum *=i;
		}
		System.out.println("The factorial of "+num+" numbers is "+sum);
		sc.close();
	}

}
