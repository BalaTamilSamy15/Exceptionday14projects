package com.onesoft.day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExce {

public static void main(String[] args) throws IOException  {
	try {
		File file=new File("D://users//text.txt");
		FileReader f=new FileReader(file);
		
	} catch (FileNotFoundException e) {
		System.out.println(e+"The file location is not found");
		e.printStackTrace();
}
	finally {
		System.out.println(" may Only means Done not handled");
	}
	System.out.println("Done");
}
}
