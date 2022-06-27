package com.cg.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
    		fis = new FileInputStream("D:\\myfile.txt"); 
		int k; 
		while(( k = fis.read() ) != -1) 
		{ 
			System.out.print((char)k); 
		} 
		fis.close();
	}

}
