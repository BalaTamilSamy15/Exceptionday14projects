package com.onesoft.day13;

public final  class Student {
String name;
int age;
String dept;
static String  college;
final int noOfDept = 5;
public static void main(String[] args) {
	Student st = new Student();
	System.out.println(st.noOfDept);
}
}
