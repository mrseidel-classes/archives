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
 * @version 1.1 - Updated for Spring 2018 class
 *
 */
public class Circle {

	private final float PI = 3.1415926536; //Constant used to hold the value of pi
	private double radius;
	private SVector position;
	
	/**
	 * Default construction
	 *
	 * @uses Circle(double)
	 */
	public Circle () {
		this(0);
	}
	
	/**
	 * Constructor with radius as parameter
	 *
	 * @param radius The starting radius of the object
	 * @uses Circle(double, SVector)
	 */
	public Circle (double radius) {
		this(radius, new SVector(0, 0));
	}
	
	/**
	 * Constructor with radius and original starting position
	 *
	 * @param radius The starting radius of the object
	 * @param position The SVector position of the centre of the circle
	 */
	public Circle (double radius, SVector position) {
		this.radius = radius;
		this.position = new SVector(position);
	}
	
	/**
	 * Returns the radius of the circle
	 *
	 * @return The radius of the circle
	 */
	public double radius() {
		return this.radius;
	}
	
	/**
	 * Returns the calculated perimeter of the circle
	 *
	 * @return The calculated perimeter of the circle
	 */
	public double perimeter() {
		return 2 * this.radius * this.PI;
	}
	
	/**
	 * Returns the calculated area of the circle
	 *
	 * @return The calculated area of the circle
	 */
	public double area() {
		return this.radius * this.radius * this.PI;
	}
	
	/**
	 * Returns the centre of the circle
	 *
	 * @return The centre of the circle as a string "(x,y)"
	 */
	public String centre() {
		return "(" + position.x + ", " + position.y + ")";
	}
}
