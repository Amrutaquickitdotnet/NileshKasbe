package com.javaprograms;

public class Example_012_SingleDimensionalArrays {

	public static void main(String[] args) {
		
		
		// Declare an array 
		int[] a = new int[4];
		// Assign value in array 
		
		a[0] = 12;//0+1
		a[1] =13;//1
		//a[2]= 14;
		//a[3] = 23;
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(a);
		// for -each loop
		System.out.println("**************Using for each loop************");
		for(int b :a) {
			System.out.println(b);
			
		}
		
	}

}
