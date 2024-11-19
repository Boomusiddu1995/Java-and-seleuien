package com.java;

import java.util.HashSet;
import java.util.Set;

public class collection_set {
	public static void main(String[] args) {
		Set<Integer> set =new HashSet<Integer>();
		
		System.out.println("==add==");
		set.add(47);
		set.add(94);
		set.add(78);
		set.add(88);
		set.add(90);
		set.add(68);
		System.out.println(set);
	System.out.println("==size==");
	System.out.println(set.size());
	
	System.out.println("==get==");
	System.out.println(set.getClass());
	
	System.out.println("==remove==");
	System.out.println(set.remove(3));
	
	System.out.println("==contain==");
	System.out.println(set.contains(4));
	
	Set<Integer> set1 =new HashSet<Integer>();
	System.out.println("==add==");
	set1.add(46);
	set1.add(99);
	set1.add(76);
	
	Set<Integer> set2 = new HashSet<Integer>();
	System.out.println("==add==");
	set2.add(89);
	set2.add(97);
	set2.add(67);
	System.out.println("==add All==");
	set.addAll(set2);
	System.out.println(set1);
	
	System.out.println("==retainaAll==");
	set.retainAll(set1);
	System.out.println(set1);
	
	System.out.println("==removeAll==");
	set1.remove(set2);
	System.out.println(set1);
	}

}
