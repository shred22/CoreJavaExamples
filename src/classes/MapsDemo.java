package classes;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class MapsDemo {

	public MapsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		Hashtable ht = new Hashtable();
		HashMap hm = new HashMap();
		hm.put(1, "Abs");
		hm.put(2, "hg");
		hm.put(3, "sdsd");
		
		ht.put(1, "Abs");
		ht.put(2, "hg");
		ht.put(3, "sdsd");
		
		Enumeration elements = ht.elements();
		
		Collection list =  hm.values();
		System.out.println(list.getClass());
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		
		
	}
}
