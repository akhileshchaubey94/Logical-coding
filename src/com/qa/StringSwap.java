package com.qa;

public class StringSwap {
	public static void main(String[] args) {
		
		// with Third Variable
		String a= "AKhilesh";
		String b= "Chaubey";
		
		
		//  String c;
		  
		//  c=a; 
		//  a=b; 
		//  b=c; 
		  System.out.println(a);
		 System.out.println(b);
		 
		 a=a+b;
		 b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		 System.out.println(a);
		 System.out.println(b);
	}

}
