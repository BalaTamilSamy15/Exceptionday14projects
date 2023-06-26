package com.onesoft.day13;

public class Numbers {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int divide=num1/num2;
			System.out.println(divide);
		}
		catch (ArithmeticException e) {
			System.out.println("The exception name is "+e);
			e.printStackTrace();
		}
	
		finally {
			System.out.println("Exceuted even when the exception occurs or not");
		}
		
	System.out.println("Code Excecuted");
	}
/// Control+shift+O            to check the package is imported or not
}
