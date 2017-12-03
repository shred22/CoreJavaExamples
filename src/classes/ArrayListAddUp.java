package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListAddUp {

	static Set<Integer> set;

	public ArrayListAddUp(Set<Integer> set) {
		super();
		ArrayListAddUp.set = set;
	}

	public ArrayListAddUp() {
	}

	public static void main(String[] args) {        

	    int []a = {1,4,2,6};
	    printSumPairs(a,10);        

	}


	public static void printSumPairs(int []input, int k){
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

	    for(int i=0;i<input.length;i++){

	        if(pairs.containsKey(input[i]))
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	        else
	            pairs.put(k-input[i], input[i]);
	    }
	    System.out.println(pairs);

	}
}
