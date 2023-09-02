package com.javaprograms;

import java.util.Scanner;

public class Example_018_TemperatureConversionScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type 1 for Farenhite to celsius ");
		System.out.println("Type 2 for celsius to Farenhite ");

		int choice = sc.nextInt();
		double ft = 0.0;
		double ct = 0.0;

		switch (choice) {
		case 1:
			System.out.println(" Enter temperature in Farenhite");

			ft = sc.nextDouble();
			ct = (ft - 32) * 5 / 9.0;

			System.out.println("Temperature to celsius" + ct);

			break;

		case 2:
			System.out.println(" Enter temperature in Celsius");

			ct = sc.nextDouble();
			ft = 9.0 / 5.0 * ct + 32;

			System.out.println("Temperature in Farenhite" + ft);
			break;
		default:
			System.out.println("Incorrect Choice");
			break;
		}
		sc.close();
	}

}
