/**
 * 	The fibonacci sequence is a famous bit of mathematics, 
 *	and it happens to have a recursive definition. The first 
 *	two values in the sequence are 0 and 1 (essentially 2 base cases). 
 *	Each subsequent value is the sum of the previous two values, 
 *	so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
 *	Define calculate(n), and recursiveCalculate(n) methods that returns the nth fibonacci number, 
 *	with n=0 representing the start of the sequence. 
 *	 
 *  Examples using calculate would be:
 *  calculate(0) -> 0
 *	calculate(1) -> 1
 *	calculate(2) -> 1
 * 
 * @author Mr. Seidel
 * @since October 4, 2015
 * @updated May 7, 2018
 * @since JDK 8
 * @version 1.1
 * 
 */
public class Fibonacci {

	/**
	 * Default constructor
	 */
	public Fibonacci() {
		//nothing to do in here
	}
	
	/**
	 * Calculate the n-th Fibonacci number using a recursive method
	 * 
	 * @param n n-th value to calculate to
	 * @return the final factorial calculated value as a long
	 */
	public long recursiveCalculate(long n) {
		if (n <= 0) return 0;
		if (n <= 2) return 1;
		return recursiveCalculate(n - 1) + recursiveCalculate(n - 2);
	}
	
	/**
	 * Calculate the n-th Fibonacci number using an iterative method
	 * 
	 * @param n n-th value to calculate to
	 * @return the final factorial calculated value as a long
	 */
	public long calculate(long n) {
		if (n <= 0) return 0; //used to catch bad input as well
		if (n <= 2) return 1;
		
		long previous = 0;
		long current = 1;
		
		for (int i = 0; i < n; i++) {
			current += previous;
			previous = current;
		}
		return current;
	}
}
