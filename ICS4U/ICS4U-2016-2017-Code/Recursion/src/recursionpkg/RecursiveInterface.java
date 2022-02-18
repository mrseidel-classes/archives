package recursionpkg;

public interface RecursiveInterface {
	
	public long calculate(long value);
	public long recursiveCalculate(long value);
	public long calculate(String value);		//used only for Palindromes and Mirrordromes
	public long recursiveCalculate(String value);   //used only for Palindromes and Mirrordromes
}
