package com.javaprograms;

public class Example_015_Multidimensionalpart2 {

	public static void main(String[] args) {
		int rows = 10;
		int columns = 4;
		int[][] arr = new int[rows][columns];
		int value = 23;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				arr[i][j] = value;
				value++;
			}
		}

		System.out.println("the 2d array is :");
		for (int i = 0; i < rows; i++) 
		{

			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
