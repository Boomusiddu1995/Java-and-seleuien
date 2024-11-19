package com.java;

public class Method_Overloading {

	//Data type
	
	private void studentDetails(String name) {
		
		System.out.println(name);
		
	}
	
	//Data type order
	
	private void studentDetails(int age, char gender) {

		System.out.println(age + "" + gender);
	}
	private void studentDetails(int age1) {
		
		System.out.println(age1);
	}
	
	//Data type count
	
	private void studentDetails(int a,int b,int c ) {
		
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.studentDetails(345);
		m.studentDetails("Boomu");
		m.studentDetails("Java");
		m.studentDetails(10, 20, 30);
		m.studentDetails(29, 'M');
		
	}
}
