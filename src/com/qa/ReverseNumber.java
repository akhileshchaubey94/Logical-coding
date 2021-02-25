package com.qa;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		// 1. using algo
		int num= 123456;
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num= num/10;
			
		}
		System.out.println(rev);
		// 2. Using String Buffer Method
		
		int num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
