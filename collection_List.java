package com.java;

import java.util.ArrayList;
import java.util.List;

public class collection_List {

	public static void main(String[] args) {
		
	    List<Integer> List = new ArrayList<>();
		
		System.out.println("==add==");
		List.add(12);
		List.add(34);
		List.add(83);
		List.add(20);
		List.add(6);
		System.out.println(List);
		
		System.out.println("==size==");
		System.out.println(List.size());
		
		System.out.println("==get==");
		System.out.println(List.get(2));
		
		System.out.println("==remove==");
		System.out.println(List.remove(3));
		
		System.out.println("==contains==");
		System.out.println(List.contains(10));

		System.out.println("==indexof==");
		System.out.println(List.indexOf(5));
		
		List<Integer> list1 = new ArrayList<>();
		
		System.out.println("==add==");
		
		List.add(13);
		List.add(34);
		List.add(84);

		List<Integer> list2 = new ArrayList<>();
		
		List.add(3);
		List.add(34);
		List.add(4);
		
	//	System.out.println("==addAll==");
	//	list1.addAll(list2);
	//	System.out.println(list1);
		
		System.out.println("==retainsAll==");
		list1.retainAll(list2);
		System.out.println(list1);
		
		System.out.println("==removeAll==");
		list1.removeAll(list2);
		System.out.println(list1);
		
	}
}
