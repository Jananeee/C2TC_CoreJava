package com.cg.lamdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("Rahul");
		obj.add("Ravi");
		obj.add("Revanth");
		obj.add("Ranjani");  //3 ways --->simple for loop, for each, iterator
		/*for(String e : obj) {
			System.out.println(e); //External iteration
		}*/
		
		obj.forEach(temp -> System.out.println(temp)); //internal iteration
		
	}

}
