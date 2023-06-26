package com.onesoft.day13;

public class ArrayIndexExce {
	public static void main(String[] args) {
		String [] d= {"Bala","Ram","Raja"};

		try {
			System.out.println(d[7]);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("first catch array"+e);
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("3rd  String index  array exec"+e);
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


