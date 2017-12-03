package classes;



class A {
	public void m(){
		System.out.println("M from class A");
	}
	
	static public void m1(){
		System.out.println("M from class A");
	}
}
class B extends A{
	public void m(){
		System.out.println("M from class B");
	}
	static public void m1(){
		System.out.println("M from class B");
	}
}


public class PolymorphismDemo {
	
	static A staticA;
	public static void main(String args[]) {
		
		A aObj = new A();
		B bObj = new B();
		
		A aObj1 = new B();
		staticA = new B();
		aObj1.m();
		aObj1.m1();
		
		
		staticA.m();
		staticA.m1();
		
		
	}
}
