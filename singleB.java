package com.java;

public class singleB extends singleA {
	
	private void studentLocation() {
		
		System.out.println("CBE");
		
	}

	public static void main(String[] args) {
		
		
		singleB s = new singleB();
		s.studentName();
		s.studentAge();
		s.studentID();
		s.studentLocation();
		
		//up casting
		
		singleA ss = new singleB();
		
		ss.studentName();
		ss.studentAge();
		ss.studentID();
	}
	}