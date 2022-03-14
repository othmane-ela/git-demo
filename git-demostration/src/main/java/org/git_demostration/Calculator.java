package org.git_demostration;

public class Calculator {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static double add(double a , double b) {
		return a+b;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 */
	public static double substruction(double a,double b)
	{	
		return a-b;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 */
	public static double multiplying(double a, double b)
	{
		return a*b;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 * @throws Exception
	 */
	public static double division(double a,double b) throws ArithmeticException 
	{
		if(b==0) throw new ArithmeticException ();
		
		return a/b;
	}
	
	
	

}
