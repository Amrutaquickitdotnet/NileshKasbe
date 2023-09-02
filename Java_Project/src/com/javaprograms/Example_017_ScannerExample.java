package com.javaprograms;

import java.util.Scanner;

public class Example_017_ScannerExample {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter beverage of your choice");

		//int choice = s.nextInt();
		
		String choice1 = s.next();

		switch (choice1) {
		case "Tea":
			System.out.println("Your Tea is ready");

			break;

		case "Coffee":
			System.out.println("your cofee is ready");

			break;
		case "ColdDrinks":
			System.out.println("Your ColdDrink is Ready");
			break;

		default:
			System.out.println("Invalid choice");
			break;
			
		}
		s.close();
	}
}
