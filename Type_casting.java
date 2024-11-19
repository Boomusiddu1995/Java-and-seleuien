package com.java;

public class Type_casting {
	
	public static void main(String[] args) {
		
		System.out.println("==widening==");
		
		byte a =10;
		int b= a;
		long c =b;
	    System.out.println(c);
		
		
		System.out.println("==Narrowing==");
		
		int d=15;
		short e = (short) d;
		byte f = (byte) e;
		System.out.println(f);				
	}

}
