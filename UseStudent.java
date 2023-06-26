package com.onesoft.day13;

public class UseStudent  {
public static void main(String[] args) {
	Student s1=new Student();
	s1.name="Mathi";
	s1.dept="Cse";
	s1.age=24;
	System.out.println(s1.age);
	
	Student s2=new Student();
	s2.name="Mathi";
	s2.dept="Cse";
	s2.age=24;
	
	Student s3=new Student();
	s3.name="Mathi";
	s3.dept="Cse";
	s3.age=24;
	
	Student.college="RRR";
	int noOfDept = s3.noOfDept;
	System.out.println();
}
}
