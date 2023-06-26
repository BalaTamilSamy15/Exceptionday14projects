package com.onesoft.day13;

public class StringIndeEx {
	public static void main(String[] args) {
		String d="DGGD";
		try {
			char t = d.charAt(8);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("first catch array"+e);
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("3rd  String index exec"+e);
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("final INdex "+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("run the code below check the syso run or not");
		}
		System.out.println("done handle rest run");
	}

}
