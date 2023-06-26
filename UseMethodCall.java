package com.onesoft.day13;

public interface UseMethodCall {
public static void main(String[] args) {
	
//	SingleAbstractMethod s =(x)->System.out.println(x.toUpperCase());
//	s.call("Calling");
//	SingleAbstractMethod v=(x)->x.toUpperCase();
//	v.call("Calling");
	FunWithInter s=() -> "Bala";
	System.out.println(s.getParty());
	
}
}
