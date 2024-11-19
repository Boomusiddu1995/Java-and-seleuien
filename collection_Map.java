package com.java;

import java.util.HashMap;
import java.util.Map;

public class collection_Map {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();	
		
		System.out.println("==put==");
		map.put(1, "God");
		map.put(2, "Happy");
		map.put(3, "Life");
		map.put(4, "Relionship");
		System.out.println(map);
		
		System.out.println("==size==");
		System.out.println(map.size());
		
		System.out.println("==get==");
		System.out.println(map.get(3));
		
		System.out.println("===keyset==");
		System.out.println(map.keySet());
		
		System.out.println("==values==");
		System.out.println(map.values());
		
		System.out.println("==containskey==");
		System.out.println(map.containsKey(5));
		
		System.out.println("==containsValue==");
		System.out.println(map.containsValue("Relionship"));
		
	}

}
