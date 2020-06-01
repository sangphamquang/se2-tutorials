package tut11.exercise3;

public class Human {

	private String firstName;
	private String lastName;
	
	public Human(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName)  throws IllegalArgumentException{
		if(!Character.isUpperCase(firstName.charAt(0)))  throw new IllegalArgumentException();
		if(firstName.length()<5)throw new IllegalArgumentException("asdjkfhsadkf");

		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName)  throws IllegalArgumentException{
		if(!Character.isUpperCase(lastName.charAt(0)))  throw new IllegalArgumentException();

		if(lastName.length()<5)throw new IllegalArgumentException("asdjkfhsadkf");
		this.lastName = lastName;
	}

}
