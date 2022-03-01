package com.javacloction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		List<Object>  l = new ArrayList<>();
		
		l.add(10);
		l.add(15);
		l.add("Naren");
		l.add(25);
		l.add('N');
		l.add(155.6);
		l.add(90);
		l.add("Naren"); //duplicate value
		
		System.out.println(l);
		
		//insert method
		l.add(3, 100);
		
		System.out.println(l);
		
		int size = l.size();
		// size
		System.out.println(size);
		
		// Get method
		Object object = l.get(8);
	    System.out.println(object);
	    
	    // replace method
	    l.set(3,"anu");
	    System.out.println(l);
	   
	    // Remove
	    
	    l.remove(5);
	    System.out.println(l);
	    
	    // index 
	    int indexof = l.indexOf(90);
	    System.out.println(indexof);
	    
	    // last index 
	    int lastindexof = l.lastIndexOf("Naren");
	    System.out.println(lastindexof);
	    
	    // contains
	    boolean contains =l.contains("Naren");
	    System.out.println(contains);
	    
	    // clear
	    
	//    l.clear();
	//    System.out.println(l);
	    
	   // ADD ALL
	    
	    List<Object> li = new LinkedList<>();
	    
	    li.add(60);
	    li.add("JAVA");
	    li.add(33);
	    li.add('o');
	    li.add(100);
	    System.out.println(li);
	    
	 //   l.addAll(li);
	  //  System.out.println(l);
	    
	    // RETAINALL
	    
	  //  l.retainAll(l);
	  //  System.out.println(li);
	    
	    l.removeAll(li);
	    
	    System.out.println(l);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
	
}
