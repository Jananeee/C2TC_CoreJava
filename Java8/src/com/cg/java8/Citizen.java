package com.cg.java8;

public interface Citizen {
	void getAadhar();
	void getPan();
	//void getLink(); //never modify the interfaces in case of jva 1.7
	default void getLink() {
		System.out.println("i have linked my pan with aadhar");
	}
} 
