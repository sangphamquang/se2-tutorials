package tut09se2.AbstractFactory;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	//TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
                ShapeFactory s = new ShapeFactory();
		// get an object of Shape Rectangle
                Rectangle r = (Rectangle) s.getShape("Rectangle");
		// call draw method of Shape Rectangle
                r.draw();
		// get an object of Shape Square
                Square sq = (Square) s.getShape("square");
		// call draw method of Shape Square
                sq.draw();
		// get shape factory
                
                ShapeFactory s1 = new ShapeFactory();
		// get an object of Shape Rectangle
                
                Rectangle r2 = (Rectangle) s1.getShape("Rectangle");
		// call draw method of Shape Rectangle
                
                r2.draw();
		
		// get an object of Shape Square
                Square sq2 = (Square) s1.getShape("square");
		// call draw method of Shape Square
                sq2.draw();
		// get shape factory
	}
}