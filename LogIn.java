package com.onesoft.day13;

public class LogIn {
	public static void main(String [] args) throws LogInValidation {
		String username="admin";
		String password="0123";
		 try {
			 if (username.equals("admin") && password.equals("24332")) {
		
			System.out.println("Login successful");
		}
		else {
			throw new LogInValidation("String");
		} 
	}
	 catch (Exception e) {
		System.out.println(e);
	}
		
}

}