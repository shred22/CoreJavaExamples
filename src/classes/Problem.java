package classes;

import java.util.ArrayList;
import java.util.List;

public class Problem {
	List<List<Integer>> twoSum(List<Integer> A, Integer n) {
		// TODO: Implement this function
		
					
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		List<Integer> tempList = new ArrayList<Integer>();
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
          
	   finalList.add(tempList);
     
		
	}  
	    return finalList;
	}
	}

