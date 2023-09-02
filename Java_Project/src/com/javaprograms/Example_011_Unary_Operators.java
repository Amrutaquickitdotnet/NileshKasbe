package com.javaprograms;

public class Example_011_Unary_Operators {
// Boolean is data type used for conditional based 
	public static void main(String[] args) {
		int c = 12;
		System.out.println(c++);//13 post increment 
		System.out.println(++c);//14
		
		System.out.println(c--);//13 post Decrement 
		System.out.println(--c);//12
		
		
//		&& (if a &&b) [ true]
//		||(if a||b) ( if One of them going answer true)
		//! !(a<b)[ return false if a is smaller than b    10<12
		
		int a =10, b = 20, d = 20, e =0;
		if((a<b)&& (b==d))//10<20 && 20=20    T && T  T
		{
			
			d = a+b+d;
			System.out.println("The sum is "+ d);
		}else {
			System.out.println("False Conditon");
		}
		
		int f = 32;
		int g = 43;
		
		System.out.println(!(f<g));// 32 <43 (!T)= False
		
	}

}
