package jaxbDemo;

import classes.ProtectedDemo;

class A {
	
	public void m(){
		System.out.println("M from class A");
	}
}


public class ProtectedNonSubClass extends A{
	
	public void m(){
		System.out.println("M from sub class ");
	}
	
	public static void main(String args[]) {
		A superClass = new A();
		ProtectedNonSubClass subClass = new ProtectedNonSubClass();
		
		
		A superClass1 = new ProtectedNonSubClass();
		
		superClass1.m();
		
	}
}
