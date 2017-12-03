package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;

public class CharacterCountWithMap {

	public CharacterCountWithMap() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) {
		
/*		String str = "abbbbceadefgaghijkac";
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1) ;
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map);
		
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
		
		Collection<Integer> values = map.values();
		Integer max = Collections.max(values);
		
	
		System.out.println("\n\nCharacters that ocurred the max times were : ");
		
		while(iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			if(entry.getValue() == max ) {
				System.out.println(entry.getKey() +"="+entry.getValue());
			}
		}
		*/
		
		
	/*	
		List<Integer> A= new ArrayList<Integer>();
		A.add(1);

		A.add(7);
		A.add(2);
		A.add(6);
		A.add(5);
		Integer n = 8;
		
		List<List<Integer>> finalList = new ArrayList<>();
		List<Integer> tempList = new ArrayList<>();
	    for (int i = 0; i < A.size(); i++) {
	    	for (int j = 0; j < A.size(); j++) {
	    		
	    		if(A.get(i) + A.get(j) == n) {
	    			tempList.add(A.get(i));
	    			tempList.add(A.get(j));
	    			
	    			finalList.add(tempList);
	    		}
	    		
	    		
	    	}
	    	
	    	
	    	
	    	
	   
	    	
	}
	    
	    tempList =finalList.get(0);
	    
	    for(int i=0;i<tempList.size();i++){
   		 
   		 for(int j=i+1;j<tempList.size();j++){
   		            if(tempList.get(i).equals(tempList.get(j))){
   		            	tempList.remove(j);
   		                j--;
   		            }
   		    }
		
	}  
	    System.out.println(tempList);
	    
	    */
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		
		System.out.println(a==b);
	    
	}
	

}
