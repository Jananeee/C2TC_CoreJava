package com.tns.CollectionsFramework;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList <String> names = new LinkedList<>();
		names.add("Ravi");
		names.add("Rahul");
		names.add("Avinash");
		names.add("Ajay");
		names.add("Ajay"); //linkedlist accepts duplicate values
		names.add(null); //linkedlist accepts null values
		names.addFirst("Ravin"); 
		names.addLast("Revanthi");
		System.out.println("THe names in the list are:" + names);
	}

}
