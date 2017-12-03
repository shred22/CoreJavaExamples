package classes;

import java.util.Arrays;
import classes.Person;

public class PassByRefDemo {

	Integer instanceVar = new Integer(52);
	Person p = new Person("John","Davis");
	
	
	public static void main(String args[]) {
		
		Integer localVar = new Integer(52);
		System.out.println("Integer before calling method on local var : "+localVar);
		refMethod(localVar);
		System.out.println("Integer after calling method on local var : "+localVar+"\n\n\n");
		
		System.out.println("Integer before calling method on local var : "+new PassByRefDemo().instanceVar);
		refMethod(new PassByRefDemo().instanceVar);
		System.out.println("Integer after calling method on local var : "+new PassByRefDemo().instanceVar);
		
		System.out.println("Invoking on a custom object");
		
		Person p1 = new Person("Bob","Sinchlar");
		Person p2 = new Person("Ned","Stark");
		Person[] pArr = {p1,p2};
		System.out.println("Person before calling method on local var : "+p1);
		refMethodCustomObject(p1);
		System.out.println("Person after calling method on local var : "+p1+"\n\n\n");
		
		System.out.println("Person before calling method on instance var : "+new PassByRefDemo().p);
		refMethodCustomObject(new PassByRefDemo().p);
		System.out.println("Person after calling method on instance var : "+new PassByRefDemo().p+"\n\n\n");
		
		System.out.println("Person Array before calling method on instance var : "+Arrays.toString(pArr));
		refMethodCustomObjectArray(pArr);
		System.out.println("Person array after calling method on instance var : "+Arrays.toString(pArr));
		
	}
	
	public static void refMethod(Integer obj) {
		
		obj = 15;

		System.out.println("Integer var in method : "+obj);
	}
	
	
public static void refMethodCustomObject(Person obj) {
		
		obj = new Person("Gannu", "das");

		System.out.println("Person in method : "+obj);
	}
	
public static void refMethodCustomObjectArray(Person[] obj) {
	
	obj[1] = new Person("Array", "Array");
}
}
