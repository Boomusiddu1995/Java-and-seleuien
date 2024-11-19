package com.java;

public class ReverseString {

	private static char charAt;
	
	public static void main(String[] args) {
		
		String s= "Java is a object class" ;
		
		System.out.println("-->length with space");
		System.out.println(s.length());
		
		System.out.println("-->lengthWithoutspace");
		String replace = s.replace("", "") ;
		System.out.println(replace.length());
		
		System.out.println("-->toGetStringCount");
	    String[] split = s.split("");
	    //split[0]= Java
	    //split[1]= is
	    //split[2]= a
	    //split[3]= object
	    //split[4]= class
	    System.out.println(split.length);
	    
	    System.out.println("-->ReverseString");
	    //output: ssalc tcejbo a si avaj
	    //0-10-->loop first loop
	    //10-0-->loop second loop
	
	    for(int i=s.length()-1;i>=0;i--) {
	    	System.out.print(s.charAt(i));
	    }
	    System.out.println();
	    
	    System.out.println("--> To get vowels and their counts");
	    int count=0;
	    
	    for (int i=0;i<replace.length()-1;i++) {
	    	char c=replace.charAt(i);
	    	if(c=='A'||c=='a'||
	    	   c=='E'||c=='e'||
	    	   c=='I'||c=='i'||
	    	   c=='O'||c=='o'||
	    	   c=='U'||c=='u') {
	    		System.out.println(c);
	             count++;
	    	}
	    }
	    System.out.println("vowles count:"+count);
	}
		
	}

