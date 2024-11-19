package com.java;

public class studentDetails {
	
	//default constructor
	
	studentDetails() {
		System.out.println("default constructor");
	}
	
	//Parameterized constructor
	
	studentDetails(String name) {
		this();
		System.out.println(name);
	}
	
	studentDetails(int age) {
		this("boomu");
		System.out.println(age);
	}
	
	studentDetails(char gender) {
		this(22);
		System.out.println(gender);
	
	}
	studentDetails(long id) {
		this('M');
		System.out.println(id);

	}

	public static void main(String[] args) throws Throwable {
		studentDetails s = new studentDetails();		
		studentDetails s1 = new studentDetails("boomu");
		studentDetails s2 = new studentDetails(28);
		studentDetails s3 = new studentDetails('M');
		studentDetails s4 = new studentDetails(2075125);
	    s.finalize();
	    s1.finalize();
	    s2.finalize();
	    s3.finalize();
	    s4.finalize();
	}
	
}
