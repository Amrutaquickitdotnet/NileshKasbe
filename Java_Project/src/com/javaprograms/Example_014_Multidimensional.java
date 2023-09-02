package com.javaprograms;

public class Example_014_Multidimensional {

	public static void main(String[] args) {
		
		int arr[][]= {
				
				{1,2,3},
				{2,7,5},
				{4,4,5},
				
		};
		
		//printing 2d array
		for(int j=0; j<3; j++)
		{
			for(int i=0; i<3; i++) 
			{
				System.out.print(arr[j][i]+ "");
			}
			System.out.println(" ");
		}
		System.out.println(arr[1][1]);
	}
	
	

}
