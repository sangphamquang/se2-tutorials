package tut09se2.AbstractFactory;

//Create the AbstractFactory class to get factories for Normal and Rounded Shape Objects.
public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}
