package tut09se2.AbstractFactory;

//Create the RoundedRectangle concrete class implementing the Shape interface.
public class RoundedRectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}