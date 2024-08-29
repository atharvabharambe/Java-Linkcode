package super_class;

public abstract class Person {
	private String personName;
	private int personAge;
	private String personAddress;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, int personAge, String personAddress) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personAddress = personAddress;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	
	public abstract void create();
	public abstract void display();
	
}
