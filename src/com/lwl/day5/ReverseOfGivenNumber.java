package com.lwl.day5;

import java.util.Scanner;

public class ReverseOfGivenNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num:");
			
			int num = sc.nextInt();
			int anum = num;
			int rev = 0;
			while(num != 0) {
				rev = rev * 10 + num %10;
				num /=10;
			}
			System.out.println("Reverse of "+anum+" "+rev);
			sc.close();
		}
}
