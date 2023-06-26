package com.onesoft.day13;

public class NumberFormat {
	public static void main(String[] args) {
		String s="Adithiya";
	try {
		int f=Integer.parseInt(s);
		System.out.println(f);
	} 
	catch (ArithmeticException e) {
		System.out.println("Handled the exeception");
		e.printStackTrace();
	}	
	/*
	 * catch (ArithmeticException e) { System.out.println("Handled the exeception");
	 * e.printStackTrace(); }
	 */
	
	finally {
		System.out.println("run the code skip the specific code");
	}	
		System.out.println("done");
		
	}

}
