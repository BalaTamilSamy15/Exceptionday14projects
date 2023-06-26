package com.onesoft.day13;

public class LoginExcMgs {
	public static void main(String[] args) {
	String username="admin";
	String password="0123";
	 try {
		 if (username.equals("admin") && password.equals("24332")) {
	
		System.out.println("Login successful");
	}
	else {
		throw new LogInValidation("Login Failed");
	} 
}
 catch (Exception e) {
	 System.out.println("Hi iam Catch");
	System.out.println(e);
}
	 finally {
		 System.out.println("finally block");
	 }
	 
	 System.out.println("hello");
	
}
	
}
