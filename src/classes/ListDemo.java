package classes;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("D");
		list.remove("A");
		
		System.out.println(list);

	}

}
