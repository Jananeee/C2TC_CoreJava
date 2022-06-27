package com.cg.inheritance;

public class Mobile {
	private String manufacturer;
	private String operating_system;
	protected String model;
	private double cost;
	public Mobile(String manufacturer, String operating_system, String model, double cost) {
		super();
		this.manufacturer = manufacturer;
		this.operating_system = operating_system;
		this.model = model;
		this.cost = cost;
	}
	public String getModel(){
		return "This is Superclass method: " + this.model;
	}
	@Override
	public String toString() {
		return "Mobile [manufacturer=" + manufacturer + ", operating_system=" + operating_system + ", model=" + model
				+ ", cost=" + cost + "]";
	}
	
	
}
