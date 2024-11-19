package com.java;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		System.out.println("==Array values==");
		
		int a[]=new int [7] ;
		
		a[0]=95;
		a[1]=66;
		a[2]=86;
		a[3]=34;
		a[4]=36;
		a[5]=95;
		a[6]=00;
		
		System.out.println(a[5]);
		
		for(int i=0;i>=a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("==single dimentional Array");
		
		int b []= {1,2,3,4,5,6,7,8};
		for(int i:b) {
			System.out.println(i);
		}
		
		System.out.println("==Multi dimentional array==");
		
		int c[] []= {{9,5,6},{6,8,6},{3,4,3}} ;
		
		//output
		// 9 5 6
		// 6 8 6
		// 3 4 3
		
		for(int i=0; i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.println(c[i][j]+"");
			}
			System.out.println();
		}
	}

}
