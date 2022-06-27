package com.tns.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(11);
		list.add(11);
		list.add(100);
		list.remove(2);
		for(Integer i: list) {  //for each loop to iterate through the collection
			System.out.println(i);//1st way
		}
		
		for(int j=0;j<list.size();j++) { //simple for loop, 2nd way
			System.out.println(list.get(j));
		}
		Iterator z = list.iterator(); //using iterator, iterating through the list
		while(z.hasNext()) {
			System.out.println(z.next());
		}
			
		
	}

}
