package com.javacloction;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Iterator1 {
	
	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add("Naren");
		s.add("Edison");
		s.add(90);
		System.out.println(s);
		
	Iterator <Object> itr  = s.iterator();
	
	while(itr.hasNext()){
		
		Object next = itr.next();
		System.out.println("\n"+next);
	}
	for (Object object : s) {
		
		System.out.println("\n"+object);
		
	}
	
	
	
	}

}
