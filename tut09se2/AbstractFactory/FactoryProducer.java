package tut09se2.AbstractFactory;

/* Create a Factory generator/producer class to get factories 
 * by passing an information such as Shape
 */
public class FactoryProducer {
	//TO-DO: implement the getFactory() method
	public static AbstractFactory getFactory(boolean rounded) {
		return (rounded)?new RoundedShapeFactory():new ShapeFactory();
	}
}
