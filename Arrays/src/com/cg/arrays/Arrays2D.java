package com.cg.arrays;

public class Arrays2D {

	public static void main(String[] args) {
		int array[][]= {{42,2,41},{52,1,40},{67,9,12}};
		shuffle(array);
	}  //end of the main method
	public static void shuffle(int array[][]) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+ " ");
			}          //end of inner loop
			System.out.println();
		}         //end of outer for loop
		
	}

}
