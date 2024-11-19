package com.java;

public class InterC implements InterA,InterB {

	@Override
	public void collegeName() {
		System.out.println("art and science");
		System.out.println("college");
		
	}

	@Override
	public void phone() {
		System.out.println("7412862174");
		System.out.println("9854151252");
	}

	@Override
	public void email() {
		System.out.println("123@gamil.com");
		System.out.println("4558@gamil.com");
		
	}

	@Override
	public void address() {
		System.out.println("coimbatore");
		System.out.println("Erode");
		
	}
	
	public static void main(String[] args) {
		
		InterC c = new InterC();
		c.collegeName();
		c.phone();
		c.address();
	}
		
	}

