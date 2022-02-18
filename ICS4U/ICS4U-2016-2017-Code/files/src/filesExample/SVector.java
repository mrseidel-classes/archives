/**
 * 
 */
package filesExample;

/**
 * Used as a temporary solution to not having 2D PVectors in Java (as you did in Processing)
 * 
 * @author Mr. Seidel
 * @since Sept 16, 2015
 * @since JDK 8
 * @version 1.4
 *
 */
public class SVector {
	private double x; //holds the x coordinate for the SVector
	private double y; //holds the y coordinate for the SVector
	private double z; //holds the z coordinate for the SVector
	
	/**
	 * Default constructor for the SVector
	 * --This constructor uses the (double x, double y, double z) constructor
	 * 
	 */
	public SVector() {
		this(0, 0, 0);
	}
	
	/**
	 * Constructor for a 2D SVector
	 * --This constructor uses the (double x, double y, double z) constructor
	 * 
	 * @param x the x coordinate for the SVector
	 * @param y the y coordinate for the SVector
	 */
	public SVector(double x, double y) {
		this(x, y, 0);
	}
	
	/**
	 * Constructor for the SVector
	 * --This constructor uses the (double x, double y, double z) constructor
	 * 
	 * @param s Another SVector
	 */
	public SVector(SVector s) {
		this(s.getX(), s.getY(), s.getZ());
	}
	
	/**
	 * Constructor for a 3D SVector
	 * 
	 * @param x the x coordinate for the SVector
	 * @param y the y coordinate for the SVector
	 */
	public SVector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Getter method for private value x. 
	 * 
	 * @return the value of x
	 */
	public double getX() { return x; }
	
	/**
	 * Getter method for private value y. 
	 * 
	 * @return the value of y
	 */
	public double getY() { return y; }
	
	/**
	 * Getter method for private value y. 
	 * 
	 * @return the value of y
	 */
	public double getZ() { return z; }
	
	/**
	 * Setter method for private value x. 
	 * 
	 * @return the value of x
	 */
	public void setX(double x) { this.x = x; }
	
	/**
	 * Setter method for private value y. 
	 * 
	 * @return the value of y
	 */
	public void setY(double y) { this.y = y; }
	
	/**
	 * Setter method for private value z. 
	 * 
	 * @return the value of z
	 */
	public void setZ(double z) { this.z = z; }
	
	/**
	 * toString() method that returns all 3 points
	 * 
	 * @return the value of all 3 points nicely formatted
	 */
	public String toString() {
		return "[" + x + "][" + y + "][" + z + "]";
	}
	
	/**
	 * Adds an SVector to this SVector
	 * 
	 * @param s The SVector to be added to this one
	 * @return The sum of the two SVectors
	 */
	public SVector add(SVector s) {
		this.x = this.x + s.getX();
		this.y = this.y + s.getY();
		this.z = this.z + s.getZ();
		
		return this;
	}
	
	
	/**
	 * Multiplies this SVector by a scalar amount
	 * 
	 * @param scalar The scalar amount to multiply this SVector by
	 * @return The product of the scalar amount and this SVector
	 */
	public SVector mult(double scalar) {
		this.x = this.x * scalar;
		this.y = this.y * scalar;
		this.z = this.z * scalar;
		
		return this;
	}
	
	
	/**
	 * Divides this SVector by a scalar amount
	 * 
	 * @param scalar The scalar amount to divide this SVector by
	 * @return The quotient of the scalar amount and this SVector
	 */
	public SVector div(double scalar) throws IllegalArgumentException {
		if (scalar != 0) {
			this.x = this.x / scalar;
			this.y = this.y / scalar;
			this.z = this.z / scalar;
		} else {
			 throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return this;
	}
	
	
	/**
	 * Normalizes this SVector
	 * 
	 */
	public void normalize() {
		double m = mag();
		if (m != 0) {
			div(m);
		}
	}
	
	/**
	 * Calculates the magnitude of this SVector
	 * 
	 * @return the value of the magnitude as a double
	 */
	public double mag() {
		return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
	}
	
}
