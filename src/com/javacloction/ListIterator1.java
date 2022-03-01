package com.javacloction;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		List<Object> li = new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add("Naren");
		li.add("Anu");
		System.out.println(li);
		
		ListIterator<Object> list = li.listIterator();
		
		while (list.hasNext()) {
			
			Object next = list.next();
			System.out.println(next);
			
		}
		
		while (list.hasPrevious()) {
			
			Object previous = list.previous();
			System.out.println(previous);
		}
		
	}
	
	
}
