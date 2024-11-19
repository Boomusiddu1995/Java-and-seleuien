package com.java;

public class selection_LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println("==selection statement==");
		
		int age =18;
		
		if(age>18) {
			System.out.println("==Eligible for vote==");
		} else if (age<18) {
			System.out.println("Not Eligible for vote");
		} else {
			System.out.println("Not Mentioned");
		}
		System.out.println("==Switch case==");
		
		int caseNo= 5;
		
		switch (caseNo) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thuresday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
		    System.out.println("Invalid day");
			break;
		}
	
		System.out.println("==LogicalOperator==");
		
		int amnt = 3;
		
		if(amnt >1 && amnt==100) {
			System.out.println("Debit limit");
		} else if (amnt>10||amnt <100) {
			System.out.println("credit limit");
		} else {
			System.out.println("Invalid amount");
		}
		
		
	}
}
