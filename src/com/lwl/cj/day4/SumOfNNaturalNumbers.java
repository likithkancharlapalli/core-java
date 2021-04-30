package com.lwl.cj.day4;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=N; i++) {
			sum +=i;
		}
		System.out.println("The sum of "+N+" numbers is "+sum);
		sc.close();
	}

}
