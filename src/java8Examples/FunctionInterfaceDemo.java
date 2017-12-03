package java8Examples;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String args[]) {

		performFunction(10, p -> p+ 10);
	}

	
	public static void performFunction(int valueToBeOperated, Function<Integer, Integer> function) {
		System.out.println(function.apply(valueToBeOperated)); // returns 20
	}

}