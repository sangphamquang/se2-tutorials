package tut11.exercise1;

public class Child extends Person {

	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setName(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	@Override
	public void setAge(int age) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		if(age >15)throw new IllegalArgumentException("age must <15");
		super.setAge(age);
	}
	
}
