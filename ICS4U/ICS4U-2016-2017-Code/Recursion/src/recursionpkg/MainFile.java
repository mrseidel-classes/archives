package recursionpkg;

/**
 * This file is to test the running of the work you completed for your recursive work.
 * 
 * @author Mr. Seidel
 * @since October 4, 2015
 * @since JDK 8
 * @version 1.0
 */
public class MainFile {

	/*
	 * No need to change anything in this file.  It is used solely for testing.
	 */
	
	final static long FIBONACCI_MINIMUM = 5;
	final static long FIBONACCI_MAXIMUM = 12;
	final static long FIBONACCI_INCREMENT = 3;
	
	final static long FACTORIAL_MINIMUM = 5;
	final static long FACTORIAL_MAXIMUM = 20;
	final static long FACTORIAL_INCREMENT = 4;
	
	final static long BUNNY_MINIMUM = 20;
	final static long BUNNY_MAXIMUM = 50;
	final static long BUNNY_INCREMENT = 5;
	
	final static long SUM_MINIMUM = 30;
	final static long SUM_MAXIMUM = 80;
	final static long SUM_INCREMENT = 6;
	
	/**
	 * The main runnable area of the whole program 
	 * (like the "setup()" and "draw()" functions in Processing)
	 * 
	 * @param args Command-line arguments (not used in this case)
	 */
	public static void main(String[] args) {
		
		Fibonacci fib = new Fibonacci();
		Factorial fact = new Factorial();
		BunnyEars bunny = new BunnyEars();
		SumDigits sum = new SumDigits();
		
		System.out.println("\n------------------Fibonnaci---------------------");
		for (long i = FIBONACCI_MINIMUM; i < FIBONACCI_MAXIMUM; i += FIBONACCI_INCREMENT) {
			System.out.println("Non-recursive function for Fibonacci of i is: " + fib.calculate(i));
			System.out.println("Recursive version is: " + fib.recursiveCalculate(i));
		}
		
		System.out.println("\n------------------Factorial---------------------");
		for (long i = FACTORIAL_MINIMUM; i < FACTORIAL_MAXIMUM; i += FACTORIAL_INCREMENT) {
			System.out.println("Non-recursive function for Factorial of i is: " + fact.calculate(i));
			System.out.println("Recursive version is: " + fact.recursiveCalculate(i));
		}
		
		System.out.println("\n------------------Bunny Ears---------------------");
		for (long i = BUNNY_MINIMUM; i < BUNNY_MAXIMUM; i += BUNNY_INCREMENT) {
			System.out.println("Non-recursive function for Bunny Ears of i is: " + bunny.calculate(i));
			System.out.println("Recursive version is: " + bunny.recursiveCalculate(i));
		}
		
		System.out.println("\n------------------Sum Digits---------------------");
		for (long i = SUM_MINIMUM; i < SUM_MAXIMUM; i += SUM_INCREMENT) {
			System.out.println("Non-recursive function for Sum Digits of i is: " + sum.calculate(i));
			System.out.println("Recursive version is: " + sum.recursiveCalculate(i));
		}
	}
}
		
		
		
		
		
		
		
		
		
		
