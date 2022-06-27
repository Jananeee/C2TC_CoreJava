package com.tns.CollectionsFramework;


import java.util.HashSet;
//import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListHeterogeneousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set list = new HashSet();
		list.add("Avinash");
		list.add(6);
		list.add("Ajay");
		list.add(56.7f);
		list.add(null);
		list.add(6);
		//System.out.println(((LinkedList) list).offer("Sanjay"));
		System.out.println(list);
	}

}

