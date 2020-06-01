package tut11.exercise1;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws IllegalArgumentException{
		if(name==null || name.length()==0)throw new IllegalArgumentException("invalid name");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws IllegalArgumentException{
		if(age<=0)throw new IllegalArgumentException("invalid age");
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(String.format("Name: %s, age: %d", this.getName(), this.getAge()));
		return str.toString();
	}
}
