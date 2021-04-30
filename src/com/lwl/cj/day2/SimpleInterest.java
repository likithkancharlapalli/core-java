package com.lwl.cj.day2;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Principal Amount: ");
			float p = sc.nextFloat();
			System.out.println("Enter the Rate of Interest: ");
			float r = sc.nextFloat();
			System.out.println("Enter the Time(Years): ");
			float t = sc.nextFloat();
			float intrest = (p*t*r)/100;
			System.out.println("Simple interest is: "+intrest);
			sc.close();
		}
}
