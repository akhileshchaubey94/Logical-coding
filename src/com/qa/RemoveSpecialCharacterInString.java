package com.qa;

public class RemoveSpecialCharacterInString {
	
	public static void main(String[] args) {
		String s="!@#$%Learning)(*& Selenium4567";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
