package com.lwl.cj.day3;

import java.util.Scanner;

public class AbosluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		if(num1<0) {
			int num2 = num1*-1;
			System.out.println("The absolute value of "+num1+" is "+num2);}
		else {
		System.out.println("The absolute value of "+num1+" is "+num1);
		}
		sc.close();
	}
}
