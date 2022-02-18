/**
 * 
 */
package objectspkg;

/**
 * Used as a temporary solution to not having 2D PVectors in Java (as you did in Processing)
 * 
 * @author Mr. Seidel
 * @author Michael D. Cai
 * @since Sept 16, 2015
 * @since JDK 8
 * @version 1.4
 *
 */
//Michael added the compareTo(), dot(), cross(), array(), copy(), magSq(), sub() and dist() methods

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
	 * @param v Another SVector
	 */
	public SVector(SVector v) {
		this(v.getX(), v.getY(), v.getZ());
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
	 * @param v The SVector to be added to this one
	 * @return The sum of the two SVectors
	 */
	public SVector add(SVector v) {
		this.x = this.x + v.getX();
		this.y = this.y + v.getY();
		this.z = this.z + v.getZ();
		
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
	
	/**
	 * This function compares this vector to an input vector
	 * 
	 * @param v the vector needed to be compared to
	 * @return whether two vectors are equal in value
	 */
	public boolean compareTo(SVector v){
		return (this.x==v.getX()&&this.y==v.getY()&&this.z==v.getZ());
	}
	
	/**
	 * This function returns the dot product of this vector and given vector
	 * 
	 * @param v the input vector used to generate dot product
	 * @return the dot product as a scaler
	 */
	public double dot(SVector v){
		return this.x*v.getX()+this.y*v.getY()+this.z*v.getZ();
	}
	
	/**
	 * This function returns the dot product of this vector and given vector
	 * 
	 * @param v	the input vector used to generate cross product
	 * @return the cross product as a SVector
	 */
	public SVector cross(SVector v){
		return new SVector(this.y*v.getZ()-this.z*v.getY(),this.z*v.getX()-this.x*v.getZ(),this.x*v.getY()-this.y*v.getX());
	}
	
	/**
	 * This function returns a representation of this vector as a double array.
	 * 
	 * @return a double array of x,y,z
	 */
	public double[] array(){
		double[]answer=new double [3];
		answer[0]=this.x;
		answer[1]=this.y;
		answer[2]=this.z;
		return answer;
	}
	
	/**
	 * This function copies the components of the input vector and returns the result as a SVector
	 * 
	 * @param v the input vector needed to be copied
	 * @return a copy of the input vector as a SVector
	 */
	public SVector copy(SVector v){
		return new SVector(v);
	}
	
	/**
	 * This function returns the magnitude sqaure of this vector
	 * 
	 * @return the magnitude square of this vector as a double
	 */
	public double magSq(){
		return this.x*this.x + this.y*this.y + this.z*this.z;
	}
	
	/**
	 * This function subtract the vector from a given vector
	 * 
	 * @param v the subtrahend vector
	 * @return the difference of the two vectors
	 */
	public SVector sub(SVector v){
		this.x = this.x - v.getX();
		this.y = this.y - v.getY();
		this.z = this.z - v.getZ();
		
		return this;
	}
	
	/**
	 * This function calculates the Euclidean distance of the two SVectors
	 * 
	 * @param v input vector
	 * @return the Euclidean distance of the two SVectors
	 */
	public double dist(SVector v){
		return this.sub(v).mag();
	}
}
