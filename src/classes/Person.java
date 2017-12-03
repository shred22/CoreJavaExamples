package classes;

public class Person {

	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public Person() {
		
	}
	@Override
	public String toString() {
		
		return fname +" "+lname;
	}
	
	
	
}
