package com.cg.controlstatements;

public class Main {

	public static void main(String[] args) {
		for(int j=0;j<=2;j++) { //outer for loop
			for(int k=j;k<=5;k++) { //inner for loop
				if(k==4) {
					continue;
				}
				System.out.println(k);
			}
		}
	}

}
