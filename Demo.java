package com.onesoft.day13;

public interface Demo {
	public static String  getName() {
		return "Rama";
	}
	public default void getGender() {
		System.out.println("Male");
	}
	public String getDegree();
	

}
