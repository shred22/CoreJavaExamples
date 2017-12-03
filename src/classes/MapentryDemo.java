package classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapentryDemo {

	
	public static void main(String args[]) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "shreyas");
		map.put(2, "akanksha");
		map.put(3, "sahil");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		
		
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)itr.next();
			
			
			
			System.out.println("Key : "+entry.getKey() +": Value : "+entry.getValue());
		}
		
		
	}
}
