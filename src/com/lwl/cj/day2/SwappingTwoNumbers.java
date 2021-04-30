package com.lwl.cj.day2;

import java.util.Scanner;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number");
		int num1 = sc.nextInt();
		System.out.println("Enter another number");
		int num2 = sc.nextInt();
		System.out.println("Before swap num1 = "+num1+" and num2 = "+num2);
		/*int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap num1 = "+num1+" and num2 = "+temp);*/
		// Without Temp Variable
		num1 = num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swap num1 = "+num1+" and num2 = "+num2);

		sc.close();
}
}