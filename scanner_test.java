package com.java;

import java.util.Scanner;

public class scanner_test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String nextLine = sc.nextLine();
		System.out.println("Enter a numeric");
		
		int nextInt = sc.nextInt();
		System.out.println(nextInt);
		
		System.out.println("Enter a decimal");
		
		float nextfloat = sc.nextFloat();
		System.out.println(nextfloat);
		
		System.out.println("next char");
		
		char chatAt = sc.next().charAt(5);
		System.out.println(chatAt);
		
	}
}
