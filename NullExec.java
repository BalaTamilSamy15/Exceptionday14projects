package com.onesoft.day13;

public class NullExec {
public static void main(String[] args) {
	String d=null;
	try {
		char charAt = d.charAt(3);
		System.out.println(charAt);
	} catch (ArithmeticException e) {
		System.out.println("Handled the ArithmeticException");
		e.printStackTrace();
	} 
	catch (NumberFormatException e) {
		System.out.println("Handled the NumberFormatException");
		e.printStackTrace();
	}
	/*
	 * catch (NullPointerException e) {
	 * System.out.println("Handled the NullPointerException"); 
	 * e.printStackTrace();
	 * }
	 */
catch (Exception e) {
		System.out.println("get  atlast the exeception "+e);
		e.printStackTrace();
	}

	finally {
		System.out.println("Finnally run the code skip the specified");
		
	}
	System.out.println("done");
	
}
}
