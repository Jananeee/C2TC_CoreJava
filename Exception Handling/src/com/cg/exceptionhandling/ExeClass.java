package com.cg.exceptionhandling;

public class ExeClass {

	public static void main(String[] args) {
		ExeClass ob = new ExeClass();
		ob.display();
	}
	public void display() {
		try {
		System.out.println(100/0);
		}
		/*catch(ArithmeticException exc) {
			System.out.println("There occurs an exception" + exc);
		}*/
		catch(Exception e) {
			System.out.println("There occurs an arithmetic exception" + e);
		}
	}

}

