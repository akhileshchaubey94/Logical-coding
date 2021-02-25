package com.qa;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		//With Using third Variable: z
		
		
		//  int z; 
		 // z = x; 
		//  x = y; 
		//  y = z; 
		  System.out.println(x); 
		  System.out.println(y);
		 
		
		//1. Without using third variable: Using operator
		
	//	x=x+y;
	//	y=x-y;
	//	x=x-y;
	//	System.out.println(x);
	//	System.out.println(y);
		
		//2. Without Using Third Variable:Using * operator
		
		x = x * y;
		y = x/y;
		x = x/y;
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
