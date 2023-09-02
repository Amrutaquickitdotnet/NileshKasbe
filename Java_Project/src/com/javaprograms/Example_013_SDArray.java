package com.javaprograms;

public class Example_013_SDArray {

	public static void main(String[] args) {
		
		
		// Declare an array 
		String[] employeelist = new String[4];
		// Assign value in array 
		employeelist[0]= "Chetan";
		employeelist[1]= "Nilesh";
		employeelist[2]= "Abhay";
		employeelist[3]= "Amruta";
		
		for(String employees: employeelist) {
			System.out.println(employees);
		}
		
		System.out.println("Employee which is listed on second index position" +employeelist[2]);
		System.out.println("********* using simple for ******");
		for(int i=0; i<employeelist.length; i++) {
			System.out.println(employeelist[i]);
		}
	}
	
	

}
