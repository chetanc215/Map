package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Chetan");
		map.put(102, "Nayan");
		map.put(103, "Akash");
		
	/*	map.forEach((key,value)->
			System.out.println("Key: " +key+ " Value: " +value));
			*/
		
		Set<Entry<Integer, String>> set = map.entrySet();
	
		/*
		Iterator<Entry<Integer, String>> itr = set.iterator();
	
		while(itr.hasNext()) {
			
			Entry<Integer, String> entry = itr.next();
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue())	;
		*/
		
		for(Entry<Integer, String> entry : set) {
			
			System.out.println(entry.getKey()+ ": " +entry.getValue());
		
		}
		
		
	}
	
	

}
