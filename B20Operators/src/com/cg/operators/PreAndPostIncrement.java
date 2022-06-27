package com.cg.operators;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		int a=5;
		int b=2;
		int c;
		int d;
		c=++b; //line a
		d=a++;//line b
		c++; //line c
		System.out.println("a="+a + "b="+b +"c="+c+"d="+d);
	}

}
