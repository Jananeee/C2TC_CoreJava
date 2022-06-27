package com.cg.inheritance;

public class Blackberry extends Mobile {
 public Blackberry (String man, String os, String mod, double cos) {
	 super(man,os,mod,cos);
 }
 public String getModel(){
		return "This is Superclass method: " + this.model;
	}
}
