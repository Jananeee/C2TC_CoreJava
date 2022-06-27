package com.tns.CollectionsFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	LinkedHashSet linked = new LinkedHashSet();
	linked.add("Rahul");
	linked.add('A');
	linked.add("Rohan");
	linked.add(8);
	linked.add(90.0f);
	linked.add(null);
	linked.add(8);
	System.out.println("The data in the set:" +linked); //order is preserved in LinkedHashSet
	
	}

}
