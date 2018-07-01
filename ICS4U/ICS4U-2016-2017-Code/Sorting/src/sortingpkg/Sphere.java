/**
 * 
 */
package sortingpkg;

/**
 * This is a container to hold Sphere information
 * 
 * @author Mr. Seidel
 * @since April 18th, 2016
 * @since JDK 8
 * @version 1.0
 *
 */
public class Sphere extends Circle {

	/**
	 * {@inheritDoc}
	 */
	public Sphere() {
		super();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Sphere(double radius) {
		super(radius);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Sphere(double radius, SVector vertex) {
		super(radius, vertex);
	}
	
	/**
	 *	Calculates the surface area and returns it as a double
	 *
	 *	@return the calculated surface area of this Sphere as a double
	 */
	public double surfaceArea() {
		return 4.0 * PI * Math.pow(radius, 2);
	}
	
	/**
	 *	Calculates the volume and returns it as a double
	 *
	 *	@return the calculated volume of this Sphere as a double
	 */
	public double volume() {
		return (4.0 / 3.0) * PI * Math.pow(radius, 3);
	}
	
}
