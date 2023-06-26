package com.onesoft.day13;

public interface UseCalculator {
public static void main(String[] args) {
	Calculator c=(x,y)->x+y;
	 System.out.println( c.math(2, 5));

	Calculator c1=(x,y)->x-y;
	 System.out.println( c1.math(2, 5));
	 
	Calculator c2=(x,y)->x/y;
	 System.out.println( c.math(15,5));
	 
	Calculator c3=(x,y)->x*y;
	 System.out.println( c.math(5,4));
	 
	Calculator c4=(x,y)->x%y;
	 System.out.println( c.math( 25,3));
	
	
}
}
