package com.java;

public class Abstract_ClassA extends Abstract_Class {

	@Override
	public void sign() {
		System.out.println("boomusiddu");
		
	}

	@Override
	public void password() {
		System.out.println("781562");
		
	}
	
	public static void main(String[] args) {
		
		Abstract_ClassA a = new Abstract_ClassA();
		
		a.sign();
		a.password();
		
	}

}
