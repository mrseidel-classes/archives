/**
 * 
 */
package sortingpkg;

/**
 * This is a container to hold Circle information
 * 
 * @author Mr. Seidel
 * @since April 18th, 2016
 * @since JDK 8
 * @version 1.0
 *
 */
public class Circle implements Shape {

	SVector vertex;	//centre point of the Circle
	double radius;

	/**
	 * Default constructor
	 * -- uses the constructor that has (radius, vertex)
	 */
	public Circle() {
		this(0, new SVector(0, 0));
	}
	
	/**
	 * Constructor that takes in a radius, but uses the default vertex
	 * -- uses the constructor that has (radius, vertex)
	 *
	 * @param radius  the radius of this Circle
	 */
	public Circle(double radius) {
		this(radius, new SVector(0, 0));
	}
	
	/**
	 * Constructor that takes in both a radius and vertex
	 *
	 * @param radius  the radius of this Circle
	 * @param vertex  the centre point of this Circle
	 */
	public Circle(double radius, SVector vertex) {
		this.radius = radius;
		this.vertex = new SVector(vertex);
	}

	/**
	 * Calculates the perimeter of the Circle
	 *
	 * @return returns the calculated value of the perimeter of this Circle
	 */
	public double perimeter() {
		return 2 * PI * radius;
	}

	/**
	 * Calculates the area of the Circle
	 *
	 * @return returns the calculated value of the area of this Circle
	 */
	public double area() {
		return PI * Math.pow(radius, 2);
	}

	/**
	 * Returns the surface area of the Circle
	 *
	 * @return automatically returns 0, since a Circle is a 2D shape
	 */
	public double surfaceArea() {
		return 0;
	}

	/**
	 * Returns the volume of the Circle
	 *
	 * @return automatically returns 0, since a Circle is a 2D shape
	 */
	public double volume() {
		return 0;
	}

	/**
	 * Getter method for the radius value
	 *
	 * @return the value of the radius as a double
	 */
	public double radius() {
		return this.radius;
	}
	
	/**
	 * Getter method for the vertex value
	 *
	 * @return the value of the vertex as an SVector
	 */
	public SVector centre() {
		return this.vertex;
	}
}
