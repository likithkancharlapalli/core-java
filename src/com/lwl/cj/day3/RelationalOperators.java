package com.lwl.cj.day3;

import java.util.Scanner;

public class RelationalOperators {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter one number");
			int num1 = sc.nextInt();
			System.out.println("Enter another number");
			int num2 = sc.nextInt();
			System.out.println(num1+ "=="+num2+ ": " + (num1 == num2));
			System.out.println(num1+ ">"+num2 + ": " +(num1 > num2));
			System.out.println(num1+ "<"+num2 + ": " + (num1 < num2));
			System.out.println(num1+ ">="+num2 + ": " + (num1 >= num2));
			System.out.println(num1+ "<="+num2 + ": " + (num1 <= num2));
			System.out.println(num1+ "!="+num2 + ": " + (num1 != num2));
			sc.close();
		}
}
