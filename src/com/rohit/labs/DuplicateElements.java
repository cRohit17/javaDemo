package com.rohit.labs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/* find duplicate element from string array */

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[]= {"java", "javascript", "c", "c", "java"};
		
		//1. compare each element: O(n*n) --- worst solution
		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){
				
				if(names[i].equals(names[j])){
					System.out.println("duplicate element is:"+names[i]);
				}
			}
		}
		
		System.out.println("************");
		
		//2. using HashSet: Java Collection it stores unique values: O(n) --- ideal solution
		
		Set<String> store=new HashSet<String>();
		
		for(String name : names){
			if(store.add(name) == false){
				System.out.println("duplicate element is:"+name);
			}
		}
		
		System.out.println("************");
		
		//3. using HashMap: O(2n) --- best solution
		
		Map<String, Integer> storeMap=new HashMap<String, Integer>();
		
		for(String name: names){
			Integer count=storeMap.get(name);
			if(count == null){
				storeMap.put(name, 1);
			}
			else{
				storeMap.put(name, ++count);
			}
		}	
		
		//get the values from this HashMap:
		
		Set<Entry<String, Integer>> entrySet=storeMap.entrySet();
		for(Entry<String,Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is:"+entry.getKey());
			}
		}
		
}

}






