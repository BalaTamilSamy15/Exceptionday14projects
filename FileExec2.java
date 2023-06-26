package com.onesoft.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExec2 {
public static void main(String[] args)  {
	try {
		File file=new File("‪C:\\Users\\FileCheck.txt");
		FileReader f=new FileReader(file);
		int temp=0;
		while ((temp=f.read())!=-1) {
			System.out.println((char)(temp));
		}
	}catch (FileNotFoundException e) {
		System.out.println(e+"The file location is not found");
		e.printStackTrace();
} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		System.out.println(" may not Done means   exception not handled");
	}
	System.out.println("Done");
}
}
