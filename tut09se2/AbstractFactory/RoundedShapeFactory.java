package tut09se2.AbstractFactory;

/* Create RoundedShapeFactory class extending AbstractFactory to generate 
 * object of concrete class based on given information. 
 */

public class RoundedShapeFactory extends AbstractFactory {
	// TO-DO: Implement the getShape() method
	@Override
	public Shape getShape(String shapeType) {
		
		          return (shapeType.equalsIgnoreCase("Rectangle")) ? new RoundedRectangle() : new RoundedSquare();
	}
}