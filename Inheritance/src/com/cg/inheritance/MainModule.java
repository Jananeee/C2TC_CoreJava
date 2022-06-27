package com.cg.inheritance;

public class MainModule {

	public static void main(String[] args) {
		Mobile mobileobject= new Mobile("windows","windows","recent",16000.00);
		System.out.println(mobileobject.getModel());
		System.out.println(mobileobject);
		
		Blackberry blackberryobject = new Blackberry("Blackberry", "blackberry", "keyone", 20000.00);
		System.out.println(blackberryobject.getModel());
		System.out.println(blackberryobject);
		
		
	}

}
