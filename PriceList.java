package com.onesoft.day13;

public class PriceList {

	public static void main(String[] args) throws InvalidPrice{
		int price=-12;
		try {if(price>0) {
			System.out.println("Can buy");
		}
		else { throw new InvalidPrice("Not valid price can't buy");}}
		catch (InvalidPrice e){
			System.out.println("Catched exceptioins " +e);
			e.printStackTrace();
		}
		finally {
			System.out.println(" catch  valid or not check the below output");
		}
		System.out.println("Purchased");
	}
}
