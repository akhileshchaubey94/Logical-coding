package com.qa;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s="Akhilesh";
		
		// 1. Using for loop
		int len=s.length();
		String rev=" ";
		
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		// 2. Using StringBuffer class
		StringBuffer sb= new StringBuffer(s);
		
		System.out.println(sb.reverse());
	}

}
