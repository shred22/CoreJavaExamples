package serializationDemo;

import java.io.Serializable;


public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	private CityAndState cityAndState;

	public Person(final String newLastName, final String newFirstName, final CityAndState newCityAndState) {
		this.lastName = newLastName;
		this.firstName = newFirstName;
		this.cityAndState = newCityAndState;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " of " + this.cityAndState;
	}
	public static void main(String args[]) {
		
		CityAndState cns = new CityAndState("Pune", "MH");
		Person p = new Person("Pandian", "Alex", cns);
		SerializationDemonstrator.serialize(p, "object.dat");
	}
}
