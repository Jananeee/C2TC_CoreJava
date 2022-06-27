package com.cg.lamdaexpressions;

interface Lambda{
	void display();

}

public class App {

	public static void main(String[] args) {
		Lambda obj = ()->
			System.out.println("Iam from display method");
	obj.display();
		
	}

}
