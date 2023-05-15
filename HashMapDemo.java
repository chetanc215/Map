package com.map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Chetan", 100000));
		list.add(new Employee(102, "Nayan", 50000));
		
		System.out.println(list.get(0).getSalary());
	
	}

}
