package classes;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public FailSafeIterator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			list.add(10);
			System.out.println(next);
		}
		
		
		
		
		

	}

}
