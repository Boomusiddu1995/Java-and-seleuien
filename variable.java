package com.java;

public class variable {

	// class variable
	
	int a; // --> declaration
	int b= 20; // --> Initialization
	
	// Static variable
	
	static String name;
	
	// Local variable
	
	public void method() {
		
		short c = 224;
		System.out.println(c);

	}
	
	public static void main(String[] args) {
		
		variable v = new variable();
		v.method();
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(name);
	}
}
