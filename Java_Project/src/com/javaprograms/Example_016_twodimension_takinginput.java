package com.javaprograms;

import java.util.Scanner;

public class Example_016_twodimension_takinginput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows please:");

		int rows = scan.nextInt();

		System.out.println("Enter no of columns please:");

		int columns = scan.nextInt();

		int[][] arr = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				arr[i][j] = (i + 1) * (j + 1);
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		scan.close();

	}
}
