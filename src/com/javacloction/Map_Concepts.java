package com.javacloction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Concepts {
	
	public static void main(String[] args) {
	
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "Naren");
		m.put(2, "Anu");
		m.put(3, "Edison");
		m.put(4, "Renu");
		m.put(5, "R");
		m.put(3, "Tcs");
		m.put(null, "Naren");
		m.put(8, null);
		m.put(9, null);
		System.out.println("Put Result:"+m);
		
		int size = m.size();
		
		System.out.println("Size Result:"+size);
	
		String string = m.get(5);
		
		System.out.println("Get Result:"+string);
		
		Set<Integer> keySet = m.keySet();
		System.out.println("keyset Result:"+keySet);
		
		Collection<String> values = m.values();
		System.out.println("Values Result:"+values);
		
		boolean containsKey = m.containsKey(10);
		System.out.println("Containskey result:"+containsKey);
		
		boolean containsValue = m.containsValue("Anu");
		System.out.println("ContainsValue result:"+containsValue);
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println("EntrySet Result:"+entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
			
		}
	
	
	
		
		
		
		
	}

}
