package com.lwl.cj.day4;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nThe number of factors is "+count);
		if(count==2) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		sc.close();
	}
}
