package com.java;

import java.util.Spliterator;

public class String_Functions {

	public static void main(String[] args) {
		
		String s = "Java is an object class";
		
		System.out.println("==length==");
		
		int length = s.length();
		System.out.println(length);
		
		System.out.println("==touppercase==");
		String uppercase =s.toUpperCase();
		System.out.println(uppercase);
		
		System.out.println("==LoLowerCase==");
		String lowercase=s.toLowerCase();
		System.out.println(lowercase);
		
		System.out.println("==startwith==");
		boolean startwith = s.startsWith("j");
		System.out.println(startwith);
		
		System.out.println("==endWith==");
		boolean endwith = s.endsWith("s");
		System.out.println(endwith);
		
		System.out.println("==Indexof==");
		int indexof = s.indexOf("o");
		System.out.println(indexof);
		
		System.out.println("==charAt==");
		System.out.println(s.charAt(3));
		
		System.out.println("==contains==");
		System.out.println(s.contains("je"));
		
		System.out.println("==replace==");
		System.out.println(s.replace("object class","programming"));
		
		System.out.println("==split==");
		
		String[] split = s.split("   ");
		// split[0]= Java
		// split[1]= is
		// split[2]= a
		// split[3]= object
		// split[4]= class
		
		for(int i=0;i<=split.length -1 ;i++) {
		System.out.println(split[i]);
	}
	
	}
	
}
