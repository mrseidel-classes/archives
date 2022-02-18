/**
 * 
 */
package inheritancepkg;

/**
 * <description of class here>
 * 
 * @author <yourNameHere>
 * @since <date here>
 * @since JDK 8
 * @version 1.0
 *
 */
public class Sphere extends Circle {

	public Sphere() {
		super();
	}
	
	public Sphere(double radius) {
		super(radius);
	}
	
	public Sphere(double radius, SVector vertex) {
		super(radius, vertex);
	}
	
	public double surfaceArea() {
		//calculate surface area here
	}
	
	public double volume() {
		//calculate volume here
	}
	
}
