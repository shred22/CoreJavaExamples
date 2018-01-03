package serializationDemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializablePerson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String lastName;
	private String firstName;
	private CityAndState cityAndState;

	public SerializablePerson(final String newLastName, final String newFirstName, final CityAndState newCityAndState) {
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
		SerializablePerson p = new SerializablePerson("Pandian", "Alex", cns);
		SerializationDemonstrator.serialize(p, "object.dat");
	}
	 private void writeObject(final ObjectOutputStream out) throws IOException
	   {
	      out.writeUTF(this.lastName);
	      out.writeUTF(this.firstName);
	      out.writeUTF(this.cityAndState.getCityName());
	      out.writeUTF(this.cityAndState.getStateName());
	   }
	 private void readObject(final ObjectInputStream in) throws IOException, ClassNotFoundException
	   {
	      this.lastName = in.readUTF();
	      this.firstName = in.readUTF();
	      this.cityAndState = new CityAndState(in.readUTF(), in.readUTF());
	   }
}
