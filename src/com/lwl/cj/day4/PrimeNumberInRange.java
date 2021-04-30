package com.lwl.cj.day4;

import java.util.Scanner;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int num2 = sc.nextInt();
		for(int l=num1; l<=num2;l++) {
			int num = l;
			boolean isPrime = true;
			for(int i = 2; i<=num/2; i++) {
				if(num%i ==0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num+ " ");
			}
		}
		sc.close();
	}
}
