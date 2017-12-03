package classes;

import java.util.Collections;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String args[]) {
		
		Hashtable table = new Hashtable();
		//table.put(null, 1);
		table.put(1, null);
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Shreyas");

		
	}
	
}
