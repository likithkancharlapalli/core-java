package com.lwl.cj.day3;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name= sc.nextLine();
		System.out.println("Number Grade: ");
		int score = sc.nextInt();
		String grade;
		if (score >= 0 && score <= 5) {
			grade = "C"; }
		else if (score >= 6 && score <= 8) {
			grade = "B"; }
		else if (score >= 9 && score <= 10) {
			grade = "A"; }
		else {
			grade = "Invaid Score";
		}
		System.out.println("Dear "+name+", Your score is: "+score+" and your grade is: "+grade);
		sc.close();
	}
}
