package com.java;

public class For_Loop {
	
	public static void main(String[] args) {
		
		System.out.println("==Forloop==");
		
		System.out.println("==Increament==");
		
		for (int i=1; i<=4;i++) {
		System.out.println(i);
		
	}
	
	System.out.println("==Decreament==");

	for( int i =5;i>=1;i--) {
		System.out.println(i);
	}
	
	System.out.println("==while==");
	int i = 1;
	while(i<=6) {
	  System.out.println(i);
	  i++;
	}
	
	System.out.println("== Do While loop==");
	int j=1;
	do {
		System.out.println(j);
		j++;
	} while (j<=6);
	
	System.out.println("==Nested For Loop==");
	
	for(int k=1;k<=2;k++) {   //==>outer Loop
		for(int l=1;l<=4;l++) {  //==>Inner Loop
			System.out.println(k+""+l);
		}
	}
	
	}
}
