package com.lwl.cj.day3;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		if (num1%2 == 0) {
			System.out.println("This number is Even. The remainder is 0");
		}
		else {
			System.out.println("This number is Odd. The remainder is "+ (num1%2));
		}
		sc.close();
	}
}
