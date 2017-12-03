package classes;

import java.util.Scanner;

interface Demo {
	
	default void defaultMethod() {
		System.out.println("Default Method in interface");
	}
	
	static void staticMethod(){
		System.out.println("Static method in interface");
	}
	
	}
public class DefaultMethodsDemo implements Demo {

	static void staticDemo(){
		System.out.println("Static method in implementing Class");
	}
	
	/*public void defaultMethod() {
		System.out.println("Default Method in implementing Class");
	}*/
	
	public static void main(String args[])
	{
		DefaultMethodsDemo obj = new DefaultMethodsDemo();
		obj.defaultMethod();
		DefaultMethodsDemo.staticDemo();
		Demo.staticMethod();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String nextLine = scan.nextLine();
		System.out.println("Hello, "+nextLine+" !!!");
		
	}
	
}
