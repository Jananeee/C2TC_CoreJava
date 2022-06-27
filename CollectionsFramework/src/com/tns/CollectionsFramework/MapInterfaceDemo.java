package com.tns.CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map <Integer,String> mapInterface = new HashMap<>();
		mapInterface.put(100, "Rahul");
		mapInterface.put(98, "Ajay");
		mapInterface.put(89, "They work together in the same team");
		System.out.println(mapInterface); //the insertion order is not preserved
		for(Map.Entry m:mapInterface.entrySet())
  		{  
   			System.out.println(m.getKey()+"="+m.getValue());  //to iterate through the entries(k,v)
  		}
		
		Iterator <Integer> iteratorObj = mapInterface.keySet().iterator();
		while(iteratorObj.hasNext()) {
			 Integer key=iteratorObj.next();
			 System.out.println(key+ " "+mapInterface.get(key));
		}
	}

}
