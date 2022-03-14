package org.git_demostration;

public class Calculator {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static long add(long a , long b) {
		return a+b;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static long substruction(long a,long b)
	{	
		return a-b;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public static long multiplying(long a, long b)
	{
		return a*b;
	}
	
	
	/**
	 *  division methode 
	 * @param a
	 * @param b
	 * @return a/b
	 * @throws Exception
	 */
	public static long division(long a,long b) throws ArithmeticException 
	{
		if(b==0) throw new ArithmeticException ();
		
		return a/b;
	}
	
	
	

}
